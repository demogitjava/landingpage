package de.jgsoftware.landingpage.model.jpa.shopdb;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "PRODUCTS", schema = "PUBLIC", catalog = "SHOPDB")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @javax.persistence.Column(name = "productId")
    private Integer productId;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "PRODUCTNAME")
    private String productname;

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    @Basic
    @Column(name = "productDescription")
    private String productDescription;

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    @Basic
    @Column(name = "productPrice")
    private Double productPrice;

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    @Basic
    @Column(name = "productUnit")
    private Integer productUnit;

    public Integer getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(Integer productUnit) {
        this.productUnit = productUnit;
    }

    @Basic
    @Column(name = "IMAGE")
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Basic
    @Column(name = "LANDINGPAGE")
    private Integer landingpage;

    public Integer getLandingpage() {
        return landingpage;
    }

    public void setLandingpage(Integer landingpage) {
        this.landingpage = landingpage;
    }

    @Basic
    @Column(name = "productDescription_EN")
    private String productDescriptionEn;

    public String getProductDescriptionEn() {
        return productDescriptionEn;
    }

    public void setProductDescriptionEn(String productDescriptionEn) {
        this.productDescriptionEn = productDescriptionEn;
    }

    @Basic
    @Column(name = "productDescription_ES")
    private String productDescriptionEs;

    public String getProductDescriptionEs() {
        return productDescriptionEs;
    }

    public void setProductDescriptionEs(String productDescriptionEs) {
        this.productDescriptionEs = productDescriptionEs;
    }

    @Basic
    @Column(name = "productDescription_FR")
    private String productDescriptionFr;

    public String getProductDescriptionFr() {
        return productDescriptionFr;
    }

    public void setProductDescriptionFr(String productDescriptionFr) {
        this.productDescriptionFr = productDescriptionFr;
    }

    @Basic
    @Column(name = "productDescription_IT")
    private String productDescriptionIt;

    public String getProductDescriptionIt() {
        return productDescriptionIt;
    }

    public void setProductDescriptionIt(String productDescriptionIt) {
        this.productDescriptionIt = productDescriptionIt;
    }

    @Basic
    @Column(name = "productDescription_TR")
    private String productDescriptionTr;

    public String getProductDescriptionTr() {
        return productDescriptionTr;
    }

    public void setProductDescriptionTr(String productDescriptionTr) {
        this.productDescriptionTr = productDescriptionTr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;
        return Objects.equals(productId, products.productId) && Objects.equals(productname, products.productname) && Objects.equals(productDescription, products.productDescription) && Objects.equals(productPrice, products.productPrice) && Objects.equals(productUnit, products.productUnit) && Objects.equals(image, products.image) && Objects.equals(landingpage, products.landingpage) && Objects.equals(productDescriptionEn, products.productDescriptionEn) && Objects.equals(productDescriptionEs, products.productDescriptionEs) && Objects.equals(productDescriptionFr, products.productDescriptionFr) && Objects.equals(productDescriptionIt, products.productDescriptionIt) && Objects.equals(productDescriptionTr, products.productDescriptionTr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productname, productDescription, productPrice, productUnit, image, landingpage, productDescriptionEn, productDescriptionEs, productDescriptionFr, productDescriptionIt, productDescriptionTr);
    }
}
