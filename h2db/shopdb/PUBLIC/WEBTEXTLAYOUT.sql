create table WEBTEXTLAYOUT
(
    ID            INT not null,
    FRAMENAME     VARCHAR(255),
    DE            VARCHAR(255),
    EN            VARCHAR(255),
    FR            VARCHAR(255),
    ES            VARCHAR(255),
    IT            VARCHAR(255),
    TR            VARCHAR(255),
    BINDTO        VARCHAR(255),
    TEMPLATE      VARCHAR(255),
    TITLETEMPLATE VARCHAR(255),
    COMP_NAME     VARCHAR(255),
    constraint WEBTEXTLAYOUT_PK
        primary key (ID)
);

