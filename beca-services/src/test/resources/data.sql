INSERT INTO users (id,ds_name,ds_lastname,age)
VALUES
(1,'NOMBRE 1','APELLIDO 2',20),
(2,'NOMBRE 2','APELLIDO 2',20),
(3,'NOMBRE 3','APELLIDO 2',20),
(4,'NOMBRE 4','APELLIDO 2',20),
(5,'NOMBRE 5','APELLIDO 2',20),
(6,'NOMBRE 6','APELLIDO 2',20),
(7,'NOMBRE 7','APELLIDO 2',20),
(8,'NOMBRE 8','APELLIDO 2',20);

commit;

select count(*) from users;
alter sequence users_id_seq restart with 10;


