insert into recursos(rec_descripcion)
values ('Combustible'),
		('Energía Electrica'),
		('Aceite'),
		('Refrigerante'),
		('Hojas');
		

insert into tipo_emisiones(tem_descripcion)
values ('Emisiones directas'),
		('Emisiones indirectas'),
		('Otras emisiones indirectas');
		
insert into unidades(uni_abrevitatura,uni_descripcion)
values ('gal','galones'),
		('kW', 'Kilo Watts'),
		('ud','unidades');
		
		
insert into tipo_consumo(tco_descripcion)
values 	('Administrativo'),
		('Indirecto de proveedores'),
		('Logístico'),
		('Distribución'),
		('Operación');
		
		
insert into meses(mes_descripcion)
values 	('Enero'),
		('Febrero'),
		('Marzo'),
		('Abril'),
		('Mayo'),
		('Junio'),
		('Julio'),
		('Agosto'),
		('Septiembre'),
		('Octubre'),
		('Noviembre'),
		('Diciembre');
		
		
insert into anios(ani_descripcion)
values 	('2022'),
		('2023'),
		('2024'),
		('2025'),
		('2026'),
		('2027'),
		('2028'),
		('2029'),
		('2030'),
		('2031'),
		('2032'),
		('2033'),
		('2034');
		
SELECT *
FROM anios;
		
		
insert into equipos(equ_descripcion)
values 	('Ventas'),
		('Administrativo');
		
		
SELECT *
FROM anios;
		