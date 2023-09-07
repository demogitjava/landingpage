create table USERDETAIL
(
    "id"           INT not null,
    USERNAME       VARCHAR(255),
    PASSWORD       VARCHAR(255),
    ROLE           VARCHAR(255),
    EMAIL          VARCHAR(255),
    VORNAME        VARCHAR(255),
    NACHNAME       VARCHAR(255),
    STRASSE        VARCHAR(255),
    PLZORT         VARCHAR(255),
    LAND           VARCHAR(255),
    TEL            VARCHAR(255),
    MOBIL          VARCHAR(255),
    BANKVERBINDUNG VARCHAR(255),
    POSITION       VARCHAR(255),
    JOINID         INT,
    IMAGE          BINARY,
    constraint USERDETAILS_PK
        primary key ("id")
);

