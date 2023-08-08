package de.jgsoftware.landingpage.model.jpa.shopdb;

import javax.persistence.*;

/**
 *
 * @author hoscho
 */

@Entity
//@Table(name = "PRODUCT_CHECK_OUT_TEXT", schema = "PUBLIC", catalog = "SHOPDB")
public class ProductCheckOutText {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private Integer id;
    @Basic
    @Column(name = "PRODUCT_NAME_DE")
    private String productNameDe;
    @Basic
    @Column(name = "PRODUCT_NAME_EN")
    private String productNameEn;
    @Basic
    @Column(name = "PRODUCT_NAME_ES")
    private String productNameEs;
    @Basic
    @Column(name = "PRODUCT_NAME_FR")
    private String productNameFr;
    @Basic
    @Column(name = "PRODUCT_NAME_IT")
    private String productNameIt;
    @Basic
    @Column(name = "PRODUCT_NAME_TR")
    private String productNameTr;
    @Basic
    @Column(name = "ARTIKELNUMMER")
    private Long artikelnummer;
    @Basic
    @Column(name = "ID_PRODUCTS")
    private Integer idProducts;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductNameDe() {
        return productNameDe;
    }

    public void setProductNameDe(String productNameDe) {
        this.productNameDe = productNameDe;
    }

    public String getProductNameEn() {
        return productNameEn;
    }

    public void setProductNameEn(String productNameEn) {
        this.productNameEn = productNameEn;
    }

    public String getProductNameEs() {
        return productNameEs;
    }

    public void setProductNameEs(String productNameEs) {
        this.productNameEs = productNameEs;
    }

    public String getProductNameFr() {
        return productNameFr;
    }

    public void setProductNameFr(String productNameFr) {
        this.productNameFr = productNameFr;
    }

    public String getProductNameIt() {
        return productNameIt;
    }

    public void setProductNameIt(String productNameIt) {
        this.productNameIt = productNameIt;
    }

    public String getProductNameTr() {
        return productNameTr;
    }

    public void setProductNameTr(String productNameTr) {
        this.productNameTr = productNameTr;
    }

    public Long getArtikelnummer() {
        return artikelnummer;
    }

    public void setArtikelnummer(Long artikelnummer) {
        this.artikelnummer = artikelnummer;
    }

    public Integer getIdProducts() {
        return idProducts;
    }

    public void setIdProducts(Integer idProducts) {
        this.idProducts = idProducts;
    }
}
