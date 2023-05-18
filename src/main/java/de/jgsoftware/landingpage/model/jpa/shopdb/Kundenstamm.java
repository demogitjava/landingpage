package de.jgsoftware.landingpage.model.jpa.shopdb;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Objects;


@Entity
@Table(name = "KUNDENSTAMM", schema = "PUBLIC", catalog = "SHOPDB")
public class Kundenstamm {
    @Basic
    @javax.persistence.Column(name = "KUNDENNUMMER")
    private Long kundennummer;

    public Long getKundennummer() {
        return kundennummer;
    }

    public void setKundennummer(Long kundennummer) {
        this.kundennummer = kundennummer;
    }

    @Basic
    @javax.persistence.Column(name = "ANSPRECHPARTNER")
    private String ansprechpartner;

    public String getAnsprechpartner() {
        return ansprechpartner;
    }

    public void setAnsprechpartner(String ansprechpartner) {
        this.ansprechpartner = ansprechpartner;
    }

    @Basic
    @javax.persistence.Column(name = "BLZ")
    private String blz;

    public String getBlz() {
        return blz;
    }

    public void setBlz(String blz) {
        this.blz = blz;
    }

    @Basic
    @javax.persistence.Column(name = "EMAIL")
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @javax.persistence.Column(name = "IBAN")
    private String iban;

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    @Basic
    @javax.persistence.Column(name = "KONTO_NR")
    private String kontoNr;

    public String getKontoNr() {
        return kontoNr;
    }

    public void setKontoNr(String kontoNr) {
        this.kontoNr = kontoNr;
    }

    @Basic
    @javax.persistence.Column(name = "KREDITLIMIT")
    private Double kreditlimit;

    public Double getKreditlimit() {
        return kreditlimit;
    }

    public void setKreditlimit(Double kreditlimit) {
        this.kreditlimit = kreditlimit;
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
    @javax.persistence.Column(name = "MOBIL1")
    private String mobil1;

    public String getMobil1() {
        return mobil1;
    }

    public void setMobil1(String mobil1) {
        this.mobil1 = mobil1;
    }

    @Basic
    @javax.persistence.Column(name = "MOBIL2")
    private String mobil2;

    public String getMobil2() {
        return mobil2;
    }

    public void setMobil2(String mobil2) {
        this.mobil2 = mobil2;
    }

    @Basic
    @javax.persistence.Column(name = "NAME_ANSCHRIFT1")
    private String nameAnschrift1;

    public String getNameAnschrift1() {
        return nameAnschrift1;
    }

    public void setNameAnschrift1(String nameAnschrift1) {
        this.nameAnschrift1 = nameAnschrift1;
    }

    @Basic
    @javax.persistence.Column(name = "NAME_ANSCHRIFT2")
    private String nameAnschrift2;

    public String getNameAnschrift2() {
        return nameAnschrift2;
    }

    public void setNameAnschrift2(String nameAnschrift2) {
        this.nameAnschrift2 = nameAnschrift2;
    }

    @Basic
    @javax.persistence.Column(name = "NAME_ANSCHRIFT3")
    private String nameAnschrift3;

    public String getNameAnschrift3() {
        return nameAnschrift3;
    }

    public void setNameAnschrift3(String nameAnschrift3) {
        this.nameAnschrift3 = nameAnschrift3;
    }

    @Basic
    @javax.persistence.Column(name = "NAME_ANSCHRIFT4")
    private String nameAnschrift4;

    public String getNameAnschrift4() {
        return nameAnschrift4;
    }

    public void setNameAnschrift4(String nameAnschrift4) {
        this.nameAnschrift4 = nameAnschrift4;
    }

    @Basic
    @javax.persistence.Column(name = "ORT")
    private String ort;

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    @Basic
    @javax.persistence.Column(name = "PLZ")
    private Integer plz;

    public Integer getPlz() {
        return plz;
    }

    public void setPlz(Integer plz) {
        this.plz = plz;
    }

    @Basic
    @javax.persistence.Column(name = "SIP")
    private String sip;

    public String getSip() {
        return sip;
    }

    public void setSip(String sip) {
        this.sip = sip;
    }

    @Basic
    @javax.persistence.Column(name = "STRASSE")
    private String strasse;

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    @Basic
    @javax.persistence.Column(name = "TELEFON")
    private String telefon;

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Basic
    @javax.persistence.Column(name = "TIMESTAMP")
    private Timestamp timestamp;

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    @Basic
    @javax.persistence.Column(name = "UMSATZ_JAHR_1")
    private Double umsatzJahr1;

    public Double getUmsatzJahr1() {
        return umsatzJahr1;
    }

    public void setUmsatzJahr1(Double umsatzJahr1) {
        this.umsatzJahr1 = umsatzJahr1;
    }

    @Basic
    @javax.persistence.Column(name = "UMSATZ_JAHR_2")
    private Double umsatzJahr2;

    public Double getUmsatzJahr2() {
        return umsatzJahr2;
    }

    public void setUmsatzJahr2(Double umsatzJahr2) {
        this.umsatzJahr2 = umsatzJahr2;
    }

    @Basic
    @javax.persistence.Column(name = "UMSATZ_LFD_JAHR")
    private Double umsatzLfdJahr;

    public Double getUmsatzLfdJahr() {
        return umsatzLfdJahr;
    }

    public void setUmsatzLfdJahr(Double umsatzLfdJahr) {
        this.umsatzLfdJahr = umsatzLfdJahr;
    }

    @Basic
    @javax.persistence.Column(name = "PASSWORD")
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

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
    @javax.persistence.Column(name = "FIRMENNAME")
    private String firmenname;

    public String getFirmenname() {
        return firmenname;
    }

    public void setFirmenname(String firmenname) {
        this.firmenname = firmenname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kundenstamm that = (Kundenstamm) o;
        return Objects.equals(kundennummer, that.kundennummer) && Objects.equals(ansprechpartner, that.ansprechpartner) && Objects.equals(blz, that.blz) && Objects.equals(email, that.email) && Objects.equals(iban, that.iban) && Objects.equals(kontoNr, that.kontoNr) && Objects.equals(kreditlimit, that.kreditlimit) && Objects.equals(land, that.land) && Objects.equals(mobil1, that.mobil1) && Objects.equals(mobil2, that.mobil2) && Objects.equals(nameAnschrift1, that.nameAnschrift1) && Objects.equals(nameAnschrift2, that.nameAnschrift2) && Objects.equals(nameAnschrift3, that.nameAnschrift3) && Objects.equals(nameAnschrift4, that.nameAnschrift4) && Objects.equals(ort, that.ort) && Objects.equals(plz, that.plz) && Objects.equals(sip, that.sip) && Objects.equals(strasse, that.strasse) && Objects.equals(telefon, that.telefon) && Objects.equals(timestamp, that.timestamp) && Objects.equals(umsatzJahr1, that.umsatzJahr1) && Objects.equals(umsatzJahr2, that.umsatzJahr2) && Objects.equals(umsatzLfdJahr, that.umsatzLfdJahr) && Objects.equals(password, that.password) && Objects.equals(id, that.id) && Objects.equals(firmenname, that.firmenname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kundennummer, ansprechpartner, blz, email, iban, kontoNr, kreditlimit, land, mobil1, mobil2, nameAnschrift1, nameAnschrift2, nameAnschrift3, nameAnschrift4, ort, plz, sip, strasse, telefon, timestamp, umsatzJahr1, umsatzJahr2, umsatzLfdJahr, password, id, firmenname);
    }
}
