select * from orders ;

create table orders (  
order_no int primary key ,   
purchase_amount float ,  
order_date date,  
customer_id int ,  
Salesman_id int);

insert all   
into orders values(70007,150.5,TO_DATE('2012/10/05','YYYY/MM/DD'),3002,5001)  
into orders values(70005,270.5,TO_DATE('2012/08/17','YYYY/MM/DD'),3009,5003)  
into orders values(70011,75.25,TO_DATE('2012/08/17','YYYY/MM/DD'),3009,5003)  
SELECT 1 FROM DUAL ;

select * from orders;

select * from orders  
where Purchase_Amount>500;

select * from orders  
where 1000<=Purchase_amount<=2000;

insert all   
into orders values(70007,150.5,TO_DATE('2012/10/05','YYYY/MM/DD'),3002,5001)  
into orders values(70005,270.5,TO_DATE('2012/08/17','YYYY/MM/DD'),3009,5003)  
into orders values(70011,75.25,TO_DATE('2012/08/17','YYYY/MM/DD'),3009,5003)  
SELECT 1 FROM DUAL  
 
select * from orders;

select * from orders  
where Purchase_Amount>500;

select * from orders  
where 1000<=Purchase_amount and Purchase_amount <=2000;

select * from orders  
where 1000<=Purchase_amount and Purchase_amount <=2000;

select * from orders;

select sum(purchase_amount) from orders;

select avg(purchase_amount) from orders;

select Max(purchase_amount) from orders;

select min(purchase_amount) from orders;

select count(distinct salesman_id) from orders;

select * from orders;

Describe orders


select customer_id,max(purchase_amount) from orders group by customer_id;

select salesman_id , order_date max(Purchase_amount) as Max_amount from orders  
where order_date =To_date('2012/08/17','YYYY/MM/DD')  
group by salesman_id , order_date ;

select salesman_id , order_date max(Purchase_amount) as "Max_amount" 
from orders  
where order_date =To_date('2012/08/17','YYYY/MM/DD')  
group by salesman_id , order_date ;

select * from orders;

select salesman_id , order_date max(Purchase_amount) as "Max_amount" 
from orders  
where order_date =To_date('2012/08/17','YYYY/MM/DD')  
group by salesman_id , order_date ;

select salesman_id , order_date, max(Purchase_amount) as "Max_amount" 
from orders  
where order_date =To_date('2012/08/17','YYYY/MM/DD')  
group by salesman_id , order_date ;

select customer_id , oreder_date,Max(purchase_amount) As "Max_amount"  
from orders  
group by customer_id , order_date  
Having Max(purchase_amount) in (2030,3450,5760,6000);

select customer_id , order_date,Max(purchase_amount) As "Max_amount"  
from orders  
group by customer_id , order_date  
Having Max(purchase_amount) in (2030,3450,5760,6000);

create table customers( 
customer_id int primary key , 
customer_name varchar(32), 
city varchar(20), 
grade int , 
salesman_id int);

insert into customers values  
(3002,'NR','New York',100,5001), 
(3007,'BD','NY',200,5001), 
(30054,'GZ','California',200,5002), 
(3003,'JG','London',300,5002);

insert into customers values ( 
(3002,'NR','New York',100,5001), 
(3007,'BD','NY',200,5001), 
(30054,'GZ','California',200,5002), 
(3003,'JG','London',300,5002));

insert into customers values  
(3002,'NR','New York',100,5001), 
(3007,'BD','NY',200,5001), 
(30054,'GZ','California',200,5002), 
(3003,'JG','London',300,5002);

insert into customers values  
(3002,'NR','New York',100,5001), 
(3007,'BD','NY',200,5001), 
(3005,'GZ','California',200,5002), 
(3003,'JG','London',300,5002);

insert into   customers values  
    (3002,'NR','New York',100,5001), 
(3007,'BD','NY',200,5001), 
(3005,'GZ','California',200,5002), 
(3003,'JG','London',300,5002);

insert into   customers values 
(3002,'NR','New York',100,5001), 
(3007,'BD','NY',200,5001), 
(3005,'GZ','California',200,5002), 
(3003,'JG','London',300,5002);

insert into   customers values 
(3002,'NR','New York',100,5001);

insert into   customers values 
--(3002,'NR','New York',100,5001);

(3007,'BD','NY',200,5001);

insert into   customers values 
(3007,'BD','NY',200,5001);

insert into   customers values 
(3005,'GZ','California',200,5002);

insert into   customers values 
 
(3003,'JG','London',300,5002);

select * from customers;

select a.customer_name ,a.city,b.name ,b.commission from customer a inner join salesman b  
on a.salesman_id=b.salesman_id;

create table salesman(  
Salesman_id number,  
Salesman_name varchar2(32),  
Salesman_city varchar2(32),  
commission Number  
);

create table salesman(  
Salesman_id number,  
Salesman_name varchar2(32),  
Salesman_city varchar2(32),  
commission Number  
) 
 
select a.customer_name , 
a.city, 
b.name, 
b.commission 
from customer a 
inner join salseman b 
on a.salesman_id=b.salesman_id;

create table salesman(  
Salesman_id number,  
Salesman_name varchar2(32),  
Salesman_city varchar2(32),  
commission Number  
);

select a.customer_name , 
a.city, 
b.name, 
b.commission 
from customer a 
inner join salseman b 
on a.salesman_id=b.salesman_id;

create table salesman(  
Salesman_id number,  
Salesman_name varchar2(32),  
Salesman_city varchar2(32),  
commission Number  
);

create table customers( 
customer_id int primary key , 
customer_name varchar(20), 
city varchar(20), 
grade int , 
salesman_id int );

select a.customer_name , 
a.city, 
b.name, 
b.commission 
from customer a 
inner join salseman b 
on a.salesman_id=b.salesman_id;

select a.customer_name , 
a.city, 
b.name, 
b.commission 
from customer a 
inner join salseman b 
on a.salesman_id=b.salesman_id;

select a.customer_name , 
a.city, 
b.name, 
b.commission 
from customers a 
inner join salseman b 
on a.salesman_id=b.salesman_id;

create table salesman(  
Salesman_id number,  
Salesman_name varchar2(32),  
Salesman_city varchar2(32),  
commission Number  
);

create table customers( 
customer_id int primary key , 
customer_name varchar(20), 
city varchar(20), 
grade int , 
salesman_id int );

create table salesman1(  
Salesman_id number,  
Salesman_name varchar2(32),  
Salesman_city varchar2(32),  
commission Number  
);

create table customers1( 
customer_id int primary key , 
customer_name varchar(20), 
city varchar(20), 
grade int , 
salesman_id int );

select a.customer_name , 
a.city, 
b.name, 
b.commission 
from customers1 a 
inner join salseman1 b 
on a.salesman_id=b.salesman_id;

select a.customer_name , 
a.city, 
b.name, 
b.commission 
from customers1 a 
inner join salesman1 b 
on a.salesman_id=b.salesman_id;

select a.customer_name , 
a.city, 
b.customer_name, 
b.commission 
from customers1 a 
inner join salesman1 b 
on a.salesman_id=b.salesman_id;

select a.customer_name , 
a.city, 
a.customer_name, 
b.commission 
from customers1 a 
inner join salesman1 b 
on a.salesman_id=b.salesman_id;

select a.customer_name ,a.city,a.grade,b.name b.city from customers1  
a  
left outer join 
salesman1 b 
on a.salesman_id=b.salesman_id  
where a.grade<300 
order by a.customer_id;

select a.customer_name ,a.city,a.grade,b.name b.city from customers1 a 
left outer join salesman1 b 
on a.salesman_id=b.salesman_id  
where a.grade<300 
order by a.customer_id;

select a.customer_name ,a.city,a.grade,b.name,b.city from  
customers1 a left outer join salesman1 b 
on a.salesman_id=b.salesman_id  
where a.grade<300 
order by a.customer_id;

select a.customer_name ,a.city,a.grade,b.name,b.salesman_city from  
customers1 a left outer join salesman1 b 
on a.salesman_id=b.salesman_id  
where a.grade<300 
order by a.customer_id;

select a.customer_name ,a.city,a.grade,b.salesman_name,b.salesman_city from  
customers1 a left outer join salesman1 b 
on a.salesman_id=b.salesman_id  
where a.grade<300 
order by a.customer_id;

select a.customer_name ,a.city,b.name b.commission from customer a  
inner join salesman b  
on a.salesman_id=b.salesman_id  
where b.comisssion>12;

select a.customer_name ,a.city,b.name ,b.commission from customer a  
inner join salesman b  
on a.salesman_id=b.salesman_id  
where b.comisssion>12;

select a.customer_name ,a.city,b.name ,b.commission from customers1 a  
inner join salesman1 b  
on a.salesman_id=b.salesman_id  
where b.comisssion>12;

select a.customer_name ,a.city,b.name ,b.commission from customers1 a  
inner join salesman1 b  
on a.salesman_id=b.salesman_id  
where b.comisssion>12;

select a.customer_name ,a.city,b.name ,b.commission from customers1 a  
inner join salesman1 b  
on a.salesman_id=b.salesman_id  
where b.commission>12;

select a.customer_name ,a.city,b.salesman_name ,b.commission from customers1 a  
inner join salesman1 b  
on a.salesman_id=b.salesman_id  
where b.commission>12;

select * from orders  
where salesman_id =(select distinct salesman_id from orders where customer_id =3007);

select * from orders where  
salesman_id in (select salesman_id from salesman where city='NewYork');

select * from orders where  
salesman_id in (select salesman_id from salesman where salesman_city='NewYork');

select grade ,count(*) from customers  
group by grade having grade >(select avg(grade) from customers where city ='NewYOrk');

select order_no, purchase_amount, order_date ,salesman_id  
from orders  
where salesman_id in (select salesman_id from salesman where commission 
=(select MAX(commission) froma salesman );

select order_no, purchase_amount, order_date ,salesman_id  
from orders  
where salesman_id in (select salesman_id from salesman where commission 
=(select MAX(commission) from salesman );

select order_no, purchase_amount, order_date ,salesman_id  
from orders  
where salesman_id in (select salesman_id from salesman where commission 
=(select MAX(commission) from salesman ));

select customer_id ,customer_name from customers a 
where 1< 
(select count(*) from orders b where a.customer_id=b.customer_id) 
Union 
select salesman_id ,salesman_name from salesman a  
where 1< 
(select count(*) from orders b where a.salesman_id =b.salesman_id) 
order by customer_name;

select a.salesman_id,name ,order_no,order_date from salesman a , orders b  
where a.salesman_id=b.salesman_id 
and b.purchase_amount=(select Max(purachse_amount) from orders c where c.order_date =b.order_date) 
UNION 
select a.salesman_id , name ,order_no,order_date  
from salesman a, orders b 
where a.salesman_id=b.salesman_id 
and b.purchase_amount=(select min(purchase_amount) from orders c where c.order_date=b.order_date);

select a.salesman_id,salesman_name ,order_no,order_date from salesman a , orders b  
where a.salesman_id=b.salesman_id 
and b.purchase_amount=(select Max(purachse_amount) from orders c where c.order_date =b.order_date) 
UNION 
select a.salesman_id , salesman_name ,order_no,order_date  
from salesman a, orders b 
where a.salesman_id=b.salesman_id 
and b.purchase_amount=(select min(purchase_amount) from orders c where c.order_date=b.order_date);

describe orders 


select a.salesman_id,salesman_name ,order_no,order_date from salesman a , orders b  
where a.salesman_id=b.salesman_id 
and b.purchase_amount=(select Max(purchase_amount) from orders c where c.order_date =b.order_date) 
UNION 
select a.salesman_id , salesman_name ,order_no,order_date  
from salesman a, orders b 
where a.salesman_id=b.salesman_id 
and b.purchase_amount=(select min(purchase_amount) from orders c where c.order_date=b.order_date);

where b.commission>12;


select a.salesman_id,salesman_name ,order_no,order_date from salesman a , orders b  
where a.salesman_id=b.salesman_id 
and b.purchase_amount=(select Max(purchase_amount) from orders c where c.order_date =b.order_date);

select a.salesman_id , salesman_name ,order_no,order_date  
from salesman a, orders b 
where a.salesman_id=b.salesman_id 
and b.purchase_amount=(select min(purchase_amount) from orders c where c.order_date=b.order_date);

select a.salesman_id,salesman_name ,order_no,order_date from salesman a , orders b  
where a.salesman_id=b.salesman_id 
and b.purchase_amount=(select Max(purchase_amount) from orders c where c.order_date =b.order_date) 
UNION 
select a.salesman_id , salesman_name ,order_no,order_date  
from salesman a, orders b 
where a.salesman_id=b.salesman_id 
and b.purchase_amount=(select min(purchase_amount) from orders c where c.order_date=b.order_date);

