package de.jgsoftware.landingpage.dao.interfaces.web;

import de.jgsoftware.landingpage.model.areacodes;
import de.jgsoftware.landingpage.model.m_bootstrap_components;
import de.jgsoftware.landingpage.model.m_webtextlayout;

import java.util.List;

public interface IDaoDemoPageController
{
    List<m_webtextlayout> getPageLanguageText();
    List<m_bootstrap_components> getBootstrapComponents();

    List<areacodes> areacodes_eu();
}
