package de.jgsoftware.landingpage.dao;

import de.jgsoftware.landingpage.dao.interfaces.Int_m_webtextlayout;
import de.jgsoftware.landingpage.model.m_webtextlayout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import de.jgsoftware.landingpage.dao.interfaces.i_dao_admin;

import java.util.List;

import de.jgsoftware.landingpage.model.Users;

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







}
