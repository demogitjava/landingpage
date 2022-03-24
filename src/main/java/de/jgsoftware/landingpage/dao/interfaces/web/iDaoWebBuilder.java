package de.jgsoftware.landingpage.dao.interfaces.web;


import de.jgsoftware.landingpage.model.m_bootstrap_components;
import de.jgsoftware.landingpage.model.m_webtextlayout;

import java.util.List;

public interface iDaoWebBuilder
{

    public List<m_webtextlayout> getPageLanguageText();
    public List<m_bootstrap_components> getBootstrapComponents();

    public String loaddefaultpagetograpesjs();
    public String loadheader();
    public String loadfooter();
}
