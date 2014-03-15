create table groups (id int primary key auto_increment, name varchar(120) not null);
create table products (id int primary key auto_increment, name varchar(120) not null, groupid int not null, price int default 0);

insert into groups (id, name) values (1, 'Grocery'), (2, 'Drinks'), (3, 'Non-food');

insert into products (name, groupid, price) values
    ('Bread crumbs', 1, 10),
    ('Cocoa (nuts)', 1, 22),
    ('Sugar 1lb', 1, 15),
    ('Heather Ale', 2, 50),
    ('Coca-Cola', 2, 12),
    ('Schwabra', 3, 40);