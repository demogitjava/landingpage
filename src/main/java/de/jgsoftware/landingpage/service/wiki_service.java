package de.jgsoftware.landingpage.service;


import de.jgsoftware.landingpage.dao.interfaces.i_dao_wiki;
import de.jgsoftware.landingpage.service.interfaces.i_wiki_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.GregorianCalendar;

@Service
public class wiki_service implements i_wiki_service
{

    @Autowired
    i_dao_wiki iDaoWiki;

    public i_dao_wiki getiDaoWiki() {
        return iDaoWiki;
    }

    public void setiDaoWiki(i_dao_wiki iDaoWiki) {
        this.iDaoWiki = iDaoWiki;
    }





}
