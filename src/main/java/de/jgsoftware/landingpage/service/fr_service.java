package de.jgsoftware.landingpage.service;

import de.jgsoftware.landingpage.dao.interfaces.i_DAO_FR;
import de.jgsoftware.landingpage.service.interfaces.ifr_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class fr_service implements ifr_service
{
    @Autowired
    i_DAO_FR i_dao_fr;


    public i_DAO_FR getI_dao_fr() {
        return i_dao_fr;
    }

    public void setI_dao_fr(i_DAO_FR i_dao_fr) {
        this.i_dao_fr = i_dao_fr;
    }
}
