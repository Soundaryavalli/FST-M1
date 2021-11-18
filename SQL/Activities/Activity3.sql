REM   Script: Session 03
REM   Activity3





select * from salesman;

delete from salesman where salesman_name ='Nail Knite';

select * from salesman;

select * from salesman 
order by commission;

select * from salesman 
order by commission desc, 
salesman_city asc;

select * from salesman 
order by  
salesman_city asc;

select * from salesman 
order by  
salesman_city desc;

Alter table salesman 
add salary int;

update salesman 
set salary = 1000 
where salesman_id=5003;

update salesman 
set salary = 1000 
where salesman_id=5005;

update salesman 
set salary = 2000 
where salesman_id=5006;

update salesman 
set salary = 2000 
where salesman_id=5007;

update salesman 
set salary = 3000 
where salesman_id=5002;

select * from salesman;

select * from salesman 
where salary = 1000 
and 
salesman_id =5007;

select * from salesman 
where salary = 1000 
and 
salesman_id =5007;

select * from salesman 
where salary >= 1000 
and 
salesman_id =5007;

select * from salesman 
where salary <= 1000 
and 
salesman_id =5007;

select * from salesman 
;

select * from salesman 
where salary <= 1000 
;

select * from salesman 
where salary <= 1000 
;

select * from salesman 
where salary <= 1000 
and 
salesman_id =5007;

select * from salesman 
where salary <= 1000 
and 
salesman_id =5003;

select * from salesman 
where salary <= 1000 
or 
salesman_id =5003;

select * from salesman 
where not 
salesman_id =5003;

select Distinct salary from salesman;

select Distinct salary from salesman 
order by salary desc;
