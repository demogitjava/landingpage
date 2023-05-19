package de.jgsoftware.landingpage.model.jpa.shopdb;

import javax.persistence.*;

@Entity
public class Products {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "productId")
    private Integer productId;
    @Basic
    @Column(name = "PRODUCTNAME")
    private String productname;
    @Basic
    @Column(name = "productDescription")
    private String productDescription;
    @Basic
    @Column(name = "productPrice")
    private Double productPrice;
    @Basic
    @Column(name = "productUnit")
    private Integer productUnit;
    @Basic
    @Column(name = "IMAGE")
    private String image;
    @Basic
    @Column(name = "LANDINGPAGE")
    private Integer landingpage;
    @Basic
    @Column(name = "productDescription_EN")
    private String productDescriptionEn;
    @Basic
    @Column(name = "productDescription_ES")
    private String productDescriptionEs;
    @Basic
    @Column(name = "productDescription_FR")
    private String productDescriptionFr;
    @Basic
    @Column(name = "productDescription_IT")
    private String productDescriptionIt;
    @Basic
    @Column(name = "productDescription_TR")
    private String productDescriptionTr;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(Integer productUnit) {
        this.productUnit = productUnit;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getLandingpage() {
        return landingpage;
    }

    public void setLandingpage(Integer landingpage) {
        this.landingpage = landingpage;
    }

    public String getProductDescriptionEn() {
        return productDescriptionEn;
    }

    public void setProductDescriptionEn(String productDescriptionEn) {
        this.productDescriptionEn = productDescriptionEn;
    }

    public String getProductDescriptionEs() {
        return productDescriptionEs;
    }

    public void setProductDescriptionEs(String productDescriptionEs) {
        this.productDescriptionEs = productDescriptionEs;
    }

    public String getProductDescriptionFr() {
        return productDescriptionFr;
    }

    public void setProductDescriptionFr(String productDescriptionFr) {
        this.productDescriptionFr = productDescriptionFr;
    }

    public String getProductDescriptionIt() {
        return productDescriptionIt;
    }

    public void setProductDescriptionIt(String productDescriptionIt) {
        this.productDescriptionIt = productDescriptionIt;
    }

    public String getProductDescriptionTr() {
        return productDescriptionTr;
    }

    public void setProductDescriptionTr(String productDescriptionTr) {
        this.productDescriptionTr = productDescriptionTr;
    }
}
