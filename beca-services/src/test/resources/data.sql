INSERT INTO users (id,ds_name,ds_lastname,age)
VALUES
(1,"NOMBRE 1","APELLIDO 2",20),
(2,"NOMBRE 2","APELLIDO 3",20),
(3,"NOMBRE 3","APELLIDO 4",20),
(4,"NOMBRE 4","APELLIDO 5",20),
(5,"NOMBRE 5","APELLIDO 6",20),
(6,"NOMBRE 7","APELLIDO 7",20),
(7,"NOMBRE 8","APELLIDO 8",20);

commit;

select count(*) from users;
alter sequence users_id_seq restart with 10;


