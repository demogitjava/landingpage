package de.jgsoftware.landingpage.model.jpa.mawi;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "ARTIKELSTAMM", schema = "PUBLIC", catalog = "MAWI")
public class Artikelstamm
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String artikelbezeichnung;

    private Integer wg;

    private double ek;

    private double vk;

    private Date letzebuchung;

    private Long artikelnummer;

    private Integer selectionclient;

    private Timestamp timestamp;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArtikelbezeichnung() {
        return artikelbezeichnung;
    }

    public void setArtikelbezeichnung(String artikelbezeichnung) {
        this.artikelbezeichnung = artikelbezeichnung;
    }

    public Integer getWg() {
        return wg;
    }

    public void setWg(Integer wg) {
        this.wg = wg;
    }

    public double getEk() {
        return ek;
    }

    public void setEk(double ek) {
        this.ek = ek;
    }

    public double getVk() {
        return vk;
    }

    public void setVk(double vk) {
        this.vk = vk;
    }

    public Date getLetzebuchung() {
        return letzebuchung;
    }

    public void setLetzebuchung(Date letzebuchung) {
        this.letzebuchung = letzebuchung;
    }

    public Long getArtikelnummer() {
        return artikelnummer;
    }

    public void setArtikelnummer(Long artikelnummer) {
        this.artikelnummer = artikelnummer;
    }

    public Integer getSelectionclient() {
        return selectionclient;
    }

    public void setSelectionclient(Integer selectionclient) {
        this.selectionclient = selectionclient;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
