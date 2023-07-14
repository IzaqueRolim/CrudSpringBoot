
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
- `GET /colaboradores/📋` Retorna todos os colaboradores cadastrados.
- `GET /colaboradores/{id}/ 📋` Retorna um colaborador específico pelo ID.
- `POST /novoColaborador/ ✏️` Cria um novo colaborador.
- `PUT /colaboradores/{id}/🔄` Atualiza um colaborador existente pelo ID.
- `DELETE /colaboradores/{id}/❌` Remove um colaborador pelo ID.
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

## 🤝 Colaboradores

Agradecemos às seguintes pessoas que contribuíram para este projeto:

<table>
  <tr>
    <td align="center">
      <a href="#">
        <img src="https://avatars.githubusercontent.com/u/98198585?v=4" width="100px;" alt="Foto do Steve Jobs"/><br>
        <sub>
          <b>Izaque Rolim</b>
        </sub>
      </a>
    </td>
  </tr>
</table>


## 😄 Seja um dos contribuidores<br>

> Para contribuir com este projeto, siga estas etapas:

    1. Bifurque este repositório.
    2. Crie um branch: git checkout -b <nome_branch>.
    3. Faça suas alterações e confirme-as: git commit -m '<mensagem_commit>'
    4. Envie para o branch original: git push origin <nome_do_projeto> / <local>
    5. Crie a solicitação de pull.
    
 Como alternativa, consulte a documentação do GitHub em [como criar uma solicitação pull](https://help.github.com/en/github/collaborating-with-issues-and-pull-requests/creating-a-pull-request).


## 📝 Licença

Esse projeto está sob licença. Veja o arquivo [LICENÇA](LICENSE.md) para mais detalhes.
