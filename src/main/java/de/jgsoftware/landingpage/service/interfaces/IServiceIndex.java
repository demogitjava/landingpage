package de.jgsoftware.landingpage.service.interfaces;

import de.jgsoftware.landingpage.dao.Dao_DemoPageController;

public interface IServiceIndex
{
    public Dao_DemoPageController getDcontroller();
    public void setDcontroller(Dao_DemoPageController dcontroller);
}
