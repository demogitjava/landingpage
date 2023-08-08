/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de.jgsoftware.landingpage.model.jpa.demodb;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author hoscho
 */

@Entity
public class Shipping 
{
    @Id
    private Integer id;
    
    private String designation;
    private String designationsize;
    private String country;
    private String shippingprovider;
    private String year;
    private String price;
    private String currency;
    private String storeonline;
    private String dhlzone;
    
}
