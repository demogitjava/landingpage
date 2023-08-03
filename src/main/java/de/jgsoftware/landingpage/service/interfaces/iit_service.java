package de.jgsoftware.landingpage.service.interfaces;

import de.jgsoftware.landingpage.dao.interfaces.i_DAO_IT;


/**
 *
 * @author hoscho
 */
public interface iit_service
{
    i_DAO_IT getI_dao_it();
    void setI_dao_it(i_DAO_IT i_dao_it);
}
