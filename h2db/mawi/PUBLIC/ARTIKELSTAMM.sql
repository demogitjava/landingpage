create table ARTIKELSTAMM
(
    ID                 INT          not null
        primary key,
    ARTIKELBEZEICHNUNG VARCHAR(255) not null,
    WG                 INT          not null,
    EK                 DOUBLE       not null,
    VK                 DOUBLE       not null,
    LETZEBUCHUNG       DATE         not null,
    ARTIKELNUMMER      LONG,
    SELECTIONCLIENT    INT,
    LETZEBUCHNUNG      TIMESTAMP
);

