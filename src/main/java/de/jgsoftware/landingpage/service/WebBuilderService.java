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
        demopage = new String("/fr/fr_body.html");

        return demopage;

    }

    @Override
    public String frloadheader()
    {
        demopage = new String("/fr/fr_header.html");

        return demopage;

    }
    @Override
    public String frloadfooter()
    {
        demopage = new String("/fr/fr_footer.html");

        return demopage;

    }



}
