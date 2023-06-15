create table SPRING_SESSION
(
    PRIMARY_ID            CHAR(36) not null,
    SESSION_ID            CHAR(36),
    CREATION_TIME         BIGINT,
    LAST_ACCESS_TIME      BIGINT,
    MAX_INACTIVE_INTERVAL INT,
    EXPIRY_TIME           BIGINT,
    PRINCIPAL_NAME        VARCHAR(100),
    PRIMARYID             INTEGER  not null,
    CREATIONTIME          BIGINT,
    EXPIRYTIME            BIGINT,
    LASTACCESSTIME        BIGINT,
    MAXINACTIVEINTERVAL   INTEGER,
    PRINCIPALNAME         VARCHAR(255),
    SESSIONID             INTEGER,
    constraint SPRING_SESSION_PK
        primary key (PRIMARY_ID)
);

