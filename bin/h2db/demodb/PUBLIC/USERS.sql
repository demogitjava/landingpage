create table USERS
(
    ID       INT not null,
    EMAIL    VARCHAR(255),
    PASSWORD VARCHAR(255),
    ROLE     VARCHAR(255),
    USERNAME VARCHAR(255),
    ENABLED  INT,
    constraint USERS_PK
        primary key (ID)
);

