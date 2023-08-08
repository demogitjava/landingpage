/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package de.jgsoftware.landingpage.dao.interfaces.mawi;


import de.jgsoftware.landingpage.model.jpa.demodb.Userdata;
import de.jgsoftware.landingpage.model.jpa.mawi.Artikelstamm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hoscho
 */
public interface i_jpa_artikelstamm extends JpaRepository<Artikelstamm, Integer>{
    
}
