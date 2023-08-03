package de.jgsoftware.landingpage.model.jpa.shopdb;

import javax.persistence.*;

/**
 *
 * @author hoscho
 */

@Entity
public class Users {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "USERNAME")
    private String username;
    @Basic
    @Column(name = "PASSWORD")
    private String password;
    @Basic
    @Column(name = "ROLE")
    private String role;
    @Basic
    @Column(name = "ENABLED")
    private Integer enabled;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }
}
