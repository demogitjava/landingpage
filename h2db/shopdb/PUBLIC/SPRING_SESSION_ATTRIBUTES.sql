create table SPRING_SESSION_ATTRIBUTES
(
    SESSION_PRIMARY_ID CHAR(36)      not null,
    ATTRIBUTE_NAME     VARCHAR(200)  not null,
    ATTRIBUTE_BYTES    LONGVARBINARY not null,
    constraint SPRING_SESSION_ATTRIBUTES_PK
        primary key (SESSION_PRIMARY_ID, ATTRIBUTE_NAME),
    constraint SPRING_SESSION_ATTRIBUTES_FK
        foreign key (SESSION_PRIMARY_ID) references SPRING_SESSION
            on delete cascade
);

