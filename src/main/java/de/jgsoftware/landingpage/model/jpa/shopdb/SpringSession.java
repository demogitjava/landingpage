package de.jgsoftware.landingpage.model.jpa.shopdb;

import javax.persistence.*;
import java.util.Objects;

@Entity
@javax.persistence.Table(name = "SPRING_SESSION", schema = "PUBLIC", catalog = "SHOPDB")
public class SpringSession {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "PRIMARY_ID")
    private String primaryId;

    public String getPrimaryId() {
        return primaryId;
    }

    public void setPrimaryId(String primaryId) {
        this.primaryId = primaryId;
    }

    @Basic
    @Column(name = "SESSION_ID")
    private String sessionId;

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    @Basic
    @Column(name = "CREATION_TIME")
    private Long creationTime;

    public Long getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }

    @Basic
    @Column(name = "LAST_ACCESS_TIME")
    private Long lastAccessTime;

    public Long getLastAccessTime() {
        return lastAccessTime;
    }

    public void setLastAccessTime(Long lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }

    @Basic
    @Column(name = "MAX_INACTIVE_INTERVAL")
    private Integer maxInactiveInterval;

    public Integer getMaxInactiveInterval() {
        return maxInactiveInterval;
    }

    public void setMaxInactiveInterval(Integer maxInactiveInterval) {
        this.maxInactiveInterval = maxInactiveInterval;
    }

    @Basic
    @Column(name = "EXPIRY_TIME")
    private Long expiryTime;

    public Long getExpiryTime() {
        return expiryTime;
    }

    public void setExpiryTime(Long expiryTime) {
        this.expiryTime = expiryTime;
    }

    @Basic
    @Column(name = "PRINCIPAL_NAME")
    private String principalName;

    public String getPrincipalName() {
        return principalName;
    }

    public void setPrincipalName(String principalName) {
        this.principalName = principalName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpringSession that = (SpringSession) o;
        return Objects.equals(primaryId, that.primaryId) && Objects.equals(sessionId, that.sessionId) && Objects.equals(creationTime, that.creationTime) && Objects.equals(lastAccessTime, that.lastAccessTime) && Objects.equals(maxInactiveInterval, that.maxInactiveInterval) && Objects.equals(expiryTime, that.expiryTime) && Objects.equals(principalName, that.principalName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(primaryId, sessionId, creationTime, lastAccessTime, maxInactiveInterval, expiryTime, principalName);
    }
}
