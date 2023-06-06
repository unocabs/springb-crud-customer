DROP SCHEMA IF EXISTS rosgian CASCADE;
CREATE SCHEMA rosgian;

CREATE TABLE rosgian.USERS (
                               id integer,
                               email varchar(45) not null unique,
                               password varchar(15) not null,
                               first_name varchar(45),
                               last_name varchar(45),
                               PRIMARY KEY (id)
);