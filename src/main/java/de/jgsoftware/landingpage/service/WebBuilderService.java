package de.jgsoftware.landingpage.service;

import de.jgsoftware.landingpage.service.interfaces.iWebBuilderService;
import de.jgsoftware.landingpage.dao.interfaces.web.iDaoWebBuilder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class WebBuilderService implements iWebBuilderService
{

    @Autowired
    iDaoWebBuilder iDaoWebBuilder;


    private String demopage = null;



    @Override
    public de.jgsoftware.landingpage.dao.interfaces.web.iDaoWebBuilder getiDaoWebBuilder() {
        return iDaoWebBuilder;
    }

    @Override
    public void setiDaoWebBuilder(de.jgsoftware.landingpage.dao.interfaces.web.iDaoWebBuilder iDaoWebBuilder) {
        this.iDaoWebBuilder = iDaoWebBuilder;
    }




    /*
            load fr components
     */
    @Override
    public String frloadcontent()
    {
        demopage = "/fr/fr_body.html";

        return demopage;

    }

    @Override
    public String frloadheader()
    {
        demopage = "/fr/fr_header.html";

        return demopage;

    }
    @Override
    public String frloadfooter()
    {
        demopage = "/fr/fr_footer.html";

        return demopage;

    }

    /*
        load en components
     */
    @Override
    public String enloadcontent()
    {
        demopage = "/en/en_body.html";
        return demopage;

    }

    @Override
    public String enloadheader()
    {
        demopage = "/en/en_header.html";
        return demopage;

    }
    @Override
    public String enloadfooter()
    {
        demopage = "/en/en_footer.html";
        return demopage;

    }

    /*
        load es components
     */
    @Override
    public String esloadcontent()
    {
        demopage = "/es/es_body.html";
        return demopage;

    }

    @Override
    public String esloadheader()
    {
        demopage = "/es/es_header.html";
        return demopage;

    }
    @Override
    public String esloadfooter()
    {
        demopage = "/es/es_footer.html";
        return demopage;

    }

    /*
        load it components
     */
    @Override
    public String itloadcontent()
    {
        demopage = "/it/it_body.html";
        return demopage;

    }

    @Override
    public String itloadheader()
    {
        demopage = "/it/it_header.html";
        return demopage;

    }
    @Override
    public String itloadfooter()
    {
        demopage = "/it/it_footer.html";
        return demopage;

    }


    /*
       load tr components
    */
    @Override
    public String trloadcontent()
    {
        demopage = "/tr/tr_body.html";
        return demopage;

    }

    @Override
    public String trloadheader()
    {
        demopage = "/tr/tr_header.html";
        return demopage;

    }
    @Override
    public String trloadfooter()
    {
        demopage = "/tr/tr_footer.html";
        return demopage;

    }


}
