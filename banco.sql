
	CREATE TABLE usuario (
    cpf CHAR(16) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    idade INT,
    email VARCHAR(100) UNIQUE
		
);


INSERT INTO usuario
    (cpf, nome, idade, email)
VALUES
    ('53872136054', 'Fufia', '9','fufia@gmail.com'),
    ('87341167025', 'Panda', '8','panda@email.com'),
    ('01522604049', 'Agenor', '5','snow@gmail.com');

select * from usuario;
