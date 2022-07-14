CREATE TABLE IF NOT EXISTS Cripto(
    id          BIGINT PRIMARY KEY,
    BTC         VARCHAR (50)    NOT NULL ,
    USD         VARCHAR (100)   NOT NULL,
    EUR         VARCHAR (100)   NOT NULL,
    budget      DECIMAL         NOT NULL

)