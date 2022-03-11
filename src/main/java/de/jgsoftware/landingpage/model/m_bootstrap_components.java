package de.jgsoftware.landingpage.model;


import javax.persistence.*;


@Entity
@Table(name = "bootstrap_components")
public class m_bootstrap_components
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    private String btcompname;

    @Lob
    private String txbootstrap;


    public int getId() {
        return id;
    }

    public void setId(int id) {
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
