package de.jgsoftware.landingpage.dao;

import de.jgsoftware.landingpage.dao.interfaces.Int_m_webtextlayout;
import de.jgsoftware.landingpage.dao.interfaces.i_dao_admin;
import de.jgsoftware.landingpage.model.m_webtextlayout;
import de.jgsoftware.landingpage.model.useragent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Dao_admin implements i_dao_admin
{

    @Autowired
    @Qualifier(value = "shopJdbcTemplate")
    private JdbcTemplate jtm2;


    @Autowired
    @Qualifier(value = "defaultJdbcTemplate")
    JdbcTemplate jtm;

    /*
            Crud Interface -> de.jgsoftware.landingpage.model.m_webtextlayout
     */
    @Autowired
    Int_m_webtextlayout int_mwebtextlayout;

    @Override
    public void saveFormModalData(m_webtextlayout webtextlayout)
    {

        int_mwebtextlayout.save(webtextlayout);

    }


    // returns all entriys from Table
    @Override
    public List<m_webtextlayout> getPageLanguageText()
    {
        List<m_webtextlayout> webtextlayouts = jtm2.query("select * from webtextlayout", new BeanPropertyRowMapper(m_webtextlayout.class));

        return webtextlayouts;
    }


    // return Navbar Items to DemoPageController
    @Override
    public List<m_webtextlayout> getWebtextentriys()
    {
        List<m_webtextlayout> pagenavbar = jtm2.query("select * from webtextlayout", new BeanPropertyRowMapper(m_webtextlayout.class));

        return pagenavbar;
    }


    @Override
    public Integer getusercount()
    {

        Integer usercount = jtm.queryForObject("select count(id) from users", Integer.class);
        return usercount;
    }

    @Override
    public Integer getconnectsmonth()
    {
        Integer connectsmonth = jtm.queryForObject("select count(id) from users", Integer.class);
        return connectsmonth;
    }



    public List loadbrowserconnectmonth()
    {
        List<useragent> connectsmonth = jtm.query(
                "select count(datum) as count, \n" +
                        "EXTRACT(MONTH FROM datum) as monat,\n" +
                        "EXTRACT(YEAR FROM datum) as JAHR\n" +
                        "from useragent\n" +
                        "group by monat, jahr", new BeanPropertyRowMapper(useragent.class));

        return connectsmonth;
    }



    /*
            return count of connect
            by year
     */
    public List countofyear()
    {
        List<useragent> countmonth = jtm.query(
                "select count(datum) as count, EXTRACT(MONTH FROM datum) as MONTH, EXTRACT(YEAR FROM datum) as YEAR from useragent group by MONTH, YEAR", new BeanPropertyRowMapper(useragent.class));
        return countmonth;
    }




}
