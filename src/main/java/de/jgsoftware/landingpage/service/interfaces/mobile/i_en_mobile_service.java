package de.jgsoftware.landingpage.service.interfaces.mobile;

import de.jgsoftware.landingpage.dao.EN_DAO;
import de.jgsoftware.landingpage.dao.interfaces.i_DAO_EN;

public interface i_en_mobile_service {


    i_DAO_EN getI_dao_en();

    void setI_dao_en(i_DAO_EN i_dao_en);
}