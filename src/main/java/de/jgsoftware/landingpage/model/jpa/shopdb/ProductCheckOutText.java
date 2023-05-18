package de.jgsoftware.landingpage.model.jpa.shopdb;

import javax.persistence.*;
import java.util.Objects;

@Entity
@javax.persistence.Table(name = "PRODUCT_CHECK_OUT_TEXT", schema = "PUBLIC", catalog = "SHOPDB")
public class ProductCheckOutText {
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
    @Column(name = "PRODUCT_NAME_DE")
    private String productNameDe;

    public String getProductNameDe() {
        return productNameDe;
    }

    public void setProductNameDe(String productNameDe) {
        this.productNameDe = productNameDe;
    }

    @Basic
    @Column(name = "PRODUCT_NAME_EN")
    private String productNameEn;

    public String getProductNameEn() {
        return productNameEn;
    }

    public void setProductNameEn(String productNameEn) {
        this.productNameEn = productNameEn;
    }

    @Basic
    @Column(name = "PRODUCT_NAME_ES")
    private String productNameEs;

    public String getProductNameEs() {
        return productNameEs;
    }

    public void setProductNameEs(String productNameEs) {
        this.productNameEs = productNameEs;
    }

    @Basic
    @Column(name = "PRODUCT_NAME_FR")
    private String productNameFr;

    public String getProductNameFr() {
        return productNameFr;
    }

    public void setProductNameFr(String productNameFr) {
        this.productNameFr = productNameFr;
    }

    @Basic
    @Column(name = "PRODUCT_NAME_IT")
    private String productNameIt;

    public String getProductNameIt() {
        return productNameIt;
    }

    public void setProductNameIt(String productNameIt) {
        this.productNameIt = productNameIt;
    }

    @Basic
    @Column(name = "PRODUCT_NAME_TR")
    private String productNameTr;

    public String getProductNameTr() {
        return productNameTr;
    }

    public void setProductNameTr(String productNameTr) {
        this.productNameTr = productNameTr;
    }

    @Basic
    @Column(name = "ARTIKELNUMMER")
    private Long artikelnummer;

    public Long getArtikelnummer() {
        return artikelnummer;
    }

    public void setArtikelnummer(Long artikelnummer) {
        this.artikelnummer = artikelnummer;
    }

    @Basic
    @Column(name = "ID_PRODUCTS")
    private Integer idProducts;

    public Integer getIdProducts() {
        return idProducts;
    }

    public void setIdProducts(Integer idProducts) {
        this.idProducts = idProducts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductCheckOutText that = (ProductCheckOutText) o;
        return Objects.equals(id, that.id) && Objects.equals(productNameDe, that.productNameDe) && Objects.equals(productNameEn, that.productNameEn) && Objects.equals(productNameEs, that.productNameEs) && Objects.equals(productNameFr, that.productNameFr) && Objects.equals(productNameIt, that.productNameIt) && Objects.equals(productNameTr, that.productNameTr) && Objects.equals(artikelnummer, that.artikelnummer) && Objects.equals(idProducts, that.idProducts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productNameDe, productNameEn, productNameEs, productNameFr, productNameIt, productNameTr, artikelnummer, idProducts);
    }
}
