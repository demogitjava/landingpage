create table REPORTS
(
    ID         INT not null,
    REPORTNAME VARCHAR(255),
    REPORTDATA BLOB,
    constraint REPORTS_PK
        primary key (ID)
);

