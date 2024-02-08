# API de Cadastro de Artistas

## Resumo

A API de Cadastro de Artistas é uma aplicação desenvolvida em Java com o framework Spring Boot, oferecendo serviços para gerenciar informações de artistas. A API permite a listagem, busca, cadastro e exclusão de artistas.

## Endpoints

### Listar Artistas

- **Método:** GET
- **URL:** `/artistas`
- Retorna a lista de todos os artistas cadastrados.

### Buscar Artista por ID

- **Método:** GET
- **URL:** `/artistas/{id}`
- Retorna os detalhes de um artista específico com base no ID fornecido.

### Cadastrar Artista

- **Método:** POST
- **URL:** `/artistas`
- Permite o cadastro de novos artistas. Envie os dados do artista no corpo da requisição no formato JSON.

  Exemplo de Dados JSON:
  ```json
  {
    "nome": "Nome do Artista",
    "descricao": "Descrição do Artista"
  }

  Excluir Artista por ID

    Método: DELETE
    URL: /artistas/{id}
    Remove um artista com base no ID fornecido.

Configuração do Ambiente

    Certifique-se de ter o Java 17 instalado.
    Navegue até o diretório do projeto: cd api-cadastro-artistas
    Execute a aplicação Spring Boot (CadastroArtistaApplication): comando de execução

Observações

    O servidor padrão está configurado para rodar na porta 8080. Certifique-se de que a porta não esteja em uso por outra aplicação.
    Utilize ferramentas como o Insomnia ou Postman para interagir com a API.

Exemplo de Uso (Insomnia)

    Crie um novo request com o método POST.
    Configure a URL para http://localhost:8080/artistas.
    No corpo da requisição, envie dados JSON para cadastrar um novo artista.
    Envie a requisição e verifique a resposta.

A API de Cadastro de Artistas simplifica a gestão de informações de artistas, oferecendo operações básicas para interação. Personalize conforme necessário para atender às necessidades específicas do seu projeto.
