package de.jgsoftware.landingpage.service.mobile;

import de.jgsoftware.landingpage.dao.interfaces.i_DAO_FR;
import de.jgsoftware.landingpage.service.interfaces.mobile.i_es_mobile_service;
import de.jgsoftware.landingpage.service.interfaces.mobile.i_fr_mobile_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class fr_mobile_service implements i_fr_mobile_service
{

    @Autowired
    i_DAO_FR i_dao_fr;


    @Override
    public i_DAO_FR getI_dao_fr() {
        return i_dao_fr;
    }

    @Override
    public void setI_dao_fr(i_DAO_FR i_dao_fr) {
        this.i_dao_fr = i_dao_fr;
    }
}
