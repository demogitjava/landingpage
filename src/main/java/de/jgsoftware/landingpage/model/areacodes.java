package de.jgsoftware.landingpage.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author hoscho
 */

public class areacodes
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String land;

    private String code1;
    private String code2;

    private String eu;

    private String intlandb;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public String getCode1() {
        return code1;
    }

    public void setCode1(String code1) {
        this.code1 = code1;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }

    public String getEu() {
        return eu;
    }

    public void setEu(String eu) {
        this.eu = eu;
    }

    public String getIntlandb() {
        return intlandb;
    }

    public void setIntlandb(String intlandb) {
        this.intlandb = intlandb;
    }
}
