create table BOOTSTRAP_COMPONENTS
(
    ID          INT not null,
    BTCOMPNAME  VARCHAR(255),
    TXBOOTSTRAP MEDIUMTEXT,
    constraint BOOTSTRAP_TXTCOMPONENTS_PK
        primary key (ID)
);

