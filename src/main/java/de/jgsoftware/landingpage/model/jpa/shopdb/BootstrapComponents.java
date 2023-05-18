package de.jgsoftware.landingpage.model.jpa.shopdb;

import javax.persistence.*;
import java.util.Objects;



@Entity
@Table(name = "BOOTSTRAP_COMPONENTS", schema = "PUBLIC", catalog = "SHOPDB")
public class BootstrapComponents {
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
    @Column(name = "BTCOMPNAME")
    private String btcompname;

    public String getBtcompname() {
        return btcompname;
    }

    public void setBtcompname(String btcompname) {
        this.btcompname = btcompname;
    }

    @Basic
    @Column(name = "TXBOOTSTRAP")
    private String txbootstrap;

    public String getTxbootstrap() {
        return txbootstrap;
    }

    public void setTxbootstrap(String txbootstrap) {
        this.txbootstrap = txbootstrap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BootstrapComponents that = (BootstrapComponents) o;
        return Objects.equals(id, that.id) && Objects.equals(btcompname, that.btcompname) && Objects.equals(txbootstrap, that.txbootstrap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, btcompname, txbootstrap);
    }
}
