package de.jgsoftware.landingpage.service.mobile;


import de.jgsoftware.landingpage.dao.Dao_DemoPageController;
import de.jgsoftware.landingpage.dao.interfaces.shopdb.IDaoDemoPageController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.jgsoftware.landingpage.service.interfaces.mobile.i_mobile_service;


/**
 *
 * @author hoscho
 */
@Service
public class de_mobile_service implements i_mobile_service
{

    @Autowired
    IDaoDemoPageController dcontroller;


    @Override
    public IDaoDemoPageController getDcontroller() {
        return dcontroller;
    }

    @Override
    public void setDcontroller(Dao_DemoPageController dcontroller) {

    }

}
