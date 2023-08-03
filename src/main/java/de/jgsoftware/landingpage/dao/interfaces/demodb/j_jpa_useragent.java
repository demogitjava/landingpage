package de.jgsoftware.landingpage.dao.interfaces.demodb;

import org.springframework.data.jpa.repository.JpaRepository;
import de.jgsoftware.landingpage.model.useragent;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 *
 * @author hoscho
 */

public interface j_jpa_useragent extends JpaRepository<useragent, Integer>
{

    @Query("FROM useragent")
    List<useragent> allentitys();
}
