REM   Script: Session 04
REM   Activity4

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

SELECT 1 FROM DUAL;

SELECT 1 FROM DUAL;

Insert INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

Insert INTO salesman VALUES(5005, 'Pit Alex', 'London', 11);

    Insert INTO salesman VALUES(5006, 'McLyon', 'Paris', 14);

    Insert INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13);

    Insert INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12);

Select * from salesman;

alter table salesman 
add phonenum int;

update salesman 
set phonenum = 12345789 
where salesman_id =5002;

update salesman 
set phonenum = 12345788 
where salesman_id =5003;

select * from salesman;

update salesman 
set phonenum = 12345888 
where salesman_id =5005;

update salesman 
set phonenum = 12355888 
where salesman_id =5006;

update salesman 
set phonenum = 12335888 
where salesman_id =5007;