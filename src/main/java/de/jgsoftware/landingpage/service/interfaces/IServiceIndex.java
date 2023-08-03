package de.jgsoftware.landingpage.service.interfaces;

import de.jgsoftware.landingpage.dao.Dao_DemoPageController;
import de.jgsoftware.landingpage.dao.interfaces.shopdb.IDaoDemoPageController;

import java.io.InputStream;

/**
 *
 * @author hoscho
 */

public interface IServiceIndex
{
    IDaoDemoPageController getDcontroller();
    void setDcontroller(Dao_DemoPageController dcontroller);


}
