package de.jgsoftware.landingpage.dao;


import de.jgsoftware.landingpage.dao.interfaces.web.IDaoDemoPageController;
import de.jgsoftware.landingpage.dao.interfaces.web.IUserAgent;
import de.jgsoftware.landingpage.model.m_bootstrap_components;
import de.jgsoftware.landingpage.model.m_webtextlayout;
import de.jgsoftware.landingpage.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import de.jgsoftware.landingpage.model.areacodes;

import de.jgsoftware.landingpage.model.useragent;



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
    IUserAgent iuseragent;


    // returns all entriys from Table
    public List<m_webtextlayout> getPageLanguageText()
    {
        List<m_webtextlayout> webtextlayouts = jtm2.query("select * from webtextlayout", new BeanPropertyRowMapper(m_webtextlayout.class));
        return webtextlayouts;
    }


    // returns all entriys from stored Bootstrap Compoents
    // with ${ value } for mapping to Theamyleaf
    @Override
    public List<m_bootstrap_components> getBootstrapComponents()
    {

        // query("select * from bootstrap_components", new BeanPropertyRowMapper(m_bootstrap_comonents.class));

        // SqlRowSet rs = select.queryForRowSet(query, new HashMap<String, Object>());
        List<m_bootstrap_components> bootstrap_comonents = jtm2.query("select * from BOOTSTRAP_COMPONENTS", new BeanPropertyRowMapper(m_bootstrap_components.class));
        return bootstrap_comonents;
    }


    // return list from country where in the eu
    @Override
    public List<areacodes> areacodes_eu()
    {
        List<areacodes> areacodes = jtm2.query("SELECT * FROM LEANDERCODES where EU = 1", new BeanPropertyRowMapper(areacodes.class));
        return areacodes;
    }


    @Override
    public useragent saveuseragent(useragent muagent)
    {

       // iuseragent.save(muagent);


        return muagent;
    }
}

