package de.jgsoftware.landingpage.service;

import de.jgsoftware.landingpage.dao.interfaces.i_DAO_EN;
import de.jgsoftware.landingpage.service.interfaces.i_service_en;
import org.springframework.beans.factory.annotation.Autowired;

public class service_en implements i_service_en
{

    @Autowired
    i_DAO_EN iDaoEn;

    @Override
    public i_DAO_EN getiDaoEn() {
        return iDaoEn;
    }

    @Override
    public void setiDaoEn(i_DAO_EN iDaoEn) {
        this.iDaoEn = iDaoEn;
    }
}
