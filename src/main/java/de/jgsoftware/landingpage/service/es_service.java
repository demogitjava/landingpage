package de.jgsoftware.landingpage.service;

import de.jgsoftware.landingpage.dao.interfaces.i_DAO_ES;
import de.jgsoftware.landingpage.service.interfaces.ies_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class es_service implements ies_service
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
