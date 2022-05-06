#CREATE DATABASE lazaruz;
#DROP DATABASE lazaruz;

#---------------------------------------------------+
#					INVENTARIO						|
#---------------------------------------------------+

CREATE TABLE inventarios(
	id int not null auto_increment unique,
    capacidad int not null
);

# CONSTRAINT 
ALTER TABLE inventarios ADD
CONSTRAINT pk_inventarios PRIMARY KEY(id);



#---------------------------------------------------+
#						MAPAS						|
#---------------------------------------------------+

CREATE TABLE mapas(
	id int not null auto_increment unique,
    nombre varchar(100) not null
);

# CONSTRAINT MAPAS
ALTER TABLE mapas ADD
CONSTRAINT pk_mapas PRIMARY KEY(id);


#---------------------------------------------------+
#						ZONAS						|
#---------------------------------------------------+

CREATE TABLE zonas(
	id int not null auto_increment unique,
    eje_y int not null,
    eje_x int not null,
    id_mapa int not null,
	id_inventario int not null
);

# CONSTRAINT ZONAS
ALTER TABLE zonas ADD
CONSTRAINT pk_zonas PRIMARY KEY(id);

ALTER TABLE zonas ADD
CONSTRAINT fk_zonas_mapas FOREIGN KEY(id_mapa)
REFERENCES mapas(id);

ALTER TABLE zonas ADD
CONSTRAINT fk_zonas_inventario FOREIGN KEY(id_inventario)
REFERENCES inventarios(id);

#---------------------------------------------------+
#						ZOMBIES						|
#---------------------------------------------------+

CREATE TABLE zombies(
	id int not null auto_increment unique,
    salud int,
    ataque int,
    id_zona int not null
);

# CONSTRAINT ZOMBIES
ALTER TABLE zombies ADD
CONSTRAINT pk_zombies PRIMARY KEY(id);

ALTER TABLE zombies ADD
CONSTRAINT fk_zombies_zonas FOREIGN KEY(id_zona)
REFERENCES zonas(id);


#---------------------------------------------------+
#					USUARIOS						|
#---------------------------------------------------+
CREATE TABLE usuarios(
	id int not null auto_increment unique,
    nombre varchar(200) not null,
    email varchar(200) not null,
    password varchar(200) not null,
    puntos_de_alma int not null
);

# CONSTRAINT USUARIOS
ALTER TABLE usuarios ADD
CONSTRAINT pk_usuarios PRIMARY KEY(id);



#---------------------------------------------------+
#						PLAYERS						|
#---------------------------------------------------+

CREATE TABLE players(
	id int not null auto_increment unique,
    nivel int not null,
    experiencia int not null,
    salud int not null,
    fuerza int not null,
    suerte int not null,
    fe int not null,
    zombies_abatidos int not null,
    id_usuario int not null,
    id_zona int not null,
    id_inventario int not null
);

# CONSTRAINT PLAYERS
ALTER TABLE players ADD
CONSTRAINT pk_players PRIMARY KEY(id);

ALTER TABLE players ADD
CONSTRAINT fk_players_mapa FOREIGN KEY(id_zona)
REFERENCES zonas(id);

ALTER TABLE players ADD
CONSTRAINT fk_players_usuarios FOREIGN KEY(id_usuario)
REFERENCES usuarios(id);

ALTER TABLE players ADD
CONSTRAINT fk_players_inventarios FOREIGN KEY(id_inventario)
REFERENCES inventarios(id);



#---------------------------------------------------+
#					TIPOS RECURSOS					|
#---------------------------------------------------+

CREATE TABLE tipos_recursos(
	id int not null auto_increment unique,
    nombre varchar(200) not null,
    descripcion varchar(1000)
);

# CONSTRAIN TIPOS RECURSOS
ALTER TABLE tipos_recursos ADD
CONSTRAINT pk_tipos_recursos PRIMARY KEY(id);



#---------------------------------------------------+
#						RECURSOS					|
#---------------------------------------------------+

CREATE TABLE recursos(
	id int not null auto_increment unique,
    nombre varchar(200) not null,
    descripcion varchar(1000) not null,
    tipo_recurso int not null
);

# CONSTRAIN RECURSOS
ALTER TABLE recursos ADD
CONSTRAINT pk_recursos PRIMARY KEY (id);

ALTER TABLE recursos ADD
CONSTRAINT fk_recursos_tiposrecursos FOREIGN KEY(tipo_recurso)
REFERENCES tipos_recursos(id);


#---------------------------------------------------+
#			DETALLE INVENTARIO RECURSOS				|
#---------------------------------------------------+

CREATE TABLE detalle_inventarios_recursos(
	id_inventario int not null,
    id_recurso int not null
);

# CONSTRAINT 
ALTER TABLE detalle_inventarios_recursos ADD
CONSTRAINT pk_detalle_inventarios_recursos PRIMARY KEY(id_inventario,id_recurso);

ALTER TABLE detalle_inventarios_recursos ADD
CONSTRAINT fk_detalle_inventarios FOREIGN KEY(id_inventario)
REFERENCES inventarios(id);

ALTER TABLE detalle_inventarios_recursos ADD
CONSTRAINT fk_detalle_recursos FOREIGN KEY(id_recurso)
REFERENCES recursos(id);


#---------------------------------------------------+
#				BAUL DE LOS RECUERDOS				|
#---------------------------------------------------+
#	COMPORTAMIENTO RECURSOS*
