CREATE TABLE book (
    id VARCHAR NOT NULL PRIMARY KEY,
    title VARCHAR NOT NULL,
    author VARCHAR NOT NULL,
    publishingCompany VARCHAR NOT NULL,
    ISBN_CODE VARCHAR NOT NULL,
    active BOOLEAN NOT NULL,
    rentalPrice DECIMAL NOT NULL
);