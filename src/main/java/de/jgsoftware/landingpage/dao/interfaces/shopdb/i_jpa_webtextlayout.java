package de.jgsoftware.landingpage.dao.interfaces.shopdb;

import de.jgsoftware.landingpage.model.m_webtextlayout;
import de.jgsoftware.landingpage.model.useragent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface i_jpa_webtextlayout extends JpaRepository<m_webtextlayout, Integer>
{
    @Query("FROM m_webtextlayout ")
    List<m_webtextlayout> allentityswebtextlayout();
}
