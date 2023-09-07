create table USERDATA
(
    ID       INT          not null
        primary key,
    EMAIL    VARCHAR(255) not null,
    PASSWORD VARCHAR(255) not null,
    ROLE     VARCHAR(255) not null,
    USERNAME VARCHAR(255) not null
);

