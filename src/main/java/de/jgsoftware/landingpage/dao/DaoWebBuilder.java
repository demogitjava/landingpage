package de.jgsoftware.landingpage.dao;


import de.jgsoftware.landingpage.dao.interfaces.shopdb.iDaoWebBuilder;
import de.jgsoftware.landingpage.dao.interfaces.shopdb.i_jpa_bootstrap_components;
import de.jgsoftware.landingpage.dao.interfaces.shopdb.i_jpa_webtextlayout;
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

/**
 *
 * @author hoscho
 */

@Repository
public class DaoWebBuilder implements iDaoWebBuilder
{

    @Autowired
    @Qualifier(value = "shopJdbcTemplate")
    JdbcTemplate jtm2;

    File fhtml;

    private String demopage = null;
    
    
     @Autowired
    i_jpa_webtextlayout ijpashopwebtextlayout;
    
     
     @Autowired
    i_jpa_bootstrap_components ijpashopbootstrapcomponents;

    // returns all entries from Table
    @Override
    public List<m_webtextlayout> getPageLanguageText()
    {
        
        // manuel Query jdbc Tempalte shopdb
        //List<m_webtextlayout> webtextlayouts = jtm2.query("select * from webtextlayout", new BeanPropertyRowMapper(m_webtextlayout.class));

        
        List<m_webtextlayout> webtextlayouts = (List) ijpashopwebtextlayout.findAll();

        return webtextlayouts;
    }


    // returns all entries from stored Bootstrap Compoents
    // with ${ value } for mapping to Theamyleaf
    @Override
    public List<m_bootstrap_components> getBootstrapComponents()
    {


        // SqlRowSet rs = select.queryForRowSet(query, new HashMap<String, Object>());
        
        // jdbc query jdbc Tempalte jtm2 shopdb
        //List<m_bootstrap_components> bootstrap_comonents = jtm2.query("select * from BOOTSTRAP_COMPONENTS", new BeanPropertyRowMapper(m_bootstrap_components.class));

        
        
        // ijpashopbootstrapcomponents
        List<m_bootstrap_components> bootstrap_comonents = (List) ijpashopbootstrapcomponents.findAll();

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
    public String loadcontact()
    {
        demopage = "contact.html";
        return demopage;
    }

    @Override
    public String loadservicehtml()
    {
        demopage = "service.html";
        return demopage;
    }


    @Override
    public String loadabouthtml()
    {
        demopage = "about.html";
        return demopage;
    }



    @Override
    public String savehtmlandcss(String gjshtml, String gjscss, String language, String component)
    {

        ///target/classes/templates/  for local debug
        String fileLocation = new File("root/landingpage-0.0.1-SNAPSHOT.jar/classes/templates/").getAbsolutePath() + "/" + language +  "/" + language + "_" + component + ".html";

        String filename = new String(language + "_" + component + ".html");
        if (filename.equals("_about.html"))
        {
            fileLocation = new File("root/landingpage-0.0.1-SNAPSHOT.jar/classes/templates/").getAbsolutePath() + "/" + component + ".html";
            filename = "about.html";
        }
        else if(filename.equals("_service.html"))
        {
            fileLocation = new File("root/landingpage-0.0.1-SNAPSHOT.jar/classes/templates/").getAbsolutePath() + "/" + component + ".html";
            filename = "service.html";
        }
        else if(filename.equals("_contact.html"))
        {
            fileLocation = new File("root/landingpage-0.0.1-SNAPSHOT.jar/target/classes/templates/").getAbsolutePath() + "/" + component + ".html";
            filename = "contact.html";
        }
        else if(filename.equals("contact.html"))
        {
            fileLocation = new File("root/landingpage-0.0.1-SNAPSHOT.jar/target/classes/templates/").getAbsolutePath() + "/" + component + ".html";
            filename = "contact.html";
        }
        
        fhtml = new File(filename);



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
