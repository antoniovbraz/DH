/*
Check Point Banco de Dados
Nome: Antonio Henrique S Vanucci Braz
Turma: 12NT Professor/Tutores: Caio Vinicius / João Vitor
Resumo: Tentei criar um banco de dados de um Cardápio Inteligente.
		Eu imaginei a possibilidade de o cliente chegar ao estabelecimento e abrir o seu pedido
        diretamente de seu celular. Pelo celular ele consegue selecionar o restaurante que ele está,
        consegue ver os produtos e fazer pedidos. Dessa maneira o contato direto entre funcionários
        e clientes é reduzido, sem comprometer a qualidade do serviço.
        
        O Banco de Dados que pensei inicialmente é o abaixo. Always Under Construction.
*/

DROP DATABASE IF EXISTS smartmenu;
CREATE DATABASE smartmenu;
USE smartmenu;

CREATE TABLE usuario
(
	id_usuario 		INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nomeusuario 	VARCHAR(45) NOT NULL,
    nome 			VARCHAR(45) NOT NULL,
    sobrenome 		VARCHAR(45) NOT NULL,
    email 			VARCHAR(20) NOT NULL,
    senha 			VARCHAR(20) NOT NULL
);

CREATE TABLE categoria
(
	id_categoria 	INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome_categoria	VARCHAR(45)
);

CREATE TABLE restaurante
(
	id_restaurante 	INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome			VARCHAR(45)  NOT NULL,
    endereço 		VARCHAR(150) NOT NULL,
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
    nome 				VARCHAR (45) NOT NULL
);

CREATE TABLE item
(
	id_item 			INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome	 			VARCHAR(45)  NOT NULL,
    descricao 			VARCHAR(200) NOT NULL,
    preco 				DECIMAL(5,2) NOT NULL,
    id_restaurante 		INT NOT NULL,
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
    id_restaurante  INT NOT NULL,
    id_usuario 		INT NOT NULL,
    id_item 		INT NOT NULL,
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
	data_atual  date,
	hora_atual  time,
	Total  		decimal(7,2) NULL,
    CONSTRAINT fk_carrinho
    FOREIGN KEY (id_carrinho)
    REFERENCES carrinho(id_carrinho)
);


/*
	Testando o Banco de Dados operações CRUD
    Performing some CRUD tests to the Database
*/

# Criar usuário / Create user

INSERT INTO usuario (nomeusuario,nome,sobrenome,email,senha)
VALUES ('antoniovbraz','Antonio Henrique','Vanucci','teste@teste.com','123456'),
	   ('arthurichihei','Arthur Ichihei','Baba Vanucci','teste2@teste.com','123456'),
       ('brunaheimbeck','Bruna Reiser','Heimbeck','teste3@teste.com','123456');
       
# Verificar o resultado / Check the results

# SELECT * FROM usuario;

# Criar categorias de restaurantes / Create Restaurants categories

INSERT INTO categoria (nome_categoria)
VALUES ('Brasileira'),
	   ('Japonesa'),
       ('Hamburguerias'),
       ('Italiana');
       
# Verificar o resultado / Check the results

# SELECT * FROM categoria;

# Criar Restaurantes / Create Restaurants
INSERT INTO restaurante (nome,endereço,id_categoria,id_usuario)
VALUES ('Mc Donalds','Quintal de casa', 3, 1),
	   ('Shushi4all', 'Esquina de casa', 2, 2),
       ('Feijão de Corda', 'Outra esquina de casa', 1, 3);
       
# Verificar o resultado / Check the results

# select * from restaurante;

# Trazer informações da tabela
SELECT a.nome, b.nome_categoria, c.nomeusuario
FROM restaurante a
JOIN categoria b
ON a.id_restaurante = b.id_categoria
JOIN usuario c
ON a.id_restaurante = c.id_usuario;

/*
	Não sei porque mas não inseriu os dados como eu queria ou a query que fiz retorna errado. Mc donalds era para estar atribuido a hamburguerias, 
    mas sempre mostra categoria Brasileira. E o mesmo acontece o o restaurante feijão de corda.
*/

# Atualizar Tabela

UPDATE restaurante
SET nome='Burger King'
WHERE id_restaurante = 1;

# Excluir da tabela
DELETE FROM categoria
WHERE id_categoria = 4;