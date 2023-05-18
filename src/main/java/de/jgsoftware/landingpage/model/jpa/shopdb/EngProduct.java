package de.jgsoftware.landingpage.model.jpa.shopdb;

import javax.persistence.*;
import java.util.Objects;

@Entity
@javax.persistence.Table(name = "ENG_PRODUCT", schema = "PUBLIC", catalog = "SHOPDB")
public class EngProduct {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "ID")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "productName")
    private String productName;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EngProduct that = (EngProduct) o;
        return Objects.equals(id, that.id) && Objects.equals(productName, that.productName) && Objects.equals(productDescription, that.productDescription) && Objects.equals(productPrice, that.productPrice) && Objects.equals(productUnit, that.productUnit) && Objects.equals(image, that.image) && Objects.equals(landingpage, that.landingpage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productName, productDescription, productPrice, productUnit, image, landingpage);
    }
}
