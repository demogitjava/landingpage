package de.jgsoftware.landingpage.model.jpa.shopdb;

import javax.persistence.*;

/**
 *
 * @author hoscho
 */
@Entity
public class Webtextlayout {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private Integer id;
    @Basic
    @Column(name = "FRAMENAME")
    private String framename;
    @Basic
    @Column(name = "DE")
    private String de;
    @Basic
    @Column(name = "EN")
    private String en;
    @Basic
    @Column(name = "FR")
    private String fr;
    @Basic
    @Column(name = "ES")
    private String es;
    @Basic
    @Column(name = "IT")
    private String it;
    @Basic
    @Column(name = "TR")
    private String tr;
    @Basic
    @Column(name = "BINDTO")
    private String bindto;
    @Basic
    @Column(name = "TEMPLATE")
    private String template;
    @Basic
    @Column(name = "TITLETEMPLATE")
    private String titletemplate;
    @Basic
    @Column(name = "COMP_NAME")
    private String compName;

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

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getFr() {
        return fr;
    }

    public void setFr(String fr) {
        this.fr = fr;
    }

    public String getEs() {
        return es;
    }

    public void setEs(String es) {
        this.es = es;
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

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getTitletemplate() {
        return titletemplate;
    }

    public void setTitletemplate(String titletemplate) {
        this.titletemplate = titletemplate;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }
}