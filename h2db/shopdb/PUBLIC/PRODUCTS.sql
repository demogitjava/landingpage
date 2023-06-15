create table PRODUCTS
(
    "productId"             INT not null,
    PRODUCTNAME             VARCHAR(255),
    "productDescription"    MEDIUMTEXT,
    "productPrice"          DOUBLE,
    "productUnit"           INT,
    IMAGE                   VARCHAR(255),
    LANDINGPAGE             INT,
    "productDescription_EN" MEDIUMTEXT,
    "productDescription_ES" MEDIUMTEXT,
    "productDescription_FR" MEDIUMTEXT,
    "productDescription_IT" MEDIUMTEXT,
    "productDescription_TR" MEDIUMTEXT,
    constraint PRODUCT_PK
        primary key ("productId")
);

