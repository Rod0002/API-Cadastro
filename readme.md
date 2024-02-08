# API de Cadastro de Artistas

## Resumo

A API de Cadastro de Artistas � uma aplica��o desenvolvida em Java com o framework Spring Boot, oferecendo servi�os para gerenciar informa��es de artistas. A API permite a listagem, busca, cadastro e exclus�o de artistas.

## Endpoints

### Listar Artistas

- **M�todo:** GET
- **URL:** `/artistas`
- Retorna a lista de todos os artistas cadastrados.

### Buscar Artista por ID

- **M�todo:** GET
- **URL:** `/artistas/{id}`
- Retorna os detalhes de um artista espec�fico com base no ID fornecido.

### Cadastrar Artista

- **M�todo:** POST
- **URL:** `/artistas`
- Permite o cadastro de novos artistas. Envie os dados do artista no corpo da requisi��o no formato JSON.

  Exemplo de Dados JSON:
  ```json
  {
    "nome": "Nome do Artista",
    "descricao": "Descri��o do Artista"
  }

  Excluir Artista por ID

    M�todo: DELETE
    URL: /artistas/{id}
    Remove um artista com base no ID fornecido.

Configura��o do Ambiente

    Certifique-se de ter o Java 17 instalado.
    Clone o reposit�rio: git clone https://github.com/seu-usuario/api-cadastro-artistas.git
    Navegue at� o diret�rio do projeto: cd api-cadastro-artistas
    Execute a aplica��o Spring Boot: comando de execu��o

Observa��es

    O servidor padr�o est� configurado para rodar na porta 8080. Certifique-se de que a porta n�o esteja em uso por outra aplica��o.
    Utilize ferramentas como o Insomnia ou Postman para interagir com a API.

Exemplo de Uso (Insomnia)

    Crie um novo request com o m�todo POST.
    Configure a URL para http://localhost:8080/artistas.
    No corpo da requisi��o, envie dados JSON para cadastrar um novo artista.
    Envie a requisi��o e verifique a resposta.

A API de Cadastro de Artistas simplifica a gest�o de informa��es de artistas, oferecendo opera��es b�sicas para intera��o. Personalize conforme necess�rio para atender �s necessidades espec�ficas do seu projeto.