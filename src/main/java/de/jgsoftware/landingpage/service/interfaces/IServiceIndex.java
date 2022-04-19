package de.jgsoftware.landingpage.service.interfaces;

import de.jgsoftware.landingpage.dao.Dao_DemoPageController;
import de.jgsoftware.landingpage.dao.interfaces.web.IDaoDemoPageController;

import java.util.List;
import de.jgsoftware.landingpage.model.areacodes;
public interface IServiceIndex
{
    IDaoDemoPageController getDcontroller();
    void setDcontroller(Dao_DemoPageController dcontroller);


}
