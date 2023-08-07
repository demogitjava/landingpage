package de.jgsoftware.landingpage.dao.interfaces.demodb;

import org.springframework.data.jpa.repository.JpaRepository;
import de.jgsoftware.landingpage.model.useragent;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hoscho
 */
@Repository
public interface j_jpa_useragent extends JpaRepository<useragent, Integer>
{

    // SELECT d.name, COUNT(e) FROM Department d JOIN d.employees e GROUP BY d.name
    @Query("SELECT COUNT(ipaddress) as count, MONTH(datum) as monat, YEAR(datum) as jahr FROM useragent a GROUP BY YEAR(datum), MONTH(datum)")
    List<useragent> useragentgroupbyyearmonth();
    
    @Query("SELECT COUNT(ipaddress) as count, MONTH(datum) as monat, YEAR(datum) as jahr FROM useragent a GROUP BY YEAR(datum), MONTH(datum)")
    List<useragent> useragentcountmonth();
    
 
    
    
    
}
