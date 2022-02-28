package de.jgsoftware.landingpage.service;


import de.jgsoftware.landingpage.service.interfaces.IServiceIndex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import de.jgsoftware.landingpage.dao.Dao_DemoPageController;

@Service
public class IndexService implements IServiceIndex
{

    @Autowired
    Dao_DemoPageController dcontroller;


    public Dao_DemoPageController getDcontroller() {
        return dcontroller;
    }

    public void setDcontroller(Dao_DemoPageController dcontroller) {
        this.dcontroller = dcontroller;
    }
}
