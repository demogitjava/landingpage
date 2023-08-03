package de.jgsoftware.landingpage.service;

import de.jgsoftware.landingpage.dao.interfaces.i_DAO_EN;
import de.jgsoftware.landingpage.service.interfaces.ien_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hoscho
 */

@Service
public class en_service implements ien_service
{

    @Autowired
    i_DAO_EN iDaoEn;

    @Override
    public i_DAO_EN getiDaoEn() {
        return iDaoEn;
    }

    @Override
    public void setiDaoEn(i_DAO_EN iDaoEn) {
        this.iDaoEn = iDaoEn;
    }
}
