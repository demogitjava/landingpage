/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package de.jgsoftware.landingpage.dao.interfaces.demodb;

import de.jgsoftware.landingpage.model.jpa.demodb.Reports;
import de.jgsoftware.landingpage.model.jpa.demodb.Shipping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hoscho
 */
@Repository
public interface i_jpa_shipping extends JpaRepository<Shipping, Integer>{
    
}