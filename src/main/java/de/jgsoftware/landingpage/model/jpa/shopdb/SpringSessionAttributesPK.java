package de.jgsoftware.landingpage.model.jpa.shopdb;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class SpringSessionAttributesPK implements Serializable {
    @Column(name = "SESSION_PRIMARY_ID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String sessionPrimaryId;
    @Column(name = "ATTRIBUTE_NAME")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String attributeName;

    public String getSessionPrimaryId() {
        return sessionPrimaryId;
    }

    public void setSessionPrimaryId(String sessionPrimaryId) {
        this.sessionPrimaryId = sessionPrimaryId;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpringSessionAttributesPK that = (SpringSessionAttributesPK) o;
        return Objects.equals(sessionPrimaryId, that.sessionPrimaryId) && Objects.equals(attributeName, that.attributeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sessionPrimaryId, attributeName);
    }
}
