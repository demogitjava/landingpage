package de.jgsoftware.landingpage.dao.interfaces.demodb;

import de.jgsoftware.landingpage.model.jpa.demodb.Kundenstamm;
import de.jgsoftware.landingpage.model.useragent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hoscho
 */
@Repository
public interface i_jpa_kundenstamm extends JpaRepository<Kundenstamm, Integer>{
    
}
