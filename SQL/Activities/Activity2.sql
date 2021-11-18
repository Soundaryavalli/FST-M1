REM   Script: Session 02
REM   Activity2

Create table Saleswoman( 
Saleswoman_ID int, 
saleswoman_name varchar(20), 
saleswoman_city varchar(20), 
commission  int);

Describe Saleswoman


Describe Saleswoman


Insert into Saleswoman values( 1,'Soundarya','Pondy', 15);

Insert into Saleswoman values( 2,'Shri','Chennai', 15);

 Insert into Saleswoman values( 3,'Sudha','Villupuram', 25);

  Insert into Saleswoman values( 3,'Parimala','Pondy', 45);

Select * from Saleswoman;

Select saleswoman_id,saleswoman_city  from Saleswoman;

Select saleswoman_id,saleswoman_city  from Saleswoman;

Select saleswoman_id,saleswoman_city  from Saleswoman;

Select * from Saleswoman where saleswoman_city='Pondy' ;

Select commission, saleswoman_id from Saleswoman where saleswoman_name='Shri' ;

Update Saleswoman  
Set Saleswoman_id =4 where saleswoman_name='Pari';

select * from saleswoman;

Update Saleswoman  
Set Saleswoman_id = 4 where saleswoman_name='Parimala';

