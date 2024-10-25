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
import java.io.IOException;
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
        
        switch(filename)
        {
            case "_about.html":
            {
                fileLocation = new File("root/landingpage-0.0.1-SNAPSHOT.jar/classes/templates/").getAbsolutePath() + "/" + component + ".html";
                filename = "about.html";
                break;
            }
            case "_service.html":
            {
                fileLocation = new File("root/landingpage-0.0.1-SNAPSHOT.jar/classes/templates/").getAbsolutePath() + "/" + component + ".html";
                filename = "service.html";
                break;
            }
            case "_contact.html":
            {
                fileLocation = new File("root/landingpage-0.0.1-SNAPSHOT.jar/target/classes/templates/").getAbsolutePath() + "/" + component + ".html";
                filename = "contact.html";
                break;
            }
            case "contact.html":
            {
                fileLocation = new File("root/landingpage-0.0.1-SNAPSHOT.jar/target/classes/templates/").getAbsolutePath() + "/" + component + ".html";
                filename = "contact.html";
                break;
            }
            case "about.html":
            {
                fileLocation = new File("root/landingpage-0.0.1-SNAPSHOT.jar/target/classes/templates/").getAbsolutePath() + "/" + component + ".html";
                filename = "about.html";
                break;
            }
            case "service.html":
            {
                fileLocation = new File("root/landingpage-0.0.1-SNAPSHOT.jar/target/classes/templates/").getAbsolutePath() + "/" + component + ".html";
                filename = "service.html";
                break;
            }
            case "wiki.html":
            {
                fileLocation = new File("root/landingpage-0.0.1-SNAPSHOT.jar/target/classes/templates/").getAbsolutePath() + "/" + component + ".html";
                filename = "wiki.html";
                break;
            }
            
            
            
            
            /*
                language pages
                DESKTOP
            */
            
            /*
                DE
            */
            case "de_body.html":
            {
                fileLocation = new File("root/landingpage-0.0.1-SNAPSHOT.jar/target/classes/templates/de").getAbsolutePath() + "/" + component + ".html";
                filename = "de_body.html";
                break;
            }
            case "de_footer.html":
            {
                fileLocation = new File("root/landingpage-0.0.1-SNAPSHOT.jar/target/classes/templates/de").getAbsolutePath() + "/" + component + ".html";
                filename = "de_footer.html";
                break;
            }
            case "de_header.html":
            {
                fileLocation = new File("root/landingpage-0.0.1-SNAPSHOT.jar/target/classes/templates/de").getAbsolutePath() + "/" + component + ".html";
                filename = "de_header.html";
                break;
            }
            case "de_mobile-header.html":
            {
                fileLocation = new File("root/landingpage-0.0.1-SNAPSHOT.jar/target/classes/templates/de").getAbsolutePath() + "/" + component + ".html";
                filename = "de_mobile-header.html";
                break;
            }
            
            /*
               EN     
            */
            case "en_body.html":
            {
                fileLocation = new File("root/landingpage-0.0.1-SNAPSHOT.jar/target/classes/templates/en").getAbsolutePath() + "/" + component + ".html";
                filename = "en_body.html";
                break;
            }
            case "en_footer.html":
            {
                fileLocation = new File("root/landingpage-0.0.1-SNAPSHOT.jar/target/classes/templates/en").getAbsolutePath() + "/" + component + ".html";
                filename = "en_footer.html";
                break;
            }
            case "en_header.html":
            {
                fileLocation = new File("root/landingpage-0.0.1-SNAPSHOT.jar/target/classes/templates/en").getAbsolutePath() + "/" + component + ".html";
                filename = "en_header.html";
                break;
            }
            case "en_mobile-header.html":
            {
                fileLocation = new File("root/landingpage-0.0.1-SNAPSHOT.jar/target/classes/templates/en").getAbsolutePath() + "/" + component + ".html";
                filename = "en_mobile-header.html";
                break;
            }
            
            /*
                ES
            
            */
            case "es_body.html":
            {
                fileLocation = new File("root/landingpage-0.0.1-SNAPSHOT.jar/target/classes/templates/es").getAbsolutePath() + "/" + component + ".html";
                filename = "es_body.html";
                break;
            }
            case "es_footer.html":
            {
                fileLocation = new File("root/landingpage-0.0.1-SNAPSHOT.jar/target/classes/templates/es").getAbsolutePath() + "/" + component + ".html";
                filename = "es_footer.html";
                break;
            }
            case "es_header.html":
            {
                fileLocation = new File("root/landingpage-0.0.1-SNAPSHOT.jar/target/classes/templates/es").getAbsolutePath() + "/" + component + ".html";
                filename = "es_header.html";
                break;
            }
            case "es_mobile-header.html":
            {
                fileLocation = new File("root/landingpage-0.0.1-SNAPSHOT.jar/target/classes/templates/es").getAbsolutePath() + "/" + component + ".html";
                filename = "es_mobile-header.html";
                break;
            }
            
            /*
                FR
            */
            
            case "fr_body.html":
            {
                fileLocation = new File("root/landingpage-0.0.1-SNAPSHOT.jar/target/classes/templates/fr").getAbsolutePath() + "/" + component + ".html";
                filename = "fr_body.html";
                break;
            }
            case "fr_footer.html":
            {
                fileLocation = new File("root/landingpage-0.0.1-SNAPSHOT.jar/target/classes/templates/fr").getAbsolutePath() + "/" + component + ".html";
                filename = "fr_footer.html";
                break;
            }
            case "fr_header.html":
            {
                fileLocation = new File("root/landingpage-0.0.1-SNAPSHOT.jar/target/classes/templates/fr").getAbsolutePath() + "/" + component + ".html";
                filename = "fr_header.html";
                break;
            }
            case "fr_mobile-header.html":
            {
                fileLocation = new File("root/landingpage-0.0.1-SNAPSHOT.jar/target/classes/templates/fr").getAbsolutePath() + "/" + component + ".html";
                filename = "fr_mobile-header.html";
                break;
            }
            
            /*
                IT
            */
            case "it_body.html":
            {
                fileLocation = new File("root/landingpage-0.0.1-SNAPSHOT.jar/target/classes/templates/it").getAbsolutePath() + "/" + component + ".html";
                filename = "it_body.html";
                break;
            }
            case "it_footer.html":
            {
                fileLocation = new File("root/landingpage-0.0.1-SNAPSHOT.jar/target/classes/templates/it").getAbsolutePath() + "/" + component + ".html";
                filename = "it_footer.html";
                break;
            }
            case "it_header.html":
            {
                fileLocation = new File("root/landingpage-0.0.1-SNAPSHOT.jar/target/classes/templates/it").getAbsolutePath() + "/" + component + ".html";
                filename = "it_header.html";
                break;
            }
            case "it_mobile-header.html":
            {
                fileLocation = new File("root/landingpage-0.0.1-SNAPSHOT.jar/target/classes/templates/it").getAbsolutePath() + "/" + component + ".html";
                filename = "it_mobile-header.html";
                break;
            }
            
            /*
                TR
            */
              case "tr_body.html":
            {
                fileLocation = new File("root/landingpage-0.0.1-SNAPSHOT.jar/target/classes/templates/tr").getAbsolutePath() + "/" + component + ".html";
                filename = "tr_body.html";
                break;
            }
            case "tr_footer.html":
            {
                fileLocation = new File("root/landingpage-0.0.1-SNAPSHOT.jar/target/classes/templates/tr").getAbsolutePath() + "/" + component + ".html";
                filename = "tr_footer.html";
                break;
            }
            case "tr_header.html":
            {
                fileLocation = new File("root/landingpage-0.0.1-SNAPSHOT.jar/target/classes/templates/tr").getAbsolutePath() + "/" + component + ".html";
                filename = "tr_header.html";
                break;
            }
            case "tr_mobile-header.html":
            {
                fileLocation = new File("root/landingpage-0.0.1-SNAPSHOT.jar/target/classes/templates/tr").getAbsolutePath() + "/" + component + ".html";
                filename = "tr_mobile-header.html";
                break;
            }
            
            default: 
                System.out.print("no filename set!" + "\n" + "\n");
                break;
        }
        
        /**
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
        */
        
        
        fhtml = new File(filename);



        try {

            FileWriter myWriter = new FileWriter(fileLocation);
            myWriter.write(gjshtml);
            myWriter.close();

        } catch (IOException e)
        {
            System.out.print("Fehler " +e);
        }


        return "shtmlandcss";
    }

}
