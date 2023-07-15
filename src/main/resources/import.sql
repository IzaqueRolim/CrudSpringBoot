INSERT INTO tb_departamento(nome) VALUES ('RH');
INSERT INTO tb_departamento(nome) VALUES ('TI');
INSERT INTO tb_departamento(nome) VALUES ('SOFTWARE');
INSERT INTO tb_departamento(nome) VALUES ('ELETRICA');

INSERT INTO tb_projeto(investimento, departamento_id, data_final, data_inicio, descricao, nome) VALUES (10000.0, 1, '2023-07-01', '2023-06-01', 'Descrição do projeto 1', 'Projeto 1');
INSERT INTO tb_projeto(investimento, departamento_id, data_final, data_inicio, descricao, nome) VALUES (20000.0, 2, '2023-08-01', '2023-07-01', 'Descrição do projeto 2', 'Projeto 2'); 
INSERT INTO tb_projeto(investimento, departamento_id, data_final, data_inicio, descricao, nome) VALUES (15000.0, 1, '2023-09-01', '2023-08-01', 'Descrição do projeto 3', 'Projeto 3'); 
INSERT INTO tb_projeto(investimento, departamento_id, data_final, data_inicio, descricao, nome) VALUES (18000.0, 3, '2023-10-01', '2023-09-01', 'Descrição do projeto 4', 'Projeto 4');
INSERT INTO tb_projeto(investimento, departamento_id, data_final, data_inicio, descricao, nome) VALUES (12000.0, 2, '2023-11-01', '2023-10-01', 'Descrição do projeto 5', 'Projeto 5');
INSERT INTO tb_projeto(investimento, departamento_id, data_final, data_inicio, descricao, nome) VALUES (25000.0, 4, '2023-12-01', '2023-11-01', 'Descrição do projeto 6', 'Projeto 6'); 
INSERT INTO tb_projeto(investimento, departamento_id, data_final, data_inicio, descricao, nome) VALUES (17000.0, 1, '2024-01-01', '2023-12-01', 'Descrição do projeto 7', 'Projeto 7');
INSERT INTO tb_projeto(investimento, departamento_id, data_final, data_inicio, descricao, nome) VALUES (30000.0, 3, '2024-02-01', '2024-01-01', 'Descrição do projeto 8', 'Projeto 8');
INSERT INTO tb_projeto(investimento, departamento_id, data_final, data_inicio, descricao, nome) VALUES (22000.0, 2, '2024-03-01', '2024-02-01', 'Descrição do projeto 9', 'Projeto 9');
INSERT INTO tb_projeto(investimento, departamento_id, data_final, data_inicio, descricao, nome) VALUES (19000.0, 4, '2024-04-01', '2024-03-01', 'Descrição do projeto 10', 'Projeto 10');


INSERT INTO tb_colaborador(departamento_id, nome, email,salario) VALUES (1, 'Maria', 'maria@gmail.com',1200);
INSERT INTO tb_colaborador(departamento_id, nome, email,salario) VALUES (2, 'Bob', 'bob@gmail.com',2400);
INSERT INTO tb_colaborador(departamento_id, nome, email,salario) VALUES (3, 'Alex', 'alex@gmail.com',5600);
INSERT INTO tb_colaborador(departamento_id, nome, email,salario) VALUES (4, 'Ana', 'ana@gmail.com',8988);

INSERT INTO COLABORADOR_PROJETO(projeto_id,colaborador_id) VALUES(1,1);
INSERT INTO COLABORADOR_PROJETO(projeto_id,colaborador_id) VALUES(2,3);
INSERT INTO COLABORADOR_PROJETO(projeto_id,colaborador_id) VALUES(3,1);
INSERT INTO COLABORADOR_PROJETO(projeto_id,colaborador_id) VALUES(4,2);
INSERT INTO COLABORADOR_PROJETO(projeto_id,colaborador_id) VALUES(1,2);
INSERT INTO COLABORADOR_PROJETO(projeto_id,colaborador_id) VALUES(3,4);