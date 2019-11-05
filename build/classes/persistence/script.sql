use loja;

create table usuario (id int(5) primary key auto_increment, login varchar (20) not null unique, senha varchar(50), nome varchar(50) not null, tipo varchar(3) not null);
create table cliente (id int(6) primary key auto_increment, nome varchar(50), endereco varchar(100), email varchar(50), telefone varchar(15), dtNasc varchar(10));
create table produto (id int(2) primary key auto_increment, nome varchar(30) not null unique, tipo varchar(20) not null, descricao text, valor double);
create table pedido (id int(10) primary key auto_increment, produtos text, cliente varchar(20) not null, valortotal double, usuario varchar(20), tipopedido varchar(10), hora timestamp);