package de.jgsoftware.landingpage.dao;


import de.jgsoftware.landingpage.dao.interfaces.i_DAO_EN;
import de.jgsoftware.landingpage.dao.interfaces.shopdb.i_jpa_bootstrap_components;
import de.jgsoftware.landingpage.dao.interfaces.shopdb.i_jpa_webtextlayout;

import de.jgsoftware.landingpage.model.jpa.shopdb.BootstrapComponents;
//import de.jgsoftware.landingpage.model.m_bootstrap_components;


import de.jgsoftware.landingpage.model.jpa.shopdb.Webtextlayout;
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
public class EN_DAO implements i_DAO_EN
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
    public List<Webtextlayout> getPageLanguageText()
    {
        
        // jdbc Tempalte jtm2 shop manuel query
        //List<m_webtextlayout> webtextlayouts = jtm2.query("select * from webtextlayout", new BeanPropertyRowMapper(m_webtextlayout.class));

        List<Webtextlayout> webtextlayouts = (List) ijpashopwebtextlayout.findAll();
          
        return webtextlayouts;
    }


    // returns all entriys from stored Bootstrap Compoents
    // with ${ value } for mapping to Theamyleaf

    /**
     *
     * @return
     */
    @Override
    public List<BootstrapComponents> getBootstrapComponents()
    {

        // query("select * from bootstrap_components", new BeanPropertyRowMapper(m_bootstrap_comonents.class));

        // SqlRowSet rs = select.queryForRowSet(query, new HashMap<String, Object>());
        
         // menual query jdbcTemplate jtm2 shop db
        //List<m_bootstrap_components> bootstrap_comonents = jtm2.query("select * from BOOTSTRAP_COMPONENTS", new BeanPropertyRowMapper(m_bootstrap_components.class));

        // ijpashopbootstrapcomponents
        List<BootstrapComponents> bootstrap_comonents = (List) ijpashopbootstrapcomponents.findAll();

        return bootstrap_comonents;
    }
}
