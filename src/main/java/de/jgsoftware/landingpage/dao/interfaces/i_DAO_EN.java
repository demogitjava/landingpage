package de.jgsoftware.landingpage.dao.interfaces;

import de.jgsoftware.landingpage.model.m_bootstrap_components;
import de.jgsoftware.landingpage.model.m_webtextlayout;

import java.util.List;


/**
 *
 * @author hoscho
 */
public interface i_DAO_EN
{

    // returns all entries from Table
    List<m_webtextlayout> getPageLanguageText();

    // returns all entries from stored Bootstrap Compoents
    // with ${ value } for mapping to Theamyleaf
    List<m_bootstrap_components> getBootstrapComponents();
}
