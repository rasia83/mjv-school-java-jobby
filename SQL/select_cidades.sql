SELECT * FROM cidades WHERE uf = 'SP' and nome_municipio like '%São Paulo%';

SELECT uf, count(*) as total FROM cidades GROUP BY uf order by total desc;
SELECT nome_uf, count(*) as total FROM cidades GROUP BY nome_uf order by total desc;