CREATE TABLE IF NOT EXISTS Books
(
    id INT AUTO_INCREMENT PRIMARY KEY,
    bookNumber Varchar(255) Not Null,
    name Varchar(255) Not Null,
    category Varchar(255) Not Null,
    description TEXT,
    price decimal Not Null
);