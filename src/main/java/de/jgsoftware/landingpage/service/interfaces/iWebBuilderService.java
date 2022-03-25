package de.jgsoftware.landingpage.service.interfaces;


import org.springframework.stereotype.Service;


public interface iWebBuilderService
{
    public de.jgsoftware.landingpage.dao.interfaces.web.iDaoWebBuilder getiDaoWebBuilder();
    public void setiDaoWebBuilder(de.jgsoftware.landingpage.dao.interfaces.web.iDaoWebBuilder iDaoWebBuilder);




    // en
    public String enloadcontent();
    public String enloadheader();
    public String enloadfooter();

    // es
    public String esloadcontent();
    public String esloadheader();
    public String esloadfooter();

    // fr
    public String frloadcontent();
    public String frloadheader();
    public String frloadfooter();

    // it
    public String itloadcontent();
    public String itloadheader();
    public String itloadfooter();

    // tr
    public String trloadcontent();
    public String trloadheader();
    public String trloadfooter();


}
