package de.jgsoftware.landingpage.dao.interfaces.shopdb;

import de.jgsoftware.landingpage.model.jpa.shopdb.Authorities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hoscho
 */
@Repository
public interface i_Jpa_authorities extends JpaRepository<Authorities, Integer>
{  
}
