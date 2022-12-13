-- CREAR Tabla Persona 
CREATE TABLE IF NOT EXISTS persona(
    Id int(2) AUTO_INCREMENT PRIMARY KEY,
    Nombre varchar(30) NOT NULL,
    Apellido1 varchar(30) NOT NULL,
    Apellido2 varchar(30) NOT NULL,
    edad int(2) NOT NULL
)engine=innodb;