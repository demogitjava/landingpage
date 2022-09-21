package de.jgsoftware.landingpage.service.mobile;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import de.jgsoftware.landingpage.dao.interfaces.i_DAO_IT;
import de.jgsoftware.landingpage.service.interfaces.mobile.i_it_mobile_service;

@Service
public class it_mobile_service implements i_it_mobile_service
{

    @Autowired
    i_DAO_IT i_dao_it;

    public i_DAO_IT getI_dao_it() {
        return i_dao_it;
    }

    public void setI_dao_it(i_DAO_IT i_dao_it) {
        this.i_dao_it = i_dao_it;
    }
}
