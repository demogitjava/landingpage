package de.jgsoftware.landingpage.dao;

import de.jgsoftware.landingpage.dao.interfaces.demodb.Int_m_webtextlayout;
import de.jgsoftware.landingpage.dao.interfaces.i_dao_admin;
import de.jgsoftware.landingpage.dao.interfaces.shopdb.i_jpa_webtextlayout;
import de.jgsoftware.landingpage.model.dashboardgraphicline;
import de.jgsoftware.landingpage.model.m_webtextlayout;
import de.jgsoftware.landingpage.model.useragent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

import de.jgsoftware.landingpage.dao.interfaces.demodb.j_jpa_users;

@Repository
public class Dao_admin implements i_dao_admin
{

    @Autowired
    @Qualifier(value = "shopJdbcTemplate")
    JdbcTemplate jtm2;


    @Autowired
    @Qualifier(value = "defaultJdbcTemplate")
    JdbcTemplate jtm;
    
    /*
            Crud Interface -> de.jgsoftware.landingpage.model.m_webtextlayout
     */
    @Autowired
    Int_m_webtextlayout int_mwebtextlayout;


    @Autowired
    i_jpa_webtextlayout ijpashopwebtextlayout;
    
    
    @Autowired
    j_jpa_users ijpausers;
    

    @Override
    public void saveFormModalData(m_webtextlayout webtextlayout)
    {

        int_mwebtextlayout.save(webtextlayout);

    }


    // returns all entriys from Table
    @Override
    public List<m_webtextlayout> getPageLanguageText()
    {
        //List<m_webtextlayout> webtextlayouts = jtm2.query("select * from webtextlayout", new BeanPropertyRowMapper(m_webtextlayout.class));
        //ijpashopwebtextlayout.findAll();
        List<m_webtextlayout> webtextlayouts = (List) ijpashopwebtextlayout.findAll();


        return webtextlayouts;
    }


    // return Navbar Items to DemoPageController
    @Override
    public List<m_webtextlayout> getWebtextentriys()
    {
        
        // manuell query jtm2 shopdb
        //List<m_webtextlayout> pagenavbar = jtm2.query("select * from webtextlayout", new BeanPropertyRowMapper(m_webtextlayout.class));
        List<m_webtextlayout> pagenavbar = (List) ijpashopwebtextlayout.findAll();

        return pagenavbar;
    }


    @Override
    public Integer getusercount()
    {
        // manuel query demodb
        //Integer usercount = jtm.queryForObject("select count(id) from users", Integer.class);
        
        long lusercount = ijpausers.count();
        Integer usercount = Long.valueOf(lusercount).intValue();
        return usercount;
    }

    @Override
    public Integer getconnectsmonth()
    {
        Integer connectsmonth = jtm.queryForObject("select count(id) from users", Integer.class);
        return connectsmonth;
    }


    @Override
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
    @Override
    public List countofyear()
    {
        List<useragent> countmonth = jtm.query(
                "select count(datum) as count, EXTRACT(MONTH FROM datum) as MONTH, EXTRACT(YEAR FROM datum) as YEAR from useragent group by MONTH, YEAR", new BeanPropertyRowMapper(useragent.class));
        return countmonth;
    }

    /**
     *
     * @return
     */
    @Override
    public List allgetBrowserconnects()
    {
      
       /*
            select \n" +
            "count(stbrowser), \n" +
            "stbrowser,\n" +
            "stsystem,\n" +
            "EXTRACT(MONTH FROM datum) as month,\n" +
            "EXTRACT(YEAR FROM datum) as year\n" +
            "from useragent group by stbrowser, month, year, stsystem
        
        */
        List<useragent> allbrowserconnects = jtm.query(
                "select count(stbrowser), stbrowser, stsystem, EXTRACT(MONTH FROM datum) as month, EXTRACT(YEAR FROM datum) as year from useragent group by stbrowser, month, year, stsystem", new BeanPropertyRowMapper(useragent.class));
        
        return allbrowserconnects;
    }
    
    
    // List allconnectsbymonth();
    @Override
    public List  allconnectsbymonth()
    {
      
      
        List<useragent> allconnectsbymonth = jtm.query(
                "select count(stbrowser), stbrowser, stsystem, EXTRACT(MONTH FROM datum) as month, EXTRACT(YEAR FROM datum) as year from useragent group by stbrowser, month, year, stsystem order by current_date", new BeanPropertyRowMapper(useragent.class));
        
        return allconnectsbymonth;
    }
    
    
    
    
    /*
    
           public List<MKundenstamm> getCustomerbyname(String customername)
    {
        String beginswith = customername + "%";
        List<MKundenstamm> customerlist = jtm.query("select * from kundenstamm where kundenname like " + "'" + beginswith + "'", new BeanPropertyRowMapper(MKundenstamm.class));
        return customerlist;
    }
    
    */
    @Override
    public Long connectsmonthnavbar(int month, int year)
    {
      
        
        long navbarmonth = jtm.queryForObject("select count(id) from useragent WHERE month(datum) = " + "'" + month + "'" + " and year(datum) = " + "'" + year + "'", Long.class);

      
       // List<useragent> connectsmonthnavbar = jtm.query(
         //       "select count(id) from useragent WHERE month(datum) = " + "'" + month + "'" + " and year(datum) = " + "'" + year + "'", new BeanPropertyRowMapper(useragent.class));
        return navbarmonth;
    }
    
    @Override
    public Long connectsnavbaryear(int year)
    {
       // List<useragent> connectsnavbaryear = jtm.query(
         //       "select count(stbrowser) from useragent WHERE year(datum) = +" + "'" + year + "'", new BeanPropertyRowMapper(useragent.class));
        
       long connavyear = jtm.queryForObject("select count(stbrowser) from useragent WHERE year(datum) = +" + "'" + year + "'", Long.class);
       return connavyear;
    }
    
    @Override
    public List connectsnavbargraphicalyear(int year)
    {
        
         List<dashboardgraphicline> connectsnavbargraphicalyear = jtm.query(
                "select count(stbrowser) as count, EXTRACT(MONTH FROM datum) as month, EXTRACT(YEAR FROM datum) as year from useragent WHERE year(datum) = " + "'" + year + "'" + " group by month, year order by current_date", new BeanPropertyRowMapper(dashboardgraphicline.class));
        return connectsnavbargraphicalyear;
       
    }

}