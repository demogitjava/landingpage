package de.jgsoftware.landingpage.model.jpa.shopdb;

import javax.persistence.*;

/**
 *
 * @author hoscho
 */

@Entity
public class Authorities {
    @Basic
    @Column(name = "USERNAME")
    private String username;
    @Basic
    @Column(name = "ROLE")
    private String role;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private Integer id;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
