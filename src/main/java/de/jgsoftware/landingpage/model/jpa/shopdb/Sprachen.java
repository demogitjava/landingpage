package de.jgsoftware.landingpage.model.jpa.shopdb;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Sprachen {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "ID")
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "SPRACHE")
    private String sprache;

    public String getSprache() {
        return sprache;
    }

    public void setSprache(String sprache) {
        this.sprache = sprache;
    }

    @Basic
    @Column(name = "BEZEICHNUNG")
    private String bezeichnung;

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sprachen sprachen = (Sprachen) o;
        return Objects.equals(id, sprachen.id) && Objects.equals(sprache, sprachen.sprache) && Objects.equals(bezeichnung, sprachen.bezeichnung);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sprache, bezeichnung);
    }
}
