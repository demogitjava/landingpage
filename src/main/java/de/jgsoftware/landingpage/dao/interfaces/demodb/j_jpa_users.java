package de.jgsoftware.landingpage.dao.interfaces.demodb;



import org.springframework.data.jpa.repository.JpaRepository;
import de.jgsoftware.landingpage.model.Users;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface j_jpa_users extends JpaRepository<Users, Integer>
{

  
}
