package de.jgsoftware.landingpage.model.jpa.demodb;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author hoscho
 */


@Entity
@Table(name = "SPRACHEN", schema = "PUBLIC", catalog = "DEMODB")
public class Sprachen
{
    @Id
    private Integer id;

    private String sprache;
    private String bezeichnung;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSprache() {
        return sprache;
    }

    public void setSprache(String sprache) {
        this.sprache = sprache;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }
}
