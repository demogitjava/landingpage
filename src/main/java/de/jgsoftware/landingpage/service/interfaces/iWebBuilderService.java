package de.jgsoftware.landingpage.service.interfaces;


import org.springframework.stereotype.Service;


public interface iWebBuilderService
{
    public de.jgsoftware.landingpage.dao.interfaces.web.iDaoWebBuilder getiDaoWebBuilder();
    public void setiDaoWebBuilder(de.jgsoftware.landingpage.dao.interfaces.web.iDaoWebBuilder iDaoWebBuilder);


}
