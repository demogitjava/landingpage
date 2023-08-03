package de.jgsoftware.landingpage.service.interfaces;


/**
 *
 * @author hoscho
 */

public interface iWebBuilderService
{
    de.jgsoftware.landingpage.dao.interfaces.shopdb.iDaoWebBuilder getiDaoWebBuilder();
    void setiDaoWebBuilder(de.jgsoftware.landingpage.dao.interfaces.shopdb.iDaoWebBuilder iDaoWebBuilder);




    // en
    String enloadcontent();
    String enloadheader();
    String enloadfooter();

    // es
    String esloadcontent();
    String esloadheader();
    String esloadfooter();

    // fr
    String frloadcontent();
    String frloadheader();
    String frloadfooter();

    // it
    String itloadcontent();
    String itloadheader();
    String itloadfooter();

    // tr
    String trloadcontent();
    String trloadheader();
    String trloadfooter();



}
