package de.jgsoftware.landingpage.model.jpa.shopdb;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Objects;

@Entity
@javax.persistence.Table(name = "SPRING_SESSION_ATTRIBUTES", schema = "PUBLIC", catalog = "SHOPDB")
@IdClass(de.jgsoftware.landingpage.model.jpa.shopdb.SpringSessionAttributesPK.class)
public class SpringSessionAttributes {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "SESSION_PRIMARY_ID")
    private String sessionPrimaryId;

    public String getSessionPrimaryId() {
        return sessionPrimaryId;
    }

    public void setSessionPrimaryId(String sessionPrimaryId) {
        this.sessionPrimaryId = sessionPrimaryId;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "ATTRIBUTE_NAME")
    private String attributeName;

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    @Basic
    @Column(name = "ATTRIBUTE_BYTES")
    private byte[] attributeBytes;

    public byte[] getAttributeBytes() {
        return attributeBytes;
    }

    public void setAttributeBytes(byte[] attributeBytes) {
        this.attributeBytes = attributeBytes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpringSessionAttributes that = (SpringSessionAttributes) o;
        return Objects.equals(sessionPrimaryId, that.sessionPrimaryId) && Objects.equals(attributeName, that.attributeName) && Arrays.equals(attributeBytes, that.attributeBytes);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(sessionPrimaryId, attributeName);
        result = 31 * result + Arrays.hashCode(attributeBytes);
        return result;
    }
}
