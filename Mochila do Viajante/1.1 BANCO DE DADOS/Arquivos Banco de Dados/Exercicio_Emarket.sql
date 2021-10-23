USE emarket;

SELECT * FROM categorias;

SELECT CategoriaNome, Descricao FROM categorias;

SELECT * FROM produtos;

SELECT * FROM produtos WHERE Descontinuado = '1';

SELECT * FROM produtos WHERE ProvedorID = '8';

SELECT * FROM produtos WHERE PrecoUnitario BETWEEN 10 AND 22;

SELECT * FROM produtos WHERE UnidadesEstoque < NivelReabastecimento;
