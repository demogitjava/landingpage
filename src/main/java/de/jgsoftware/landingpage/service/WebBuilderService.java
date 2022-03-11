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

    public de.jgsoftware.landingpage.dao.interfaces.web.iDaoWebBuilder getiDaoWebBuilder() {
        return iDaoWebBuilder;
    }

    public void setiDaoWebBuilder(de.jgsoftware.landingpage.dao.interfaces.web.iDaoWebBuilder iDaoWebBuilder) {
        this.iDaoWebBuilder = iDaoWebBuilder;
    }
}
