/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de.jgsoftware.landingpage.model.jpa.demodb;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author hoscho
 */

@Entity
//@Table(name = "DNS", schema = "ROOT", catalog = "DEMODB")
public class Dns 
{
    @Id
    private Integer id;
    
    private String forwarddns;
    private String reversedns;
    private String dnszone;
    private String dnstype;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getForwarddns() {
        return forwarddns;
    }

    public void setForwarddns(String forwarddns) {
        this.forwarddns = forwarddns;
    }

    public String getReversedns() {
        return reversedns;
    }

    public void setReversedns(String reversedns) {
        this.reversedns = reversedns;
    }

    public String getDnszone() {
        return dnszone;
    }

    public void setDnszone(String dnszone) {
        this.dnszone = dnszone;
    }

    public String getDnstype() {
        return dnstype;
    }

    public void setDnstype(String dnstype) {
        this.dnstype = dnstype;
    }
    
    
}
