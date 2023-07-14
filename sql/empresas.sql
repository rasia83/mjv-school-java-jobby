CREATE TABLE `empresas` (
  `id` int(11) NOT NULL AUTO_INCREMENT, -- int(11) MySQL / integer para  Postgre
  `nome` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

CREATE INDEX idx_nome ON empresas (nome);


INSERT INTO `empresas` (`nome`)
VALUES 
  ('Desenvolvedor de Software');

