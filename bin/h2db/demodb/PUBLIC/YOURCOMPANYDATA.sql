create table YOURCOMPANYDATA
(
    ID              INT not null,
    FIRMENNAME      VARCHAR(255),
    STRASSE         VARCHAR(255),
    PLZ             INT not null,
    ORT             VARCHAR(255),
    TELEFON         VARCHAR(255),
    EMAIL           VARCHAR(255),
    FIRMENNUMMER    INT not null,
    STEUERNUMMER    VARCHAR(255),
    USTIDNR         VARCHAR(255),
    GESCHÄFTSFÜHRER VARCHAR(255),
    AMTSGERICHT     VARCHAR(255),
    BANK            VARCHAR(255),
    KONTOINHABER    VARCHAR(255),
    IBAN            VARCHAR(255),
    constraint YOURCOMPANYDATA_PK
        primary key (ID)
);

