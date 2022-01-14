SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

CREATE TABLE city (
    id bigint NOT NULL,
    name character varying(120) DEFAULT NULL::character varying,
    uf integer,
    ibge integer,
    lat_lon point
);

ALTER TABLE city OWNER TO postgres;

CREATE SEQUENCE public.city_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE city_id_seq OWNER TO postgres;

ALTER SEQUENCE city_id_seq OWNED BY public.city.id;

ALTER TABLE ONLY city ALTER COLUMN id SET DEFAULT nextval('public.city_id_seq'::regclass);
