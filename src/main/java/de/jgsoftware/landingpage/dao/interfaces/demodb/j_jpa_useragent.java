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
    @Query(value="select u.id as ID, count(u.ID) as count, YEAR(u.datum) as jahr, MONTH(u.datum) as monat from useragent u group by YEAR(u.datum), MONTH(u.datum)", nativeQuery = true)
    List<Useragent> useragentgroupbyyearmonth();
    
    @Query(value="select count(u.ID) as count, YEAR(u.datum) as jahr, MONTH(u.datum) as monat from useragent u group by YEAR(u.datum), MONTH(u.datum)", nativeQuery = true)
    List useragentcountmonth();
    
 
    // select count(u.stbrowser) as count, u.STBROWSER, u.STSYSTEM, YEAR(u.datum) as jahr, MONTH(u.datum) as monat 
    // from useragent u 
    //   group by YEAR(u.datum), MONTH(u.datum), u.STBROWSER, u.STSYSTEM
    
    @Query(value="select count(u.stbrowser) as count, u.STBROWSER, u.STSYSTEM, YEAR(u.datum) as jahr, MONTH(u.datum) as monat from useragent u group by YEAR(u.datum), MONTH(u.datum), u.STBROWSER, u.STSYSTEM", nativeQuery = true)
    List allbrowserconnects();
    
    @Query(value="select count(u.stbrowser) as count, u.STBROWSER, u.STSYSTEM, YEAR(u.datum) as jahr, MONTH(u.datum) as monat from useragent u group by YEAR(u.datum), MONTH(u.datum), u.STBROWSER, u.STSYSTEM", nativeQuery = true)
    List allbrowserconnectsmonth();
    
    
    @Query(value="select count(u.stbrowser) as count from useragent u where YEAR(u.datum) = :year", nativeQuery = true)
    Long allconnectsnavbaryear(int year);
    
    @Query(value="select count(u.stbrowser) as count from useragent u where YEAR(u.datum) = :year and MONTH(u.datum) = :month", nativeQuery = true)
    Long allconnectsmonthyear(int month, int year);

    @Query(value="select count(u.stbrowser) as count, month(u.datum) as monat, year(u.datum) as jahr from useragent u where YEAR(u.datum) = 2023 group by month(u.datum), year(u.datum)", nativeQuery = true)
    List connectsnavbargraphicalyear(int year);
            
}
