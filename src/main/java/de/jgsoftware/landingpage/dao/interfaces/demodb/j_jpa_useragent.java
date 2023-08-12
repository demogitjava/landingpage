package de.jgsoftware.landingpage.dao.interfaces.demodb;

import org.springframework.data.jpa.repository.JpaRepository;
import de.jgsoftware.landingpage.model.jpa.demodb.Useragent;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hoscho
 */
@Repository
public interface j_jpa_useragent extends JpaRepository<Useragent, Integer>
{

    
    // jpql select count(u.id) as count, YEAR(u.datum) as jahr, MONTH(u.datum) as monat from useragent u group by YEAR(u.datum), MONTH(u.datum)
    
    // derbydb sql   SELECT COUNT(ipaddress) as count, MONTH(datum) as monat, YEAR(datum) as jahr FROM useragent a GROUP BY YEAR(datum), MONTH(datum)
    // SELECT d.name, COUNT(e) FROM Department d JOIN d.employees e GROUP BY d.name
    @Query("select count(u.id) as count, YEAR(u.datum) as jahr, MONTH(u.datum) as monat from useragent u group by YEAR(u.datum), MONTH(u.datum)")
    List<Useragent> useragentgroupbyyearmonth();
    
    @Query("select count(u.id) as count, YEAR(u.datum) as jahr, MONTH(u.datum) as monat from useragent u group by YEAR(u.datum), MONTH(u.datum)")
    List<Useragent> useragentcountmonth();
    
 
    
    
    
}
