package de.jgsoftware.landingpage.dao.interfaces.shopdb;


import de.jgsoftware.landingpage.model.m_bootstrap_components;
import de.jgsoftware.landingpage.model.m_webtextlayout;

import java.util.List;
/**
 *
 * @author hoscho
 */

public interface iDaoWebBuilder
{

    List<m_webtextlayout> getPageLanguageText();
    List<m_bootstrap_components> getBootstrapComponents();

    String loaddefaultpagetograpesjs();
    String loadheader();
    String loadfooter();

    String loadcontact();
    String loadservicehtml();
    String loadabouthtml();

    String savehtmlandcss(String gjshtml, String gjscss, String language, String component);

}
