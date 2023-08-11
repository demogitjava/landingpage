package de.jgsoftware.landingpage.dao.interfaces.demodb;



import org.springframework.data.jpa.repository.JpaRepository;
import de.jgsoftware.landingpage.model.jpa.demodb.Users;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import org.springframework.stereotype.Repository;


/**
 *
 * @author hoscho
 */
@Repository
public interface j_jpa_users extends JpaRepository<Users, Integer>
{

  
}
