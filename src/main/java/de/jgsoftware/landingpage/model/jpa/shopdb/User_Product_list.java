/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de.jgsoftware.landingpage.model.jpa.shopdb;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;

/**
 *
 * @author hoscho
 */
@Entity
public class User_Product_list {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_id;
      
    private Integer product_id;
    private Integer id;
    
}
