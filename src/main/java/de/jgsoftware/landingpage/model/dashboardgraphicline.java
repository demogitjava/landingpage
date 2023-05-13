/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de.jgsoftware.landingpage.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author hoscho
 */


// for query in dao_admin
// function  public List connectsnavbargraphicalyear(int year)
/*
    COUNT(STBROWSER)  	MONTH  	YEAR  
296	3	2023
626	5	2023
1436	4	2023
1773	1	2023
599	2	2023
(5 rows, 4 ms)

*/

public class dashboardgraphicline 
{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    
    private Integer count;
   
    private Integer month;
    
    private Integer year;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    
  
    
    
       
    
}
