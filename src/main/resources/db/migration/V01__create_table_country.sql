CREATE TABLE country (
  id       bigserial NOT NULL,
  name     varchar(60),
  name_pt  varchar(60),
  initials varchar(2),
  bacen    integer,
  /* Keys */
  CONSTRAINT country_pkey
    PRIMARY KEY (id)
);