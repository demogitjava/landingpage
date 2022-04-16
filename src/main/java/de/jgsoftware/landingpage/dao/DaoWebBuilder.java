package de.jgsoftware.landingpage.dao;


import de.jgsoftware.landingpage.dao.interfaces.web.iDaoWebBuilder;
import de.jgsoftware.landingpage.model.m_bootstrap_components;
import de.jgsoftware.landingpage.model.m_webtextlayout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.FileWriter;
import java.util.List;

@Repository
public class DaoWebBuilder implements iDaoWebBuilder
{

    @Autowired
    @Qualifier(value = "shopJdbcTemplate")
    JdbcTemplate jtm2;

    File fhtml;

    private String demopage = null;

    // returns all entries from Table
    @Override
    public List<m_webtextlayout> getPageLanguageText()
    {
        List<m_webtextlayout> webtextlayouts = jtm2.query("select * from webtextlayout", new BeanPropertyRowMapper(m_webtextlayout.class));

        return webtextlayouts;
    }


    // returns all entries from stored Bootstrap Compoents
    // with ${ value } for mapping to Theamyleaf
    @Override
    public List<m_bootstrap_components> getBootstrapComponents()
    {


        // SqlRowSet rs = select.queryForRowSet(query, new HashMap<String, Object>());
        List<m_bootstrap_components> bootstrap_comonents = jtm2.query("select * from BOOTSTRAP_COMPONENTS", new BeanPropertyRowMapper(m_bootstrap_components.class));

        return bootstrap_comonents;
    }


    /*
      include demopage as default
      to grapesjs editor
   */
    @Override
    public String loaddefaultpagetograpesjs()
    {
        demopage = "bodycontent.html";

        return demopage;

    }

    @Override
    public String loadheader()
    {
        demopage = "header.html";
        return demopage;

    }
    @Override
    public String loadfooter()
    {
        demopage = "footer.html";
        return demopage;

    }

    @Override
    public String
    savehtmlandcss(String gjshtml, String gjscss, String language, String component)
    {

        ///target/classes/templates/  for local debug
        String fileLocation = new File("root/IdeaProjects/landingpage/target/classes/templates/").getAbsolutePath() + "/" + language +  "/" + language + "_" + component + ".html";
        fhtml = new File(language + "_" + component + ".html");
        try {

            FileWriter myWriter = new FileWriter(fileLocation);
            myWriter.write(gjshtml);
            myWriter.close();

        } catch (Exception e)
        {
            e.printStackTrace();
        }


        return "shtmlandcss";
    }

}
