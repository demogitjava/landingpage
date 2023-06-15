create table USERAGENT
(
    ID               LONG not null
        primary key,
    IPADDRESS        VARCHAR(255),
    STBROWSER        VARCHAR(255),
    STBROWSERVERSION VARCHAR(255),
    STSYSTEM         VARCHAR(255),
    STLANGUAGE       VARCHAR(255),
    DATUM            DATE,
    TIMESTAMP        TIMESTAMP
);

