USE projeto_spotify;

SELECT * FROM cancao WHERE titulo LIKE '%z%';

SELECT * FROM cancao WHERE titulo LIKE'_a%s';

SELECT * FROM playlist ORDER BY qtdcancoes DESC limit 1;

SELECT idPlaylist AS 'ID Playlist', 
idusuario AS 'ID Usuário', 
titulo AS 'Título', 
qtdcancoes AS 'Quantidade de Canções', 
idestado AS 'ID Estado', 
Datacriacao AS 'Data Criação', 
Dataexclusao AS 'Data Exclusão'
FROM playlist ORDER BY qtdcancoes DESC limit 1;

SELECT * FROM usuario ORDER BY Data_nac LIMIT 5 OFFSET 10;

SELECT * FROM album ORDER BY titulo;

SELECT * FROM album WHERE imagemcapa IS NULL ORDER BY titulo;

INSERT INTO usuario (idUsuario, NomeUsuario, NomeCompleto, senha, Data_nac, sexo, Cod, Pais_idPais)
VALUES  (20, "novousuariodespotify@gmail.com", "Elmer Santos", "S4321m", "1991-11-15", "M", "B4129ATF", 9);
