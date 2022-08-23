package de.jgsoftware.landingpage.dao.interfaces.web;

import de.jgsoftware.landingpage.model.areacodes;
import de.jgsoftware.landingpage.model.m_bootstrap_components;
import de.jgsoftware.landingpage.model.m_webtextlayout;
import de.jgsoftware.landingpage.model.useragent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface IDaoDemoPageController
{
    List<m_webtextlayout> getPageLanguageText();
    List<m_bootstrap_components> getBootstrapComponents();

    List<areacodes> areacodes_eu();
    public useragent saveuseragent(useragent muagent);
}


