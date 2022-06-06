-- #########################################
-- Datos para la tabla AEROPUERTOS
-- #########################################
insert into aeropuertos (id_aeropuerto, nombre, ciudad, pais) values ('MAD', 'Barajas', 'Madrid', 'España');
insert into aeropuertos (id_aeropuerto, nombre, ciudad, pais) values ('BAR', 'El Prat', 'Barcelona', 'España');
insert into aeropuertos (id_aeropuerto, nombre, ciudad, pais) values ('JLC', 'Julio Chavez', 'Lima', 'Peru');
insert into aeropuertos (id_aeropuerto, nombre, ciudad, pais) values ('MUN', 'Franz Josef Strauss', 'Munich', 'Alemania');
insert into aeropuertos (id_aeropuerto, nombre, ciudad, pais) values ('VAL', 'Aeropuerto de Valencia', 'Valencia', 'España');
insert into aeropuertos (id_aeropuerto, nombre, ciudad, pais) values ('TOK', 'Tokio Airport', 'Tokio', 'Japon');
insert into aeropuertos (id_aeropuerto, nombre, ciudad, pais) values ('EST', 'Estambul Airport', 'Estambul', 'Turquía');
insert into aeropuertos (id_aeropuerto, nombre, ciudad, pais) values ('JFK', 'John F Kennedy', 'New York', 'Estados Unidos');
insert into aeropuertos (id_aeropuerto, nombre, ciudad, pais) values ('LAX', 'Los Angeles Airport', 'Los Angeles', 'Estados Unidos');
insert into aeropuertos (id_aeropuerto, nombre, ciudad, pais) values ('HTR', 'Heathrow', 'Londres', 'Inglaterra');

-- #########################################
-- Datos para la tabla MODELOS_AVION
-- #########################################
insert into modelos_avion values ('Airbus319', 32);
insert into modelos_avion values ('Airbus320', 48);
insert into modelos_avion values ('Airbus321', 84);
insert into modelos_avion values ('Boeing747', 48);
insert into modelos_avion values ('Md87', 28);
insert into modelos_avion values ('Boeing757', 78);
insert into modelos_avion values ('Airbus340', 44);

-- #########################################
-- Datos para la tabla AEROLINEAS
-- #########################################
insert into aerolineas values('1', 'Iberia');
insert into aerolineas values('2', 'Easy Jet');
insert into aerolineas values('3', 'Air France');
insert into aerolineas values('4', 'Air Europa');
insert into aerolineas values('5', 'British Airways');
insert into aerolineas values('6', 'KLM');
insert into aerolineas values('7', 'Spanair');
insert into aerolineas values('8', 'Lufthansa');

-- #########################################
-- Datos para la tabla PROGRAMAS
-- #########################################
insert into programas values ('001','1','MAD','BAR');
insert into programas values ('002','1','MAD','JLC');
insert into programas values ('003','1','MAD','VAL');
insert into programas values ('004','1','VAL','EST');
insert into programas values ('005','1','MAD','JFK');
insert into programas values ('006','7','MAD','BAR');
insert into programas values ('007','7','BAR','MAD');
insert into programas values ('008','7','VAL','MUN');
insert into programas values ('009','7','MUN','VAL');
insert into programas values ('010','7','EST','JFK');
insert into programas values ('011','2','MAD','JFK');
insert into programas values ('012','6','VAL','HTR');
insert into programas values ('013','5','JFK','HTR');
insert into programas values ('014','5','HTR','BAR');
insert into programas values ('015','5','BAR','EST');
insert into programas values ('016','5','BAR','TOK');
insert into programas values ('017','6','JLC','HTR');
insert into programas values ('018','8','MAD','TOK');
insert into programas values ('019','8','LAX','JFK');
insert into programas values ('020','8','JFK','LAX');
insert into programas values ('021','8','EST','JLC');
insert into programas values ('022','8','JLC','EST');
insert into programas values ('023','8','VAL','MAD');
insert into programas values ('024','6','JLC','MAD');
insert into programas values ('025','1','TOK','MAD');
insert into programas values ('026','1','MAD','TOK');

-- #########################################
-- Datos para la tabla AVIONES
-- #########################################
insert into aviones values('EC-AAA','Airbus319');
insert into aviones values('EC-BBB','Airbus319');
insert into aviones values('EC-CCC','Airbus319');
insert into aviones values('EC-DDD','Airbus320');
insert into aviones values('EC-EEE','Airbus320');
insert into aviones values('EC-FFF','Airbus320');
insert into aviones values('EC-GGG','Airbus320');
insert into aviones values('EC-HHH','Airbus320');
insert into aviones values('EC-III','Airbus321');
insert into aviones values('EC-JJJ','Airbus321');
insert into aviones values('EC-KKK','Airbus340');
insert into aviones values('EC-LLL','Airbus340');
insert into aviones values('EC-MMM','Airbus340');
insert into aviones values('N00001','Boeing747');
insert into aviones values('N00002','Boeing747');
insert into aviones values('N00003','Boeing747');
insert into aviones values('N00004','Boeing757');
insert into aviones values('N00005','Boeing757');
insert into aviones values('N00006','Boeing757');
insert into aviones values('N00007','Boeing757');
insert into aviones values('N00008','Md87');
insert into aviones values('N00009','Md87');

-- #########################################
-- Datos para la tabla VUELOS
-- #########################################
-- PROG 017: LIMA-LONDRES - vuelos para hoy, mañana y pasado
INSERT INTO vuelos VALUES ("1", DATE_ADD(CURDATE(), INTERVAL 1 DAY), CURDATE(), '11:30 ', '22:41 ', 0, 'N00002', '017');
INSERT INTO vuelos VALUES ("2", DATE_ADD(CURDATE(), INTERVAL 1 DAY), CURDATE(), '03:39 ', '03:40 ', 0, 'N00009', '017');
INSERT INTO vuelos VALUES ("3", DATE_ADD(CURDATE(), INTERVAL 1 DAY), CURDATE(), '17:26 ', '03:08 ', 0, 'EC-AAA', '017');
INSERT INTO vuelos VALUES ("4", DATE_ADD(CURDATE(), INTERVAL 1 DAY), CURDATE(), '00:58 ', '16:36 ', 0, 'EC-FFF', '017');
-- 
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 2 DAY), DATE_ADD(CURDATE(), INTERVAL 1 DAY), '22:36 ', '18:23 ', 0, 'N00003', '017');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 2 DAY), DATE_ADD(CURDATE(), INTERVAL 1 DAY), '14:28 ', '20:50 ', 0, 'EC-AAA', '017');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 2 DAY), DATE_ADD(CURDATE(), INTERVAL 1 DAY), '01:03 ', '04:32 ', 0, 'N00004', '017');
-- 
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 3 DAY), DATE_ADD(CURDATE(), INTERVAL 2 DAY), '16:01 ', '09:45 ', 0, 'N00007', '017');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 3 DAY), DATE_ADD(CURDATE(), INTERVAL 2 DAY), '01:22 ', '04:23 ', 0, 'N00003', '017');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 3 DAY), DATE_ADD(CURDATE(), INTERVAL 2 DAY), '04:35 ', '11:07 ', 0, 'N00004', '017');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 3 DAY), DATE_ADD(CURDATE(), INTERVAL 2 DAY), '19:38 ', '20:15 ', 0, 'EC-GGG', '017');

-- PROG 001: MADRID-BARC - vuelos para hoy, mañana y pasado
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 1 DAY), CURDATE(), '16:38 ', '15:58 ', 0, 'EC-DDD', '001');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 1 DAY), CURDATE(), '22:41 ', '04:12 ', 0, 'EC-KKK', '001');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 1 DAY), CURDATE(), '12:56 ', '05:43 ', 0, 'EC-HHH', '001');
-- 
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 2 DAY), DATE_ADD(CURDATE(), INTERVAL 1 DAY), '21:35 ', '14:51 ', 0, 'N00004', '001');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 2 DAY), DATE_ADD(CURDATE(), INTERVAL 1 DAY), '11:34 ', '12:37 ', 0, 'N00006', '001');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 2 DAY), DATE_ADD(CURDATE(), INTERVAL 1 DAY), '21:34 ', '13:20 ', 0, 'EC-AAA', '001');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 2 DAY), DATE_ADD(CURDATE(), INTERVAL 1 DAY), '13:43 ', '14:41 ', 0, 'EC-DDD', '001');
-- 
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 3 DAY), DATE_ADD(CURDATE(), INTERVAL 2 DAY), '12:54 ', '03:01 ', 0, 'EC-KKK', '001');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 3 DAY), DATE_ADD(CURDATE(), INTERVAL 2 DAY), '11:50 ', '07:00 ', 0, 'EC-JJJ', '001');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 3 DAY), DATE_ADD(CURDATE(), INTERVAL 2 DAY), '09:27 ', '06:22 ', 0, 'N00002', '001');

-- PROG 002: MADRID-LIMA - vuelos para hoy, mañana y pasado
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 1 DAY), CURDATE(), '03:38 ', '13:43 ', 0, 'EC-EEE', '002');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 1 DAY), CURDATE(), '16:01 ', '12:11 ', 0, 'EC-JJJ', '002');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 1 DAY), CURDATE(), '07:28 ', '01:52 ', 0, 'EC-CCC', '002');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 1 DAY), CURDATE(), '22:36 ', '16:00 ', 0, 'EC-DDD', '002');
-- 
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 2 DAY), DATE_ADD(CURDATE(), INTERVAL 1 DAY), '11:40 ', '22:10 ', 0, 'EC-III', '002');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 2 DAY), DATE_ADD(CURDATE(), INTERVAL 1 DAY), '15:36 ', '04:26 ', 0, 'EC-LLL', '002');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 2 DAY), DATE_ADD(CURDATE(), INTERVAL 1 DAY), '19:07 ', '04:09 ', 0, 'EC-CCC', '002');
-- 
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 3 DAY), DATE_ADD(CURDATE(), INTERVAL 2 DAY), '10:58 ', '06:45 ', 0, 'N00008', '002');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 3 DAY), DATE_ADD(CURDATE(), INTERVAL 2 DAY), '01:19 ', '00:39 ', 0, 'EC-GGG', '002');

-- PROG 004: VALENCIA-ESTAMBUL - vuelos para hoy, mañana y pasado
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 1 DAY), CURDATE(), '21:01 ', '18:58 ', 0, 'N00001', '004');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 1 DAY), CURDATE(), '17:57 ', '02:47 ', 0, 'N00006', '004');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 1 DAY), CURDATE(), '07:18 ', '03:49 ', 0, 'EC-GGG', '004');
-- 
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 2 DAY), DATE_ADD(CURDATE(), INTERVAL 1 DAY), '02:55 ', '06:36 ', 0, 'N00008', '004');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 2 DAY), DATE_ADD(CURDATE(), INTERVAL 1 DAY), '16:06 ', '12:36 ', 0, 'EC-AAA', '004');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 2 DAY), DATE_ADD(CURDATE(), INTERVAL 1 DAY), '18:04 ', '22:43 ', 0, 'N00008', '004');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 2 DAY), DATE_ADD(CURDATE(), INTERVAL 1 DAY), '06:49 ', '00:22 ', 0, 'EC-JJJ', '004');
-- 
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 3 DAY), DATE_ADD(CURDATE(), INTERVAL 2 DAY), '20:53 ', '21:23 ', 0, 'EC-III', '004');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 3 DAY), DATE_ADD(CURDATE(), INTERVAL 2 DAY), '00:21 ', '02:05 ', 0, 'EC-EEE', '004');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 3 DAY), DATE_ADD(CURDATE(), INTERVAL 2 DAY), '17:47 ', '12:08 ', 0, 'EC-LLL', '004');

-- PROG 003: MADRID-VALENCIA - vuelos para hoy, mañana y pasado
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 1 DAY), CURDATE(), '07:33 ', '03:12 ', 0, 'EC-GGG', '003');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 1 DAY), CURDATE(), '15:19 ', '16:37 ', 0, 'N00004', '003');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 1 DAY), CURDATE(), '02:25 ', '14:32 ', 0, 'N00005', '003');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 1 DAY), CURDATE(), '16:12 ', '15:29 ', 0, 'EC-BBB', '003');
-- 
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 2 DAY), DATE_ADD(CURDATE(), INTERVAL 1 DAY), '22:15 ', '09:12 ', 0, 'EC-HHH', '003');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 2 DAY), DATE_ADD(CURDATE(), INTERVAL 1 DAY), '19:32 ', '18:10 ', 0, 'EC-BBB', '003');
-- 
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 3 DAY), DATE_ADD(CURDATE(), INTERVAL 2 DAY), '12:46 ', '19:47 ', 0, 'N00003', '003');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 3 DAY), DATE_ADD(CURDATE(), INTERVAL 2 DAY), '02:52 ', '07:14 ', 0, 'EC-KKK', '003');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 3 DAY), DATE_ADD(CURDATE(), INTERVAL 2 DAY), '14:52 ', '21:13 ', 0, 'N00002', '003');

-- PROG 007: BARCELONA-MADRID - vuelos para hoy, mañana y pasado
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 1 DAY), CURDATE(), '07:56 ', '04:31 ', 0, 'EC-BBB', '007');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 1 DAY), CURDATE(), '17:27 ', '16:26 ', 0, 'EC-HHH', '007');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 1 DAY), CURDATE(), '21:40 ', '06:48 ', 0, 'N00005', '007');
-- 
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 2 DAY), DATE_ADD(CURDATE(), INTERVAL 1 DAY), '17:25 ', '18:29 ', 0, 'N00001', '007');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 2 DAY), DATE_ADD(CURDATE(), INTERVAL 1 DAY), '17:33 ', '22:34 ', 0, 'N00007', '007');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 2 DAY), DATE_ADD(CURDATE(), INTERVAL 1 DAY), '20:14 ', '20:33 ', 0, 'N00008', '007');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 2 DAY), DATE_ADD(CURDATE(), INTERVAL 1 DAY), '04:55 ', '14:11 ', 0, 'EC-DDD', '007');
-- 
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 3 DAY), DATE_ADD(CURDATE(), INTERVAL 2 DAY), '11:08 ', '06:22 ', 0, 'EC-CCC', '007');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 3 DAY), DATE_ADD(CURDATE(), INTERVAL 2 DAY), '18:38 ', '02:20 ', 0, 'EC-CCC', '007');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 3 DAY), DATE_ADD(CURDATE(), INTERVAL 2 DAY), '09:26 ', '18:58 ', 0, 'N00007', '007');

-- PROG 022 Lima-Estambul - vuelos para hoy, mañana y pasado
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 1 DAY), CURDATE(), '03:25 ', '17:42 ', 0, 'N00007', '022');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 1 DAY), CURDATE(), '12:49 ', '15:23 ', 0, 'N00007', '022');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 1 DAY), CURDATE(), '03:00 ', '04:27 ', 0, 'EC-MMM', '022');
-- 
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 2 DAY), DATE_ADD(CURDATE(), INTERVAL 1 DAY), '20:48 ', '06:25 ', 0, 'EC-KKK', '022');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 2 DAY), DATE_ADD(CURDATE(), INTERVAL 1 DAY), '18:05 ', '17:50 ', 0, 'N00001', '022');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 2 DAY), DATE_ADD(CURDATE(), INTERVAL 1 DAY), '03:02 ', '03:56 ', 0, 'EC-JJJ', '022');
-- 
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 3 DAY), DATE_ADD(CURDATE(), INTERVAL 2 DAY), '21:11 ', '22:27 ', 0, 'N00008', '022');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 3 DAY), DATE_ADD(CURDATE(), INTERVAL 2 DAY), '03:53 ', '17:28 ', 0, 'EC-AAA', '022');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 3 DAY), DATE_ADD(CURDATE(), INTERVAL 2 DAY), '11:06 ', '08:12 ', 0, 'N00008', '022');

-- PROG 023 - Valencia-Madrid - vuelos hoy, mañana y pasados
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 1 DAY), CURDATE(), '04:15 ', '07:51 ', 0, 'N00002', '023');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 1 DAY), CURDATE(), '16:35 ', '13:18 ', 0, 'EC-LLL', '023');
-- 
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 2 DAY), DATE_ADD(CURDATE(), INTERVAL 1 DAY), '03:38 ', '17:38 ', 0, 'EC-DDD', '023');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 2 DAY), DATE_ADD(CURDATE(), INTERVAL 1 DAY), '17:06 ', '05:00 ', 0, 'EC-III', '023');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 2 DAY), DATE_ADD(CURDATE(), INTERVAL 1 DAY), '01:14 ', '21:41 ', 0, 'N00003', '023');
-- 
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 3 DAY), DATE_ADD(CURDATE(), INTERVAL 2 DAY), '02:23 ', '15:36 ', 0, 'EC-JJJ', '023');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 3 DAY), DATE_ADD(CURDATE(), INTERVAL 2 DAY), '10:42 ', '15:14 ', 0, 'EC-EEE', '023');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 3 DAY), DATE_ADD(CURDATE(), INTERVAL 2 DAY), '18:41 ', '10:42 ', 0, 'EC-DDD', '023');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 3 DAY), DATE_ADD(CURDATE(), INTERVAL 2 DAY), '00:15 ', '01:04 ', 0, 'N00005', '023');

-- Prog 024 Lima-Madrid - vuelos hoy y pasado
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 1 DAY), CURDATE(), '06:02 ', '14:56 ', 0, 'N00009', '024');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 1 DAY), CURDATE(), '12:40 ', '00:10 ', 0, 'N00001', '024');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 1 DAY), CURDATE(), '01:01 ', '07:14 ', 0, 'N00001', '024');
-- 
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 2 DAY), DATE_ADD(CURDATE(), INTERVAL 1 DAY), '11:09 ', '10:36 ', 0, 'EC-JJJ', '024');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 2 DAY), DATE_ADD(CURDATE(), INTERVAL 1 DAY), '14:17 ', '03:07 ', 0, 'N00008', '024');
-- 
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 3 DAY), DATE_ADD(CURDATE(), INTERVAL 2 DAY), '10:41 ', '10:07 ', 0, 'EC-MMM', '024');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 3 DAY), DATE_ADD(CURDATE(), INTERVAL 2 DAY), '02:38 ', '16:12 ', 0, 'N00007', '024');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 3 DAY), DATE_ADD(CURDATE(), INTERVAL 2 DAY), '07:06 ', '03:24 ', 0, 'N00003', '024');

-- Prog 025 - TOKio-Madrid - vuelos hoy, mañana y pasado
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 1 DAY), CURDATE(), '19:20 ', '08:01 ', 0, 'EC-GGG', '025');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 1 DAY), CURDATE(), '06:00 ', '03:14 ', 0, 'EC-AAA', '025');
-- 
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 2 DAY), DATE_ADD(CURDATE(), INTERVAL 1 DAY), '12:09 ', '05:26 ', 0, 'EC-HHH', '025');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 2 DAY), DATE_ADD(CURDATE(), INTERVAL 1 DAY), '20:21 ', '06:07 ', 0, 'EC-III', '025');
-- 
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 3 DAY), DATE_ADD(CURDATE(), INTERVAL 2 DAY), '21:56 ', '19:01 ', 0, 'EC-MMM', '025');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 3 DAY), DATE_ADD(CURDATE(), INTERVAL 2 DAY), '12:13 ', '06:46 ', 0, 'EC-LLL', '025');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 3 DAY), DATE_ADD(CURDATE(), INTERVAL 2 DAY), '14:34 ', '05:55 ', 0, 'EC-DDD', '025');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 3 DAY), DATE_ADD(CURDATE(), INTERVAL 2 DAY), '16:55 ', '19:56 ', 0, 'EC-CCC', '025');

-- Prog 026 -- Madrid-Tokio - vuelos hoy mañana y pasado
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 1 DAY), CURDATE(), '22:34 ', '09:29 ', 0, 'N00002', '026');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 1 DAY), CURDATE(), '03:38 ', '02:39 ', 0, 'EC-KKK', '026');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 1 DAY), CURDATE(), '01:55 ', '09:14 ', 0, 'EC-MMM', '026');
-- 
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 2 DAY), DATE_ADD(CURDATE(), INTERVAL 1 DAY), '19:54 ', '06:58 ', 0, 'N00007', '026');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 2 DAY), DATE_ADD(CURDATE(), INTERVAL 1 DAY), '01:19 ', '03:17 ', 0, 'N00004', '026');
-- 
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 3 DAY), DATE_ADD(CURDATE(), INTERVAL 2 DAY), '08:23 ', '07:01 ', 0, 'EC-CCC', '026');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 3 DAY), DATE_ADD(CURDATE(), INTERVAL 2 DAY), '12:51 ', '20:56 ', 0, 'EC-BBB', '026');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 3 DAY), DATE_ADD(CURDATE(), INTERVAL 2 DAY), '07:20 ', '15:19 ', 0, 'N00008', '026');
INSERT INTO vuelos VALUES (uuid(), DATE_ADD(CURDATE(), INTERVAL 3 DAY), DATE_ADD(CURDATE(), INTERVAL 2 DAY), '18:23 ', '08:49 ', 0, 'EC-LLL', '026');

-- #########################################
-- Datos para la tabla de PROGRAMAS
-- #########################################
-- Nota: procedimiento de escalas tiene que generar el numero de escala automaticamente y siempre ascendente
insert into escalas values (1, '002', 'JFK');
insert into escalas values (1, '016', 'EST');
insert into escalas values (1, '017', 'JFK');
insert into escalas values (1, '018', 'MUN');
insert into escalas values (1, '021', 'HTR');
insert into escalas values (2, '021', 'JFK');
insert into escalas values (1, '022', 'JFK');
insert into escalas values (2, '022', 'HTR');
insert into escalas values (1, '025', 'EST');
insert into escalas values (1, '026', 'MUN');
insert into escalas values (2, '026', 'EST');

/*
- Filas del modelo AIRBUS 319(32 asientos)
*/
insert into filas values('01', 4, 'Airbus319');
insert into filas values('02', 4, 'Airbus319');
insert into filas values('03', 4, 'Airbus319');
insert into filas values('04', 4, 'Airbus319');
insert into filas values('05', 4, 'Airbus319');
insert into filas values('06', 4, 'Airbus319');
insert into filas values('07', 4, 'Airbus319');
insert into filas values('08', 4, 'Airbus319');
/*
-----------------------------------------
-- Filas del modelo AIRBUS 320(48 asientos)
*/
insert into filas values('01', 6, 'Airbus320');
insert into filas values('02', 6, 'Airbus320');
insert into filas values('03', 6, 'Airbus320');
insert into filas values('04', 6, 'Airbus320');
insert into filas values('05', 6, 'Airbus320');
insert into filas values('06', 6, 'Airbus320');
insert into filas values('07', 6, 'Airbus320');
insert into filas values('08', 6, 'Airbus320');
/*
------------------------------------------
-- Filas del modelo Md87 (28 asientos)
*/
insert into filas values('01', 4, 'Md87');
insert into filas values('02', 4, 'Md87');
insert into filas values('03', 4, 'Md87');
insert into filas values('04', 4, 'Md87');
insert into filas values('05', 4, 'Md87');
insert into filas values('06', 4, 'Md87');
insert into filas values('07', 4, 'Md87');
/*
----------------------------------------
-- Filas modelo boeing 747(48 asientos)
*/
insert into filas values('01', 4, 'Boeing747');
insert into filas values('02', 4, 'Boeing747');
insert into filas values('03', 4, 'Boeing747');
insert into filas values('04', 4, 'Boeing747');
insert into filas values('05', 4, 'Boeing747');
insert into filas values('06', 4, 'Boeing747');
insert into filas values('07', 4, 'Boeing747');
insert into filas values('08', 4, 'Boeing747');
insert into filas values('09', 4, 'Boeing747');
insert into filas values('10', 4, 'Boeing747');
insert into filas values('11', 4, 'Boeing747');
insert into filas values('12', 4, 'Boeing747');
/*
------------------------------
-- Filas modelo boeing 757(78 asientos)
*/
insert into filas values('01', 6, 'Boeing757');
insert into filas values('02', 6, 'Boeing757');
insert into filas values('03', 6, 'Boeing757');
insert into filas values('04', 6, 'Boeing757');
insert into filas values('05', 6, 'Boeing757');
insert into filas values('06', 6, 'Boeing757');
insert into filas values('07', 6, 'Boeing757');
insert into filas values('08', 6, 'Boeing757');
insert into filas values('09', 6, 'Boeing757');
insert into filas values('10', 6, 'Boeing757');
insert into filas values('11', 6, 'Boeing757');
insert into filas values('12', 6, 'Boeing757');
insert into filas values('13', 6, 'Boeing757');
/*
----------------------------------
-- Filas modelo Airbus 340(44 asientos)
*/
insert into filas values('01', 4, 'Airbus340');
insert into filas values('02', 4, 'Airbus340');
insert into filas values('03', 4, 'Airbus340');
insert into filas values('04', 4, 'Airbus340');
insert into filas values('05', 4, 'Airbus340');
insert into filas values('06', 4, 'Airbus340');
insert into filas values('07', 4, 'Airbus340');
insert into filas values('08', 4, 'Airbus340');
insert into filas values('09', 4, 'Airbus340');
insert into filas values('10', 4, 'Airbus340');
insert into filas values('11', 4, 'Airbus340');
/*
----------------------------------------
-- Filas modelo Airbus 321(84 asientos)
*/
insert into filas values('01', 6, 'Airbus321');
insert into filas values('02', 6, 'Airbus321');
insert into filas values('03', 6, 'Airbus321');
insert into filas values('04', 6, 'Airbus321');
insert into filas values('05', 6, 'Airbus321');
insert into filas values('06', 6, 'Airbus321');
insert into filas values('07', 6, 'Airbus321');
insert into filas values('08', 6, 'Airbus321');
insert into filas values('09', 6, 'Airbus321');
insert into filas values('10', 6, 'Airbus321');
insert into filas values('11', 6, 'Airbus321');
insert into filas values('12', 6, 'Airbus321');
insert into filas values('13', 6, 'Airbus321');
insert into filas values('14', 6, 'Airbus321');
/*
---------------------------------------------
------------DATOS ASIENTOS-------------------
---------------------------------------------
-- modelo AIRBUS 319(32 asientos)
*/
insert into asientos values('A', 'Airbus319', '01');
insert into asientos values('B', 'Airbus319', '01');
insert into asientos values('C', 'Airbus319', '01');
insert into asientos values('D', 'Airbus319', '01');
insert into asientos values('E', 'Airbus319', '01');
insert into asientos values('F', 'Airbus319', '01');
insert into asientos values('G', 'Airbus319', '01');
insert into asientos values('H', 'Airbus319', '01');

insert into asientos values('A', 'Airbus319', '02');
insert into asientos values('B', 'Airbus319', '02');
insert into asientos values('C', 'Airbus319', '02');
insert into asientos values('D', 'Airbus319', '02');
insert into asientos values('E', 'Airbus319', '02');
insert into asientos values('F', 'Airbus319', '02');
insert into asientos values('G', 'Airbus319', '02');
insert into asientos values('H', 'Airbus319', '02');

insert into asientos values('A', 'Airbus319', '03');
insert into asientos values('B', 'Airbus319', '03');
insert into asientos values('C', 'Airbus319', '03');
insert into asientos values('D', 'Airbus319', '03');
insert into asientos values('E', 'Airbus319', '03');
insert into asientos values('F', 'Airbus319', '03');
insert into asientos values('G', 'Airbus319', '03');
insert into asientos values('H', 'Airbus319', '03');

insert into asientos values('A', 'Airbus319', '04');
insert into asientos values('B', 'Airbus319', '04');
insert into asientos values('C', 'Airbus319', '04');
insert into asientos values('D', 'Airbus319', '04');
insert into asientos values('E', 'Airbus319', '04');
insert into asientos values('F', 'Airbus319', '04');
insert into asientos values('G', 'Airbus319', '04');
insert into asientos values('H', 'Airbus319', '04');
/*
-- modelo AIRBUS 320(48 asientos)
*/
insert into asientos values('A', 'Airbus320', '01');
insert into asientos values('B', 'Airbus320', '01');
insert into asientos values('C', 'Airbus320', '01');
insert into asientos values('D', 'Airbus320', '01');
insert into asientos values('E', 'Airbus320', '01');
insert into asientos values('F', 'Airbus320', '01');
insert into asientos values('G', 'Airbus320', '01');
insert into asientos values('H', 'Airbus320', '01');

insert into asientos values('A', 'Airbus320', '02');
insert into asientos values('B', 'Airbus320', '02');
insert into asientos values('C', 'Airbus320', '02');
insert into asientos values('D', 'Airbus320', '02');
insert into asientos values('E', 'Airbus320', '02');
insert into asientos values('F', 'Airbus320', '02');
insert into asientos values('G', 'Airbus320', '02');
insert into asientos values('H', 'Airbus320', '02');

insert into asientos values('A', 'Airbus320', '03');
insert into asientos values('B', 'Airbus320', '03');
insert into asientos values('C', 'Airbus320', '03');
insert into asientos values('D', 'Airbus320', '03');
insert into asientos values('E', 'Airbus320', '03');
insert into asientos values('F', 'Airbus320', '03');
insert into asientos values('G', 'Airbus320', '03');
insert into asientos values('H', 'Airbus320', '03');

insert into asientos values('A', 'Airbus320', '04');
insert into asientos values('B', 'Airbus320', '04');
insert into asientos values('C', 'Airbus320', '04');
insert into asientos values('D', 'Airbus320', '04');
insert into asientos values('E', 'Airbus320', '04');
insert into asientos values('F', 'Airbus320', '04');
insert into asientos values('G', 'Airbus320', '04');
insert into asientos values('H', 'Airbus320', '04');

insert into asientos values('A', 'Airbus320', '05');
insert into asientos values('B', 'Airbus320', '05');
insert into asientos values('C', 'Airbus320', '05');
insert into asientos values('D', 'Airbus320', '05');
insert into asientos values('E', 'Airbus320', '05');
insert into asientos values('F', 'Airbus320', '05');
insert into asientos values('G', 'Airbus320', '05');
insert into asientos values('H', 'Airbus320', '05');

insert into asientos values('A', 'Airbus320', '06');
insert into asientos values('B', 'Airbus320', '06');
insert into asientos values('C', 'Airbus320', '06');
insert into asientos values('D', 'Airbus320', '06');
insert into asientos values('E', 'Airbus320', '06');
insert into asientos values('F', 'Airbus320', '06');
insert into asientos values('G', 'Airbus320', '06');
insert into asientos values('H', 'Airbus320', '06');


/*
-- modelo Md87 (28 asientos)
*/
insert into asientos values('A', 'Md87', '01');
insert into asientos values('B', 'Md87', '01');
insert into asientos values('C', 'Md87', '01');
insert into asientos values('D', 'Md87', '01');
insert into asientos values('E', 'Md87', '01');
insert into asientos values('F', 'Md87', '01');
insert into asientos values('G', 'Md87', '01');

insert into asientos values('A', 'Md87', '02');
insert into asientos values('B', 'Md87', '02');
insert into asientos values('C', 'Md87', '02');
insert into asientos values('D', 'Md87', '02');
insert into asientos values('E', 'Md87', '02');
insert into asientos values('F', 'Md87', '02');
insert into asientos values('G', 'Md87', '02');

insert into asientos values('A', 'Md87', '03');
insert into asientos values('B', 'Md87', '03');
insert into asientos values('C', 'Md87', '03');
insert into asientos values('D', 'Md87', '03');
insert into asientos values('E', 'Md87', '03');
insert into asientos values('F', 'Md87', '03');
insert into asientos values('G', 'Md87', '03');

insert into asientos values('A', 'Md87', '04');
insert into asientos values('B', 'Md87', '04');
insert into asientos values('C', 'Md87', '04');
insert into asientos values('D', 'Md87', '04');
insert into asientos values('E', 'Md87', '04');
insert into asientos values('F', 'Md87', '04');
insert into asientos values('G', 'Md87', '04');

/*
-- modelo Boeing 747(48 asientos)
*/
insert into asientos values('A', 'Boeing747', '01');
insert into asientos values('B', 'Boeing747', '01');
insert into asientos values('C', 'Boeing747', '01');
insert into asientos values('D', 'Boeing747', '01');
insert into asientos values('E', 'Boeing747', '01');
insert into asientos values('F', 'Boeing747', '01');
insert into asientos values('G', 'Boeing747', '01');
insert into asientos values('H', 'Boeing747', '01');
insert into asientos values('I', 'Boeing747', '01');
insert into asientos values('J', 'Boeing747', '01');
insert into asientos values('K', 'Boeing747', '01');
insert into asientos values('L', 'Boeing747', '01');

insert into asientos values('A', 'Boeing747', '02');
insert into asientos values('B', 'Boeing747', '02');
insert into asientos values('C', 'Boeing747', '02');
insert into asientos values('D', 'Boeing747', '02');
insert into asientos values('E', 'Boeing747', '02');
insert into asientos values('F', 'Boeing747', '02');
insert into asientos values('G', 'Boeing747', '02');
insert into asientos values('H', 'Boeing747', '02');
insert into asientos values('I', 'Boeing747', '02');
insert into asientos values('J', 'Boeing747', '02');
insert into asientos values('K', 'Boeing747', '02');
insert into asientos values('L', 'Boeing747', '02');

insert into asientos values('A', 'Boeing747', '03');
insert into asientos values('B', 'Boeing747', '03');
insert into asientos values('C', 'Boeing747', '03');
insert into asientos values('D', 'Boeing747', '03');
insert into asientos values('E', 'Boeing747', '03');
insert into asientos values('F', 'Boeing747', '03');
insert into asientos values('G', 'Boeing747', '03');
insert into asientos values('H', 'Boeing747', '03');
insert into asientos values('I', 'Boeing747', '03');
insert into asientos values('J', 'Boeing747', '03');
insert into asientos values('K', 'Boeing747', '03');
insert into asientos values('L', 'Boeing747', '03');

insert into asientos values('A', 'Boeing747', '04');
insert into asientos values('B', 'Boeing747', '04');
insert into asientos values('C', 'Boeing747', '04');
insert into asientos values('D', 'Boeing747', '04');
insert into asientos values('E', 'Boeing747', '04');
insert into asientos values('F', 'Boeing747', '04');
insert into asientos values('G', 'Boeing747', '04');
insert into asientos values('H', 'Boeing747', '04');
insert into asientos values('I', 'Boeing747', '04');
insert into asientos values('J', 'Boeing747', '04');
insert into asientos values('K', 'Boeing747', '04');
insert into asientos values('L', 'Boeing747', '04');

/*
-- modelo Boeing 757(78 asientos)
*/
insert into asientos values('A', 'Boeing757', '01');
insert into asientos values('B', 'Boeing757', '01');
insert into asientos values('C', 'Boeing757', '01');
insert into asientos values('D', 'Boeing757', '01');
insert into asientos values('E', 'Boeing757', '01');
insert into asientos values('F', 'Boeing757', '01');
insert into asientos values('G', 'Boeing757', '01');
insert into asientos values('H', 'Boeing757', '01');
insert into asientos values('I', 'Boeing757', '01');
insert into asientos values('J', 'Boeing757', '01');
insert into asientos values('K', 'Boeing757', '01');
insert into asientos values('L', 'Boeing757', '01');
insert into asientos values('M', 'Boeing757', '01');

insert into asientos values('A', 'Boeing757', '02');
insert into asientos values('B', 'Boeing757', '02');
insert into asientos values('C', 'Boeing757', '02');
insert into asientos values('D', 'Boeing757', '02');
insert into asientos values('E', 'Boeing757', '02');
insert into asientos values('F', 'Boeing757', '02');
insert into asientos values('G', 'Boeing757', '02');
insert into asientos values('H', 'Boeing757', '02');
insert into asientos values('I', 'Boeing757', '02');
insert into asientos values('J', 'Boeing757', '02');
insert into asientos values('K', 'Boeing757', '02');
insert into asientos values('L', 'Boeing757', '02');
insert into asientos values('M', 'Boeing757', '02');

insert into asientos values('A', 'Boeing757', '03');
insert into asientos values('B', 'Boeing757', '03');
insert into asientos values('C', 'Boeing757', '03');
insert into asientos values('D', 'Boeing757', '03');
insert into asientos values('E', 'Boeing757', '03');
insert into asientos values('F', 'Boeing757', '03');
insert into asientos values('G', 'Boeing757', '03');
insert into asientos values('H', 'Boeing757', '03');
insert into asientos values('I', 'Boeing757', '03');
insert into asientos values('J', 'Boeing757', '03');
insert into asientos values('K', 'Boeing757', '03');
insert into asientos values('L', 'Boeing757', '03');
insert into asientos values('M', 'Boeing757', '03');

insert into asientos values('A', 'Boeing757', '04');
insert into asientos values('B', 'Boeing757', '04');
insert into asientos values('C', 'Boeing757', '04');
insert into asientos values('D', 'Boeing757', '04');
insert into asientos values('E', 'Boeing757', '04');
insert into asientos values('F', 'Boeing757', '04');
insert into asientos values('G', 'Boeing757', '04');
insert into asientos values('H', 'Boeing757', '04');
insert into asientos values('I', 'Boeing757', '04');
insert into asientos values('J', 'Boeing757', '04');
insert into asientos values('K', 'Boeing757', '04');
insert into asientos values('L', 'Boeing757', '04');
insert into asientos values('M', 'Boeing757', '04');

insert into asientos values('A', 'Boeing757', '05');
insert into asientos values('B', 'Boeing757', '05');
insert into asientos values('C', 'Boeing757', '05');
insert into asientos values('D', 'Boeing757', '05');
insert into asientos values('E', 'Boeing757', '05');
insert into asientos values('F', 'Boeing757', '05');
insert into asientos values('G', 'Boeing757', '05');
insert into asientos values('H', 'Boeing757', '05');
insert into asientos values('I', 'Boeing757', '05');
insert into asientos values('J', 'Boeing757', '05');
insert into asientos values('K', 'Boeing757', '05');
insert into asientos values('L', 'Boeing757', '05');
insert into asientos values('M', 'Boeing757', '05');

insert into asientos values('A', 'Boeing757', '06');
insert into asientos values('B', 'Boeing757', '06');
insert into asientos values('C', 'Boeing757', '06');
insert into asientos values('D', 'Boeing757', '06');
insert into asientos values('E', 'Boeing757', '06');
insert into asientos values('F', 'Boeing757', '06');
insert into asientos values('G', 'Boeing757', '06');
insert into asientos values('H', 'Boeing757', '06');
insert into asientos values('I', 'Boeing757', '06');
insert into asientos values('J', 'Boeing757', '06');
insert into asientos values('K', 'Boeing757', '06');
insert into asientos values('L', 'Boeing757', '06');
insert into asientos values('M', 'Boeing757', '06');

/*
-- modelo Airbus340(44 asientos)
*/
insert into asientos values('A', 'Airbus340', '01');
insert into asientos values('B', 'Airbus340', '01');
insert into asientos values('C', 'Airbus340', '01');
insert into asientos values('D', 'Airbus340', '01');
insert into asientos values('E', 'Airbus340', '01');
insert into asientos values('F', 'Airbus340', '01');
insert into asientos values('G', 'Airbus340', '01');
insert into asientos values('H', 'Airbus340', '01');
insert into asientos values('I', 'Airbus340', '01');
insert into asientos values('J', 'Airbus340', '01');
insert into asientos values('K', 'Airbus340', '01');

insert into asientos values('A', 'Airbus340', '02');
insert into asientos values('B', 'Airbus340', '02');
insert into asientos values('C', 'Airbus340', '02');
insert into asientos values('D', 'Airbus340', '02');
insert into asientos values('E', 'Airbus340', '02');
insert into asientos values('F', 'Airbus340', '02');
insert into asientos values('G', 'Airbus340', '02');
insert into asientos values('H', 'Airbus340', '02');
insert into asientos values('I', 'Airbus340', '02');
insert into asientos values('J', 'Airbus340', '02');
insert into asientos values('K', 'Airbus340', '02');

insert into asientos values('A', 'Airbus340', '03');
insert into asientos values('B', 'Airbus340', '03');
insert into asientos values('C', 'Airbus340', '03');
insert into asientos values('D', 'Airbus340', '03');
insert into asientos values('E', 'Airbus340', '03');
insert into asientos values('F', 'Airbus340', '03');
insert into asientos values('G', 'Airbus340', '03');
insert into asientos values('H', 'Airbus340', '03');
insert into asientos values('I', 'Airbus340', '03');
insert into asientos values('J', 'Airbus340', '03');
insert into asientos values('K', 'Airbus340', '03');

insert into asientos values('A', 'Airbus340', '04');
insert into asientos values('B', 'Airbus340', '04');
insert into asientos values('C', 'Airbus340', '04');
insert into asientos values('D', 'Airbus340', '04');
insert into asientos values('E', 'Airbus340', '04');
insert into asientos values('F', 'Airbus340', '04');
insert into asientos values('G', 'Airbus340', '04');
insert into asientos values('H', 'Airbus340', '04');
insert into asientos values('I', 'Airbus340', '04');
insert into asientos values('J', 'Airbus340', '04');
insert into asientos values('K', 'Airbus340', '04');

/*
-- modelo Airbus321(84 asientos)
*/
insert into asientos values('A', 'Airbus321', '01');
insert into asientos values('B', 'Airbus321', '01');
insert into asientos values('C', 'Airbus321', '01');
insert into asientos values('D', 'Airbus321', '01');
insert into asientos values('E', 'Airbus321', '01');
insert into asientos values('F', 'Airbus321', '01');
insert into asientos values('G', 'Airbus321', '01');
insert into asientos values('H', 'Airbus321', '01');
insert into asientos values('I', 'Airbus321', '01');
insert into asientos values('J', 'Airbus321', '01');
insert into asientos values('K', 'Airbus321', '01');
insert into asientos values('L', 'Airbus321', '01');
insert into asientos values('M', 'Airbus321', '01');
insert into asientos values('N', 'Airbus321', '01');

insert into asientos values('A', 'Airbus321', '02');
insert into asientos values('B', 'Airbus321', '02');
insert into asientos values('C', 'Airbus321', '02');
insert into asientos values('D', 'Airbus321', '02');
insert into asientos values('E', 'Airbus321', '02');
insert into asientos values('F', 'Airbus321', '02');
insert into asientos values('G', 'Airbus321', '02');
insert into asientos values('H', 'Airbus321', '02');
insert into asientos values('I', 'Airbus321', '02');
insert into asientos values('J', 'Airbus321', '02');
insert into asientos values('K', 'Airbus321', '02');
insert into asientos values('L', 'Airbus321', '02');
insert into asientos values('M', 'Airbus321', '02');
insert into asientos values('N', 'Airbus321', '02');

insert into asientos values('A', 'Airbus321', '03');
insert into asientos values('B', 'Airbus321', '03');
insert into asientos values('C', 'Airbus321', '03');
insert into asientos values('D', 'Airbus321', '03');
insert into asientos values('E', 'Airbus321', '03');
insert into asientos values('F', 'Airbus321', '03');
insert into asientos values('G', 'Airbus321', '03');
insert into asientos values('H', 'Airbus321', '03');
insert into asientos values('I', 'Airbus321', '03');
insert into asientos values('J', 'Airbus321', '03');
insert into asientos values('K', 'Airbus321', '03');
insert into asientos values('L', 'Airbus321', '03');
insert into asientos values('M', 'Airbus321', '03');
insert into asientos values('N', 'Airbus321', '03');

insert into asientos values('A', 'Airbus321', '04');
insert into asientos values('B', 'Airbus321', '04');
insert into asientos values('C', 'Airbus321', '04');
insert into asientos values('D', 'Airbus321', '04');
insert into asientos values('E', 'Airbus321', '04');
insert into asientos values('F', 'Airbus321', '04');
insert into asientos values('G', 'Airbus321', '04');
insert into asientos values('H', 'Airbus321', '04');
insert into asientos values('I', 'Airbus321', '04');
insert into asientos values('J', 'Airbus321', '04');
insert into asientos values('K', 'Airbus321', '04');
insert into asientos values('L', 'Airbus321', '04');
insert into asientos values('M', 'Airbus321', '04');
insert into asientos values('N', 'Airbus321', '04');

insert into asientos values('A', 'Airbus321', '05');
insert into asientos values('B', 'Airbus321', '05');
insert into asientos values('C', 'Airbus321', '05');
insert into asientos values('D', 'Airbus321', '05');
insert into asientos values('E', 'Airbus321', '05');
insert into asientos values('F', 'Airbus321', '05');
insert into asientos values('G', 'Airbus321', '05');
insert into asientos values('H', 'Airbus321', '05');
insert into asientos values('I', 'Airbus321', '05');
insert into asientos values('J', 'Airbus321', '05');
insert into asientos values('K', 'Airbus321', '05');
insert into asientos values('L', 'Airbus321', '05');
insert into asientos values('M', 'Airbus321', '05');
insert into asientos values('N', 'Airbus321', '05');

insert into asientos values('A', 'Airbus321', '06');
insert into asientos values('B', 'Airbus321', '06');
insert into asientos values('C', 'Airbus321', '06');
insert into asientos values('D', 'Airbus321', '06');
insert into asientos values('E', 'Airbus321', '06');
insert into asientos values('F', 'Airbus321', '06');
insert into asientos values('G', 'Airbus321', '06');
insert into asientos values('H', 'Airbus321', '06');
insert into asientos values('I', 'Airbus321', '06');
insert into asientos values('J', 'Airbus321', '06');
insert into asientos values('K', 'Airbus321', '06');
insert into asientos values('L', 'Airbus321', '06');
insert into asientos values('M', 'Airbus321', '06');
insert into asientos values('N', 'Airbus321', '06');
