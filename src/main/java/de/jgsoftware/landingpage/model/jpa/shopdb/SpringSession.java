package de.jgsoftware.landingpage.model.jpa.shopdb;

import javax.persistence.*;

@Entity
@Table(name = "SPRING_SESSION", schema = "PUBLIC", catalog = "SHOPDB")
public class SpringSession {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "PRIMARY_ID")
    private String primaryId;
    @Basic
    @Column(name = "SESSION_ID")
    private String sessionId;
    @Basic
    @Column(name = "CREATION_TIME")
    private Long creationTime;
    @Basic
    @Column(name = "LAST_ACCESS_TIME")
    private Long lastAccessTime;
    @Basic
    @Column(name = "MAX_INACTIVE_INTERVAL")
    private Integer maxInactiveInterval;
    @Basic
    @Column(name = "EXPIRY_TIME")
    private Long expiryTime;
    @Basic
    @Column(name = "PRINCIPAL_NAME")
    private String principalName;

    public String getPrimaryId() {
        return primaryId;
    }

    public void setPrimaryId(String primaryId) {
        this.primaryId = primaryId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Long getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }

    public Long getLastAccessTime() {
        return lastAccessTime;
    }

    public void setLastAccessTime(Long lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }

    public Integer getMaxInactiveInterval() {
        return maxInactiveInterval;
    }

    public void setMaxInactiveInterval(Integer maxInactiveInterval) {
        this.maxInactiveInterval = maxInactiveInterval;
    }

    public Long getExpiryTime() {
        return expiryTime;
    }

    public void setExpiryTime(Long expiryTime) {
        this.expiryTime = expiryTime;
    }

    public String getPrincipalName() {
        return principalName;
    }

    public void setPrincipalName(String principalName) {
        this.principalName = principalName;
    }
}
