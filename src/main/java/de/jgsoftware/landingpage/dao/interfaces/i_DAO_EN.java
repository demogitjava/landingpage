package de.jgsoftware.landingpage.dao.interfaces;

import de.jgsoftware.landingpage.model.m_bootstrap_components;
import de.jgsoftware.landingpage.model.m_webtextlayout;


import de.jgsoftware.landingpage.model.jpa.shopdb.Webtextlayout;
import de.jgsoftware.landingpage.model.jpa.shopdb.BootstrapComponents;
import java.util.List;


/**
 *
 * @author hoscho
 */
public interface i_DAO_EN
{

    // returns all entries from Table
    List<Webtextlayout> getPageLanguageText();

    // returns all entries from stored Bootstrap Compoents
    // with ${ value } for mapping to Theamyleaf
    List<BootstrapComponents> getBootstrapComponents();
}
