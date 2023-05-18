package de.jgsoftware.landingpage.model.jpa.demodb;

import javax.persistence.*;


@Entity
@Table(name = "USERDETAIL", schema = "PUBLIC", catalog = "DEMODB")
public class Userdetail
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String username;

    private String password;

    private String role;

    private String email;

    private String vorname;

    private String nachname;

    private String strasse;

    private String plzort;

    private String land;

    private String tel;

    private String mobil;

    private String bankverbindung;

    private String position;

    private Integer joinid;

    private byte[] binary;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getPlzort() {
        return plzort;
    }

    public void setPlzort(String plzort) {
        this.plzort = plzort;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMobil() {
        return mobil;
    }

    public void setMobil(String mobil) {
        this.mobil = mobil;
    }

    public String getBankverbindung() {
        return bankverbindung;
    }

    public void setBankverbindung(String bankverbindung) {
        this.bankverbindung = bankverbindung;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getJoinid() {
        return joinid;
    }

    public void setJoinid(Integer joinid) {
        this.joinid = joinid;
    }

    public byte[] getBinary() {
        return binary;
    }

    public void setBinary(byte[] binary) {
        this.binary = binary;
    }
}
