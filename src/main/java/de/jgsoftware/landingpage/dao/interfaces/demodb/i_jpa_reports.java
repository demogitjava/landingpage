package de.jgsoftware.landingpage.dao.interfaces.demodb;

import de.jgsoftware.landingpage.model.jpa.demodb.Reports;
import de.jgsoftware.landingpage.model.useragent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hoscho
 */
@Repository
public interface i_jpa_reports extends JpaRepository<Reports, Integer>{
    
}
