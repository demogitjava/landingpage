package de.jgsoftware.landingpage.dao.interfaces.demodb;

import de.jgsoftware.landingpage.model.jpa.demodb.Userdata;
import de.jgsoftware.landingpage.model.jpa.demodb.Userdetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hoscho
 */
@Repository
public interface i_jpa_userdetail extends JpaRepository<Userdetail, Integer>
{
    
}
