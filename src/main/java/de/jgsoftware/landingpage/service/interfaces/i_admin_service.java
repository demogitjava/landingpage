package de.jgsoftware.landingpage.service.interfaces;

import de.jgsoftware.landingpage.dao.Dao_admin;
import de.jgsoftware.landingpage.dao.interfaces.i_jpa_useragent;

public interface i_admin_service
{

    Dao_admin getIdao_admin();
    void setIdao_admin(Dao_admin idao_admin);

    int getcurrentMonth();
    int getcurrentYear();



    /*
        interface dao
        i_jpa_useragent
     */
    i_jpa_useragent getiJpaUseragent();
    void setiJpaUseragent(i_jpa_useragent iJpaUseragent);
}
