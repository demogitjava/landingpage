package de.jgsoftware.landingpage.dao.interfaces.shopdb;

import de.jgsoftware.landingpage.model.areacodes;
import de.jgsoftware.landingpage.model.jpa.shopdb.BootstrapComponents;
import de.jgsoftware.landingpage.model.jpa.shopdb.Webtextlayout;
import de.jgsoftware.landingpage.model.jpa.demodb.Useragent;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 *
 * @author hoscho
 */
public interface IDaoDemoPageController
{
    List<Webtextlayout> getPageLanguageText();
    List<BootstrapComponents> getBootstrapComponents();

    List<areacodes> areacodes_eu();
    public Useragent saveuseragent(Useragent muagent);
}


