create table BUCHUNGSDATEN
(
    ID            INT          not null
        primary key,
    KDNUMMER      LONG         not null,
    KDNAME        VARCHAR(255) not null,
    BELEG         INT          not null,
    WG            INT          not null,
    VK            DOUBLE       not null,
    BDATUM        DATE         not null,
    ARTIKELNUMMER LONG,
    BELEGART      INT,
    BUCHUNGSKZ    INT,
    MENGE         INT
);

