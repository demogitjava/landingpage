/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package de.jgsoftware.landingpage.dao.interfaces.shopdb;

import de.jgsoftware.landingpage.model.jpa.shopdb.Laendercodes;
import de.jgsoftware.landingpage.model.useragent;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hoscho
 */

@Repository
public interface i_jpa_laendercodes extends JpaRepository<Laendercodes, Integer>
{
    
    
    
    @Query("select eucodes from Laendercodes eucodes where eucodes.eu = ?1")
    List<Laendercodes> findcodesonlyeu();
}
