create database Hospital
default charset utf8
default collate utf8_general_ci;

use Hospital;

create table Funcionarios(
ID int not null auto_increment,
Nome varchar (50) not null,
CPF varchar (30) not null unique,
RG varchar (30) not null unique,
Telefone varchar (30) default '00 0000-0000',
cargo varchar (30) not null,
Salario double not null,
Endereco varchar (50),
Estado varchar (30),
Cidade varchar (30),
Regime varchar (10),
Lotacao varchar (20),
primary key(ID)
)
default charset utf8;

create table Fornecedor(
CNPJ varchar (20) not null,
Nome varchar (50) not null,
Estado varchar (30) not null,
Cidade varchar (30) not null,
Bairro varchar (30),
CEP varchar (30),
Logradouro varchar (40),
N varchar (10),
Responsavel int,
primary key(CNPJ),
foreign key(Responsavel) references Funcionarios(ID)
)
default charset utf8;

