create table book (
    ISBN varchar(255) not null,
    CREATE_DATETIME int,
    MODIFY_DATETIME int,
    CATEGORY_ID int,
    RELEASE_DATE int,
    PRICE int,
    PUBLISHER_NAME varchar(255),
    AUTHOR_NAME varchar(255),
    BOOK_NAME varchar(255),
    constraint book_PK primary key(ISBN)
);
