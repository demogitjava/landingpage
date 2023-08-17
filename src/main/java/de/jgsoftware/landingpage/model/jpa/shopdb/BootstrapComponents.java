package de.jgsoftware.landingpage.model.jpa.shopdb;

import javax.persistence.*;

/**
 *
 * @author hoscho
 */

@Entity
@Table(name = "BOOTSTRAP_COMPONENTS", schema = "ROOT", catalog = "SHOPDB")
public class BootstrapComponents {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private Integer id;
    @Basic
    @Column(name = "BTCOMPNAME")
    private String btcompname;
    @Basic
    @Column(name = "TXBOOTSTRAP")
    private String txbootstrap;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBtcompname() {
        return btcompname;
    }

    public void setBtcompname(String btcompname) {
        this.btcompname = btcompname;
    }

    public String getTxbootstrap() {
        return txbootstrap;
    }

    public void setTxbootstrap(String txbootstrap) {
        this.txbootstrap = txbootstrap;
    }
}
