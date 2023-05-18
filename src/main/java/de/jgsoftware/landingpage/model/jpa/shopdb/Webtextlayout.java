package de.jgsoftware.landingpage.model.jpa.shopdb;

import javax.persistence.*;

@Entity
@Table(name = "WEBTEXTLAYOUT", schema = "PUBLIC", catalog = "shopdb")
public class Webtextlayout
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String framename;

    private String de;

    private String eng;

    private String fr;

    private String esp;

    private String it;

    private String tr;

    private String bindto;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFramename() {
        return framename;
    }

    public void setFramename(String framename) {
        this.framename = framename;
    }

    public String getDe() {
        return de;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public String getEng() {
        return eng;
    }

    public void setEng(String eng) {
        this.eng = eng;
    }

    public String getFr() {
        return fr;
    }

    public void setFr(String fr) {
        this.fr = fr;
    }

    public String getEsp() {
        return esp;
    }

    public void setEsp(String esp) {
        this.esp = esp;
    }

    public String getIt() {
        return it;
    }

    public void setIt(String it) {
        this.it = it;
    }

    public String getTr() {
        return tr;
    }

    public void setTr(String tr) {
        this.tr = tr;
    }

    public String getBindto() {
        return bindto;
    }

    public void setBindto(String bindto) {
        this.bindto = bindto;
    }
}
