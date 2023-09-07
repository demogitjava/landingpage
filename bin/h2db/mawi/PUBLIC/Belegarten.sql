create table "Belegarten"
(
    ID                INT not null,
    "Belegart"        VARCHAR(255),
    BELEGNUMMERNKREIS LONG,
    constraint BELEGARTEN_PK
        primary key (ID)
);

