create table book (
    ISBN varchar(255) not null,
    CREATE_DATETIME timestamp,
    MODIFY_DATETIME timestamp,
    CATEGORY_ID int,
    RELEASE_DATE date,
    PRICE int,
    PUBLISHER_NAME varchar(255),
    AUTHOR_NAME varchar(255),
    BOOK_NAME varchar(255),
    constraint book_PK primary key(ISBN)
);
