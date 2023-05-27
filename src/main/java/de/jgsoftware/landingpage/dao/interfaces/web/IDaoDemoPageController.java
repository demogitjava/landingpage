package de.jgsoftware.landingpage.dao.interfaces.web;

import de.jgsoftware.landingpage.model.areacodes;
import de.jgsoftware.landingpage.model.jpa.shopdb.BootstrapComponents;
import de.jgsoftware.landingpage.model.jpa.shopdb.m_webtextlayout;
import de.jgsoftware.landingpage.model.jpa.demodb.Useragent;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface IDaoDemoPageController
{
    List<m_webtextlayout> getPageLanguageText();
    List<BootstrapComponents> getBootstrapComponents();

    List<areacodes> areacodes_eu();
    public Useragent saveuseragent(Useragent muagent);
}


