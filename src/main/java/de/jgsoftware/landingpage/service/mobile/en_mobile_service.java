package de.jgsoftware.landingpage.service.mobile;


import de.jgsoftware.landingpage.dao.interfaces.i_DAO_EN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.jgsoftware.landingpage.service.interfaces.mobile.i_en_mobile_service;
import de.jgsoftware.landingpage.dao.interfaces.i_DAO_EN;

/**
 *
 * @author hoscho
 */

@Service
public class en_mobile_service implements i_en_mobile_service
{

    @Autowired
    i_DAO_EN i_dao_en;

    @Override
    public i_DAO_EN getI_dao_en() {
        return i_dao_en;
    }

    /**
     *
     * @param i_dao_en
     */
    @Override
    public void setI_dao_en(i_DAO_EN i_dao_en) {
        this.i_dao_en = i_dao_en;
    }
}
