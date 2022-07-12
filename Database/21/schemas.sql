
-- Postgres
CREATE DATABASE student_cms_plusplus WITH ENCODING 'UTF8';

CREATE TABLE IF NOT EXISTS student (
    id SERIAL NOT NULL PRIMARY KEY,
    name varchar(45),
    mssv varchar(7),
    password varchar(45),
    phone varchar(10),
    address text,
    age int,
    email varchar,
    created_timestamp timestamp,
    last_updated_timestamp timestamp
);

CREATE TABLE IF NOT EXISTS class (
     id SERIAL NOT NULL PRIMARY KEY,
     name varchar,
     major varchar,
     total_student int,
     teacher_name varchar,
     teacher_phone varchar,
     created_timestamp timestamp,
     last_updated_timestamp timestamp
);

CREATE TABLE IF NOT EXISTS student_class (
     student_id INT NOT NULL,
     FOREIGN KEY (student_id) REFERENCES student (id),
    class_id INT NOT NULL,
    FOREIGN KEY (class_id) REFERENCES class (id)
);



