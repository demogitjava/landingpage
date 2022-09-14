package de.jgsoftware.landingpage.service.interfaces.mobile;

import de.jgsoftware.landingpage.dao.Dao_DemoPageController;
import de.jgsoftware.landingpage.dao.interfaces.web.IDaoDemoPageController;

public interface i_mobile_service
{
    IDaoDemoPageController getDcontroller();
    void setDcontroller(Dao_DemoPageController dcontroller);


}
