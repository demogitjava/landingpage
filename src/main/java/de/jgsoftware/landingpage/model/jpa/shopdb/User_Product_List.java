package de.jgsoftware.landingpage.model.jpa.shopdb;

import javax.persistence.*;


@Entity
@Table(name = "USER_PRODUCT_LIST", schema = "PUBLIC", catalog = "SHOPDB")
public class User_Product_List
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long user_id;

    private Long product_id;

    private Integer id;

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
