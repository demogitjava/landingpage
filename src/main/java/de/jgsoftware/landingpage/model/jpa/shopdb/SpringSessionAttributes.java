package de.jgsoftware.landingpage.model.jpa.shopdb;

import javax.persistence.*;

@Entity
@Table(name = "SPRING_SESSION_ATTRIBUTES", schema = "PUBLIC", catalog = "SHOPDB")
@IdClass(SpringSessionAttributesPK.class)
public class SpringSessionAttributes {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "SESSION_PRIMARY_ID")
    private String sessionPrimaryId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ATTRIBUTE_NAME")
    private String attributeName;
    @Basic
    @Column(name = "ATTRIBUTE_BYTES")
    private byte[] attributeBytes;

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

    public byte[] getAttributeBytes() {
        return attributeBytes;
    }

    public void setAttributeBytes(byte[] attributeBytes) {
        this.attributeBytes = attributeBytes;
    }
}
