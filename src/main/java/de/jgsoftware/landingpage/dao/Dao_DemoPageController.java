package de.jgsoftware.landingpage.dao;


import de.jgsoftware.landingpage.dao.interfaces.shopdb.IDaoDemoPageController;
import de.jgsoftware.landingpage.dao.interfaces.shopdb.i_jpa_bootstrap_components;
import de.jgsoftware.landingpage.dao.interfaces.shopdb.i_jpa_laendercodes;
import de.jgsoftware.landingpage.dao.interfaces.shopdb.i_jpa_webtextlayout;
import de.jgsoftware.landingpage.dao.interfaces.demodb.j_jpa_useragent;
import de.jgsoftware.landingpage.model.jpa.demodb.Useragent;

import de.jgsoftware.landingpage.model.jpa.shopdb.BootstrapComponents;

import de.jgsoftware.landingpage.model.jpa.shopdb.m_webtextlayout;

import de.jgsoftware.landingpage.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;
import de.jgsoftware.landingpage.model.areacodes;

import de.jgsoftware.landingpage.model.useragent;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import org.apache.catalina.Manager;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author hoscho
 */

@Repository
public class Dao_DemoPageController implements IDaoDemoPageController
{

    @Autowired
    @Qualifier(value = "shopJdbcTemplate")
    JdbcTemplate jtm2;


    // demodb
    @Autowired
    @Qualifier(value = "defaultJdbcTemplate")
    JdbcTemplate jtm;


    @Lazy
    @Autowired
    IndexService sdemowebtext;

    
   
    @Autowired
    DataSource datasource2;
    
    @Autowired
    j_jpa_useragent ijpauseragent;
    
    
    @Autowired
    i_jpa_webtextlayout ijpashopwebtextlayout;

    @Autowired
    i_jpa_bootstrap_components ijpashopbootstrapcomponents;
  
    @Autowired
    i_jpa_laendercodes ijpashoplaendercodes;

    // returns all entriys from Table
    @Override
    public List<m_webtextlayout> getPageLanguageText()
    {
        
        // manual JdbcTemplate
        //List<m_webtextlayout> webtextlayouts = jtm2.query("select * from webtextlayout", new BeanPropertyRowMapper(m_webtextlayout.class));
       
        List<m_webtextlayout> webtextlayouts = (List) ijpashopwebtextlayout.findAll();
        
        return webtextlayouts;
    }


    // returns all entriys from stored Bootstrap Compoents
    // with ${ value } for mapping to Theamyleaf
    @Override
    public List<BootstrapComponents> getBootstrapComponents()
    {

        // query("select * from bootstrap_components", new BeanPropertyRowMapper(m_bootstrap_comonents.class));
        // SqlRowSet rs = select.queryForRowSet(query, new HashMap<String, Object>());
        

        
        // manuel Query over jdbc Tempalte with jtm
        //List<BootstrapComponents> bootstrap_comonents = jtm2.query("select * from BOOTSTRAP_COMPONENTS", new BeanPropertyRowMapper(BootstrapComponents.class));
       
        List<BootstrapComponents> bootstrap_comonents = (List) ijpashopbootstrapcomponents.findAll();
        
        return bootstrap_comonents;
    }


    // return list from country where in the eu
    @Override
    public List<areacodes> areacodes_eu()
    {
        // manuel sql query 
        // JdbcTemplate jtm
        //List<areacodes> areacodes = jtm2.query("SELECT * FROM LEANDERCODES where EU = 1", new BeanPropertyRowMapper(areacodes.class));
        List<areacodes> areacodes = (List) ijpashoplaendercodes.findcodesonlyeu();
        return areacodes;
    }


    @Override
    public Useragent saveuseragent(Useragent muagent)
    {

       // manuel Query JdbcTempalte jtm
       // Long countid = jtm.queryForObject("SELECT COUNT (*) FROM useragent", Long.class);
          
        Long countid2 = (Long) ijpauseragent.count();
        Integer countid = countid2.intValue();  // convert long to Integer
        if(countid == 0)
        {
           // countid = Long.valueOf(1);
            countid = 1;
            muagent.setId(countid);
        }
        else if(countid > 0)
        {
            Integer l = countid + 1;
            muagent.setId(l);
        }


        jtm.update("insert into useragent " +
                        "(id, ipaddress, stbrowser, stbrowserversion, stsystem, stlanguage, datum, timestamp) " +
                        "values (?, ?, ?, ?, ?, ?, ?, ?)",
                muagent.getId(),
                muagent.getIpAddress(),
                muagent.getStbrowser(),
                muagent.getStbrowserversion(),
                muagent.getStsystem(),
                muagent.getStlanguage(),
                muagent.getDatum(),
                muagent.getDatum());


        return muagent;
    }
}

