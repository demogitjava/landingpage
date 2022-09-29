package de.jgsoftware.landingpage.dao.interfaces;

import de.jgsoftware.landingpage.model.useragent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface i_jpa_useragent extends JpaRepository<useragent, Long>
{
    @Query(value = "select \n" +
            "count(stbrowser), \n" +
            "stbrowser,\n" +
            "stsystem,\n" +
            "EXTRACT(MONTH FROM datum) as month,\n" +
            "EXTRACT(YEAR FROM datum) as year\n" +
            "from useragent group by stbrowser, month, year, stsystem", nativeQuery = true)
    List allgetBrowserconnects();

}