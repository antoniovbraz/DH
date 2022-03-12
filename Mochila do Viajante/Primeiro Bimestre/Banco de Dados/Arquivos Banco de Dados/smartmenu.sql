CREATE DATABASE smartmenu;

USE smartmenu;

CREATE TABLE usuario
(
	id_usuario 		INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nomeusuario 	VARCHAR(45),
    nome 			VARCHAR(45),
    sobrenome 		VARCHAR(45),
    email 			VARCHAR(20),
    senha 			VARCHAR(20)
);

CREATE TABLE categoria
(
	id_categoria 	INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome_categoria	VARCHAR(45)
);

CREATE TABLE restaurante
(
	id_restaurante 	INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome			VARCHAR(45),
    endereço 		VARCHAR(150),
    telefone 		VARCHAR(45),
    email 			VARCHAR(150),
    aberto			CHAR(3),
    id_categoria 	INT,
    id_usuario 		INT,
    CONSTRAINT fk_usuario
    FOREIGN KEY (id_usuario)
    REFERENCES usuario(id_usuario),
    CONSTRAINT fk_categoria
    FOREIGN KEY (id_categoria)
    REFERENCES categoria(id_categoria)
);

CREATE TABLE categoria_item
(
	id_categoria_item 	INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR (45)
);

CREATE TABLE item
(
	id_item 			INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome	 			VARCHAR(45),
    descricao 			VARCHAR(200),
    preco 				DECIMAL(5,2),
    id_restaurante 		INT,
    id_categoria_item 	INT,
    CONSTRAINT fk_restaurante
    FOREIGN KEY (id_restaurante)
    REFERENCES restaurante(id_restaurante),
    CONSTRAINT fk_categoria_item
    FOREIGN KEY (id_categoria_item)
    REFERENCES categoria_item(id_categoria_item)
);

CREATE TABLE carrinho
(
    id_carrinho 	INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    id_restaurante INT,
    id_usuario INT,
    id_item INT,
    CONSTRAINT fk_restaurante_carrinho
    FOREIGN KEY (id_restaurante)
    REFERENCES restaurante(id_restaurante),
    CONSTRAINT fk_usuario_carrinho
    FOREIGN KEY (id_usuario)
    REFERENCES usuario(id_usuario),
    CONSTRAINT fk_item
    FOREIGN KEY (id_item)
    REFERENCES item(id_item)
);

CREATE TABLE pedido
(
	id_pedido 	INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    id_carrinho INT,
	data_atual  	date,
	hora_atual  	time,
	Total  		decimal(7,2) NULL,
    CONSTRAINT fk_carrinho
    FOREIGN KEY (id_carrinho)
    REFERENCES carrinho(id_carrinho)
);

