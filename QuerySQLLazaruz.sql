#CREATE DATABASE lazaruz;

CREATE TABLE mapas(
	id_mapa int not null auto_increment unique,
    nombre varchar(100) not null
);

CREATE TABLE zonas(
	id_zona int not null auto_increment unique,
    eje_y int not null,
    eje_x int not null,
    id_mapa int not null
);

CREATE TABLE zombies(
	id_zombie int not null auto_increment unique,
    salud int,
    ataque int,
    id_zona int not null
);

CREATE TABLE usuarios(
	id_usuario int not null auto_increment unique,
    nombre varchar(200) not null,
    email varchar(200) not null,
    password varchar(200) not null,
    puntos_de_alma int not null
);

CREATE TABLE players(
	id_player int not null auto_increment unique,
    nivel int not null,
    experiencia int not null,
    salud int not null,
    fuerza int not null,
    suerte int not null,
    fe int not null,
    zombies_abatidos int not null,
    id_usuario int not null,
    id_mapa int not null
);


#CREATE TABLE Recursos(
#	id_recurso int not null auto_increment unique,
#    nombre varchar(200) not null,
#    descripcion varchar(200) not null,
#    tipo_recurso int not null
#);

#CREATE TABLE tipos_recursos(
#	
#);

# CONSTRAINT MAPAS
ALTER TABLE mapas ADD
CONSTRAINT pk_mapas PRIMARY KEY(id_mapa);

# CONSTRAINT ZONAS
ALTER TABLE zonas ADD
CONSTRAINT pk_zonas PRIMARY KEY(id_zona);

ALTER TABLE zonas ADD
CONSTRAINT fk_zonas_mapas FOREIGN KEY(id_mapa)
REFERENCES mapas(id_mapa);

# CONSTRAINT ZOMBIES
ALTER TABLE zombies ADD
CONSTRAINT pk_zombies PRIMARY KEY(id_zombie);

ALTER TABLE zombies ADD
CONSTRAINT fk_zombies_zonas FOREIGN KEY(id_zona)
REFERENCES zonas(id_zona);

# CONSTRAINT USUARIOS
ALTER TABLE usuarios ADD
CONSTRAINT pk_usuarios PRIMARY KEY(id_usuario);

# CONSTRAINT PLAYERS
ALTER TABLE players ADD
CONSTRAINT pk_players PRIMARY KEY(id_player);

ALTER TABLE players ADD
CONSTRAINT fk_players_mapa FOREIGN KEY(id_mapa)
REFERENCES mapas(id_mapa);

ALTER TABLE players ADD
CONSTRAINT fk_players_usuarios FOREIGN KEY(id_usuario)
REFERENCES usuarios(id_usuario);






