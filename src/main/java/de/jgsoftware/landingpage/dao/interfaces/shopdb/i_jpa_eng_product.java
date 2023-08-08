package de.jgsoftware.landingpage.dao.interfaces.shopdb;

import de.jgsoftware.landingpage.model.jpa.shopdb.EngProduct;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author hoscho
 */
public interface i_jpa_eng_product extends JpaRepository<EngProduct, Integer>
{
    
}
