/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package de.jgsoftware.landingpage.dao.interfaces.demodb;

import de.jgsoftware.landingpage.model.jpa.demodb.Sprachen;
import de.jgsoftware.landingpage.model.jpa.demodb.Userdata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



/**
 *
 * @author hoscho
 */
@Repository
public interface i_jpa_userdata extends JpaRepository<Userdata, Integer>{
    
}
