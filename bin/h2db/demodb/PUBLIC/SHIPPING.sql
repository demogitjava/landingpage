create table SHIPPING
(
    ID               INTEGER not null
        primary key,
    DESIGNATION      MEDIUMTEXT,
    DESIGNATIONSIZE  MEDIUMTEXT,
    COUNTRY          VARCHAR(255),
    SHIPPINGPROVIDER MEDIUMTEXT,
    YEAR             INT,
    "Price"          DOUBLE,
    CURRENCY         VARCHAR(255),
    STOREORONLINE    VARCHAR(255),
    DHLZONE          INTEGER
);

