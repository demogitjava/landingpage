create table USERS
(
    "id"     LONG not null,
    USERNAME VARCHAR(255),
    PASSWORD VARCHAR(255),
    ROLE     VARCHAR(255),
    ENABLED  INT,
    constraint USERDETAILS_PK
        primary key ("id")
);

