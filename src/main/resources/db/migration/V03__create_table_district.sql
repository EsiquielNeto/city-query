CREATE TABLE district (
  id         bigserial NOT NULL,
  name       varchar(60),
  uf         varchar(2),
  ibge       integer,
  country_id integer,
  ddd        json,
  /* Keys */
  CONSTRAINT district_pkey
    PRIMARY KEY (id)
);