create table ENG_PRODUCT
(
    ID                   LONG not null,
    "productName"        VARCHAR(255),
    "productDescription" VARCHAR(255),
    "productPrice"       DOUBLE,
    "productUnit"        INT,
    IMAGE                VARCHAR(255),
    LANDINGPAGE          INT,
    constraint ENG_PRODUCT_PK
        primary key (ID)
);

