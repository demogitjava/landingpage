create table AUTHORITIES
(
    USERNAME VARCHAR(50) not null
        references USERS (USERNAME),
    ROLE     VARCHAR(50) not null,
    ID       INT         not null,
    constraint AUTHORITIES_PK
        primary key (ID)
);

