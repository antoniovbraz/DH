USE filmes_db;

SELECT * FROM filmes;

SELECT nome, sobrenome, avaliacao FROM atores;

SELECT titulo FROM series;

SELECT nome, sobrenome, avaliacao FROM atores WHERE avaliacao >= 7.5;

SELECT titulo, avaliacao, premios FROM filmes WHERE avaliacao >= 7.5 AND premios > 1;

SELECT titulo, avaliacao FROM filmes ORDER BY avaliacao DESC;

SELECT titulo FROM filmes WHERE titulo LIKE 'Toy Story';

SELECT nome FROM atores WHERE nome LIKE 'sam%';

SELECT titulo FROM filmes WHERE data_lancamento BETWEEN '2004-01-01' AND '2008-12-31';
