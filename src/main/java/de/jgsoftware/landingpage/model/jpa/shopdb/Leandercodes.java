package de.jgsoftware.landingpage.model.jpa.shopdb;

import javax.persistence.Basic;
import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class Leandercodes {
    @Basic
    @javax.persistence.Column(name = "ID")
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @javax.persistence.Column(name = "LAND")
    private String land;

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    @Basic
    @javax.persistence.Column(name = "CODE1")
    private String code1;

    public String getCode1() {
        return code1;
    }

    public void setCode1(String code1) {
        this.code1 = code1;
    }

    @Basic
    @javax.persistence.Column(name = "CODE2")
    private String code2;

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }

    @Basic
    @javax.persistence.Column(name = "EU")
    private Integer eu;

    public Integer getEu() {
        return eu;
    }

    public void setEu(Integer eu) {
        this.eu = eu;
    }

    @Basic
    @javax.persistence.Column(name = "INTLANGDB")
    private Integer intlangdb;

    public Integer getIntlangdb() {
        return intlangdb;
    }

    public void setIntlangdb(Integer intlangdb) {
        this.intlangdb = intlangdb;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Leandercodes that = (Leandercodes) o;
        return Objects.equals(id, that.id) && Objects.equals(land, that.land) && Objects.equals(code1, that.code1) && Objects.equals(code2, that.code2) && Objects.equals(eu, that.eu) && Objects.equals(intlangdb, that.intlangdb);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, land, code1, code2, eu, intlangdb);
    }
}
