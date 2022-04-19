package de.jgsoftware.landingpage.service;


import de.jgsoftware.landingpage.dao.Dao_DemoPageController;
import de.jgsoftware.landingpage.service.interfaces.IServiceIndex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import de.jgsoftware.landingpage.dao.interfaces.web.IDaoDemoPageController;

import java.util.List;
import de.jgsoftware.landingpage.model.areacodes;
@Service
public class IndexService implements IServiceIndex
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
