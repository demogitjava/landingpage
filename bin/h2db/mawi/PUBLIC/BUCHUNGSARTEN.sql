create table BUCHUNGSARTEN
(
    ID              INT not null,
    BUCHUNGSVORGANG VARCHAR(255),
    BUCHUNGSART     INT,
    constraint BUCHUNGSARTEN_PK
        primary key (ID)
);

