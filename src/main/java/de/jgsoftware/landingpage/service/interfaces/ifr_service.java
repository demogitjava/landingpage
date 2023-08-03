package de.jgsoftware.landingpage.service.interfaces;

import de.jgsoftware.landingpage.dao.interfaces.i_DAO_FR;


/**
 *
 * @author hoscho
 */
public interface ifr_service
{
    i_DAO_FR getI_dao_fr();
    void setI_dao_fr(i_DAO_FR i_dao_fr);
}
