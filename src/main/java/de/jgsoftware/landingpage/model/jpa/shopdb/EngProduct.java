package de.jgsoftware.landingpage.model.jpa.shopdb;

import javax.persistence.*;

/**
 *
 * @author hoscho
 */

@Entity
//@Table(name = "ENG_PRODUCT", schema = "PUBLIC", catalog = "SHOPDB")
public class EngProduct {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private Long id;
    @Basic
    @Column(name = "productName")
    private String productName;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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
}
