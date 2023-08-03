package de.jgsoftware.landingpage.service;

import de.jgsoftware.landingpage.service.interfaces.iit_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.jgsoftware.landingpage.dao.interfaces.i_DAO_IT;



/**
 *
 * @author hoscho
 */

@Service
public class it_service implements iit_service
{
    @Autowired
    i_DAO_IT i_dao_it;

    @Override
    public i_DAO_IT getI_dao_it() {
        return i_dao_it;
    }
    
    @Override
    public void setI_dao_it(i_DAO_IT i_dao_it) {
        this.i_dao_it = i_dao_it;
    }
}
