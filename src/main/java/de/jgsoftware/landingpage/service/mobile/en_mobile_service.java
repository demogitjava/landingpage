package de.jgsoftware.landingpage.service.mobile;


import de.jgsoftware.landingpage.dao.interfaces.i_DAO_EN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.jgsoftware.landingpage.service.interfaces.mobile.i_en_mobile_service;

@Service
public class en_mobile_service implements i_en_mobile_service
{
    @Autowired
    i_DAO_EN iDaoEn;

    public i_DAO_EN getiDaoEn() {
        return iDaoEn;
    }

    public void setiDaoEn(i_DAO_EN iDaoEn) {
        this.iDaoEn = iDaoEn;
    }
}
