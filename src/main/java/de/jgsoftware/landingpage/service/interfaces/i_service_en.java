package de.jgsoftware.landingpage.service.interfaces;

import de.jgsoftware.landingpage.dao.interfaces.i_DAO_EN;
import org.springframework.beans.factory.annotation.Autowired;

import de.jgsoftware.landingpage.dao.interfaces.i_DAO_EN;

public interface i_service_en
{

    public i_DAO_EN getiDaoEn();
    public void setiDaoEn(i_DAO_EN iDaoEn);






}
