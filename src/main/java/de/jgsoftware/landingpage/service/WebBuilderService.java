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
        demopage = new String("/fr/en_body.html");

        return demopage;

    }

    @Override
    public String frloadheader()
    {
        demopage = new String("/fr/en_header.html");

        return demopage;

    }
    @Override
    public String frloadfooter()
    {
        demopage = new String("/fr/en_footer.html");

        return demopage;

    }

    /*
        load en components
     */
    @Override
    public String enloadcontent()
    {
        demopage = new String("/en/en_body.html");
        return demopage;

    }

    @Override
    public String enloadheader()
    {
        demopage = new String("/en/en_header.html");
        return demopage;

    }
    @Override
    public String enloadfooter()
    {
        demopage = new String("/en/en_footer.html");
        return demopage;

    }

    /*
        load es components
     */
    @Override
    public String esloadcontent()
    {
        demopage = new String("/es/es_body.html");
        return demopage;

    }

    @Override
    public String esloadheader()
    {
        demopage = new String("/es/es_header.html");
        return demopage;

    }
    @Override
    public String esloadfooter()
    {
        demopage = new String("/es/es_footer.html");
        return demopage;

    }

    /*
        load it components
     */
    @Override
    public String itloadcontent()
    {
        demopage = new String("/it/es_body.html");
        return demopage;

    }

    @Override
    public String itloadheader()
    {
        demopage = new String("/it/it_header.html");
        return demopage;

    }
    @Override
    public String itloadfooter()
    {
        demopage = new String("/it/it_footer.html");
        return demopage;

    }


    /*
       load tr components
    */
    @Override
    public String trloadcontent()
    {
        demopage = new String("/tr/tr_body.html");
        return demopage;

    }

    @Override
    public String trloadheader()
    {
        demopage = new String("/tr/tr_header.html");
        return demopage;

    }
    @Override
    public String trloadfooter()
    {
        demopage = new String("/tr/tr_footer.html");
        return demopage;

    }



}
