package de.jgsoftware.landingpage.model.jpa.mawi;

import javax.persistence.*;


/**
 *
 * @author hoscho
 */

@Entity
//@Table(name = "buchungsarten", schema = "PUBLIC", catalog = "MAWI")
public class Buchungsarten
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String belegart;

    private Long belegnummernkreis;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBelegart() {
        return belegart;
    }

    public void setBelegart(String belegart) {
        this.belegart = belegart;
    }

    public Long getBelegnummernkreis() {
        return belegnummernkreis;
    }

    public void setBelegnummernkreis(Long belegnummernkreis) {
        this.belegnummernkreis = belegnummernkreis;
    }
}
