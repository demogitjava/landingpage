package de.jgsoftware.landingpage.model.jpa.shopdb;

import javax.persistence.*;

@Entity
public class Shoppingcart {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private Integer id;
    @Basic
    @Column(name = "USER_ID")
    private Integer userId;
    @Basic
    @Column(name = "PRODUCT_ID")
    private Long productId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
}
