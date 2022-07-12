INSERT INTO student
VALUES (default, 'Brad Pitt', '1234567', 'password', '012345679', 'address1', 15, 'fakeemail@email.com',
        to_timestamp('2022-07-12 09:30:20', 'YYYY-MM-DD HH:MI:SS'), now());

INSERT INTO class
VALUES (default,'A12', 'English',1,'Messi', '09430429',to_timestamp('2021-07-12 09:30:20', 'YYYY-MM-DD HH:MI:SS'), now());

INSERT INTO student_class VALUES ((SELECT id FROM student where id = 1),(SELECT id FROM class where id = 1));