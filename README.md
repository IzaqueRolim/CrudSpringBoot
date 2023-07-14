
# Crud Spring Boot

> Este é o meu primeiro aplicativo backend desenvolvido em Spring Boot que oferece funcionalidades CRUD (Create, Read, Update, Delete) para três entidades principais: Colaborador, Projeto e Departamento.

### Requisitos
> Certifique-se de ter as seguintes ferramentas instaladas em seu ambiente de desenvolvimento:

    1. Java Development Kit (JDK) 8 ou superior
    2. Maven
    3. Spring Boot


### Endpoints
O sistema conta com as seguintes funcionalidades

###### Entidade colaborador
- `GET /colaboradores/` Retorna todos os colaboradores cadastrados.
- `GET /colaboradores/{id}/` Retorna um colaborador específico pelo ID.
- `POST /novoColaborador/` Cria um novo colaborador.
- `PUT /colaboradores/{id}/` Atualiza um colaborador existente pelo ID.
- `DELETE /colaboradores/{id}/` Remove um colaborador pelo ID.
###### Entidade Projeto
- `GET /projetos/` Retorna todos os projetos cadastrados.
- `GET /projetos/{id}/` Retorna um projeto específico pelo ID.
- `POST /novoProjetos/` Cria um novo projeto.
- `PUT /projetos/{id}/` Atualiza um projeto existente pelo ID.
- `DELETE /projetos/{id}/` Remove um projeto pelo ID.
###### Entidade Departamento
- `GET /departamentos/` Retorna todos os departamentos cadastrados.
- `GET /departamentos/{id}/` Retorna um departamento específico pelo ID.
- `POST /departamentos/` Cria um novo departamento.
