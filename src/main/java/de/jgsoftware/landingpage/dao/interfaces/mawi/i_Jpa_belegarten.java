
package de.jgsoftware.landingpage.dao.interfaces.mawi;


import de.jgsoftware.landingpage.model.jpa.mawi.Belegarten;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hoscho
 */
public interface i_Jpa_belegarten extends JpaRepository<Belegarten, Integer>{
    
}
