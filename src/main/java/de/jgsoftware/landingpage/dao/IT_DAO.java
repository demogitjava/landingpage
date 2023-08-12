package de.jgsoftware.landingpage.dao;

import de.jgsoftware.landingpage.dao.interfaces.i_DAO_IT;
import de.jgsoftware.landingpage.dao.interfaces.shopdb.i_jpa_bootstrap_components;
import de.jgsoftware.landingpage.dao.interfaces.shopdb.i_jpa_webtextlayout;
import de.jgsoftware.landingpage.model.jpa.shopdb.BootstrapComponents;
import de.jgsoftware.landingpage.model.m_webtextlayout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 *
 * @author hoscho
 */

@Repository
public class IT_DAO implements i_DAO_IT
{

    @Autowired
    @Qualifier(value = "shopJdbcTemplate")
    JdbcTemplate jtm2;
    
    
      
    @Autowired
    i_jpa_webtextlayout ijpashopwebtextlayout;
    
    @Autowired
    i_jpa_bootstrap_components ijpashopbootstrapcomponents;

    


    // returns all entriys from Table
    @Override
    public List<m_webtextlayout> getPageLanguageText()
    {
        
        //manuel Query jdbcTempalte jtm2 shopdb
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
        
        // manuel Query jdbcTemplate jtm2 shopdb 
        //List<m_bootstrap_components> bootstrap_comonents = jtm2.query("select * from BOOTSTRAP_COMPONENTS", new BeanPropertyRowMapper(m_bootstrap_components.class));

         List<BootstrapComponents> bootstrap_comonents = ijpashopbootstrapcomponents.findAll();

        
        return bootstrap_comonents;
    }
}
