package de.jgsoftware.landingpage.service.mobile;

import de.jgsoftware.landingpage.dao.interfaces.i_DAO_EN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.jgsoftware.landingpage.service.interfaces.mobile.i_es_mobile_service;
import de.jgsoftware.landingpage.dao.interfaces.i_DAO_ES;

/**
 *
 * @author hoscho
 */

@Service
public class es_mobile_service implements i_es_mobile_service
{

    @Autowired
    i_DAO_ES i_dao_es;

    @Override
    public i_DAO_ES getI_dao_es() {
        return i_dao_es;
    }

    @Override
    public void setI_dao_es(i_DAO_ES i_dao_es) {
        this.i_dao_es = i_dao_es;
    }
}
