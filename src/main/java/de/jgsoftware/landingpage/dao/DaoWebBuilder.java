package de.jgsoftware.landingpage.dao;


import de.jgsoftware.landingpage.model.m_webtextlayout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import de.jgsoftware.landingpage.dao.interfaces.web.iDaoWebBuilder;

import de.jgsoftware.landingpage.model.m_bootstrap_components;

import java.util.List;

@Repository
public class DaoWebBuilder implements iDaoWebBuilder
{

    @Autowired
    @Qualifier(value = "shopJdbcTemplate")
    JdbcTemplate jtm2;




    @Override
    public List<m_bootstrap_components> getallbtcomp()
    {
        List<m_bootstrap_components> lbtcomp = jtm2.query("select * from bootstrap_components", new BeanPropertyRowMapper(m_bootstrap_components.class));

        return lbtcomp;
    }
}
