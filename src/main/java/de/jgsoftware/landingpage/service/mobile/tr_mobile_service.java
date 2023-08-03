package de.jgsoftware.landingpage.service.mobile;


import de.jgsoftware.landingpage.dao.interfaces.i_DAO_TR;
import de.jgsoftware.landingpage.service.interfaces.mobile.i_tr_mobile_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hoscho
 */

@Service
public class tr_mobile_service implements i_tr_mobile_service
{


    @Autowired
    i_DAO_TR i_dao_tr;

    @Override
    public i_DAO_TR getI_dao_tr() {
        return i_dao_tr;
    }

    @Override
    public void setI_dao_tr(i_DAO_TR i_dao_tr) {
        this.i_dao_tr = i_dao_tr;
    }
}
