package de.jgsoftware.landingpage.service.interfaces;

import de.jgsoftware.landingpage.dao.interfaces.i_DAO_TR;

public interface itr_service {

    i_DAO_TR getiDaoTr();
    void setiDaoTr(i_DAO_TR iDaoTr);
}
