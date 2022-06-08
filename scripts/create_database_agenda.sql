CREATE DATABASE db_agenda;
use db_agenda;

CREATE TABLE usuarios(
id int primary key auto_increment,
nome varchar(40) not null,
usuário varchar(20) not null,
senha varchar(20) not null
);

INSERT INTO usuarios(nome, usuário, senha) VALUES("administrador", "admin", "12345");

SELECT * FROM usuarios;