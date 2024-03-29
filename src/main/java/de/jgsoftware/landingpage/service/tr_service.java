package de.jgsoftware.landingpage.service;


import de.jgsoftware.landingpage.service.interfaces.itr_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.jgsoftware.landingpage.dao.interfaces.i_DAO_TR;


/**
 *
 * @author hoscho
 */

@Service
public class tr_service implements itr_service
{

    @Autowired
    i_DAO_TR iDaoTr;

    @Override
    public i_DAO_TR getiDaoTr() {
        return iDaoTr;
    }

    @Override
    public void setiDaoTr(i_DAO_TR iDaoTr) {
        this.iDaoTr = iDaoTr;
    }
}
