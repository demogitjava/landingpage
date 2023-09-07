create table SPRING_SESSION
(
    PRIMARY_ID            CHAR(36) not null,
    SESSION_ID            CHAR(36) not null,
    CREATION_TIME         BIGINT   not null,
    LAST_ACCESS_TIME      BIGINT   not null,
    MAX_INACTIVE_INTERVAL INT      not null,
    EXPIRY_TIME           BIGINT   not null,
    PRINCIPAL_NAME        VARCHAR(100),
    constraint SPRING_SESSION_PK
        primary key (PRIMARY_ID)
);

create unique index SPRING_SESSION_IX1
    on SPRING_SESSION (SESSION_ID);

create index SPRING_SESSION_IX2
    on SPRING_SESSION (EXPIRY_TIME);

create index SPRING_SESSION_IX3
    on SPRING_SESSION (PRINCIPAL_NAME);

