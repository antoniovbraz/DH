USE emarket;

DROP VIEW IF EXISTS dados_provedores;
CREATE VIEW dados_provedores AS
SELECT ProvedorId,Contato,Empresa,concat(Endereco,", ", Cidade,", ", Codigopostal," - ",Pais)
FROM Provedores;