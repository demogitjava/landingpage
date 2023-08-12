package de.jgsoftware.landingpage.model.jpa.demodb;


import java.io.Serializable;
import javax.persistence.Entity;


import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;


/**
 *
 * @author hoscho
 */

@Entity
@Table(name = "Useragent")
public class Useragent implements Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String ipAddress;

    private String stbrowser;
    private String stbrowserversion;
    private String stsystem;

    private String stlanguage;

    private Date datum;

    private Timestamp timestamp;

    public long getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getStbrowser() {
        return stbrowser;
    }

    public void setStbrowser(String stbrowser) {
        this.stbrowser = stbrowser;
    }

    public String getStbrowserversion() {
        return stbrowserversion;
    }

    public void setStbrowserversion(String stbrowserversion) {
        this.stbrowserversion = stbrowserversion;
    }

    public String getStsystem() {
        return stsystem;
    }

    public void setStsystem(String stsystem) {
        this.stsystem = stsystem;
    }

    public String getStlanguage() {
        return stlanguage;
    }

    public void setStlanguage(String stlanguage) {
        this.stlanguage = stlanguage;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

   
    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
