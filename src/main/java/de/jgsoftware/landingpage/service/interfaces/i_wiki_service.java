package de.jgsoftware.landingpage.service.interfaces;

import de.jgsoftware.landingpage.dao.interfaces.i_dao_wiki;


/**
 *
 * @author hoscho
 */
public interface i_wiki_service
{
    i_dao_wiki getiDaoWiki();
    void setiDaoWiki(i_dao_wiki iDaoWiki);

}
