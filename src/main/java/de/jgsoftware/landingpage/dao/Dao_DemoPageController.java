package de.jgsoftware.landingpage.dao;


import de.jgsoftware.landingpage.dao.interfaces.Int_m_webtextlayout;
import de.jgsoftware.landingpage.model.m_bootstrap_components;
import de.jgsoftware.landingpage.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import de.jgsoftware.landingpage.model.m_webtextlayout;

import java.util.List;
import java.io.*;

@Repository
public class Dao_DemoPageController
{


    @Autowired
    @Qualifier(value = "defaultJdbcTemplate")
    JdbcTemplate jtm;

    @Lazy
    @Autowired
    private IndexService sdemowebtext;


    public static String demopage;
    public static String headerpage;


}

