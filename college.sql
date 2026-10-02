-- Active: 1790587521170@@127.0.0.1@3306@company_db
create DATABASE college;

use college;

create table student(
    id INT PRIMARY KEY,
    name VARCHAR(50),
    department VARCHAR(50)
);

insert into student values
(1,'john','cse'),
(2,'alice','ece'),
(3,'david','IT');

select * from student;