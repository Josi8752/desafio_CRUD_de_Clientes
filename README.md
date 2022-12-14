# desafio_CRUD_de_Clientes

Projeto Spring Boot contendo um CRUD completo de web services REST para
acessar um recurso de clientes, contendo as cinco operações básicas aprendidas no capítulo API REST, camadas, CRUD, exceções, validações:
> Busca paginada de recursos
> Busca de recurso por id
> Inserir novo recurso
> Atualizar recurso
> Deletar recurso.

O projeto está com um ambiente de testes configurado acessando o banco de dados H2, usando o
Maven como gerenciador de dependência, e Java como linguagem.

Um cliente possui nome, CPF, renda, data de nascimento, e quantidade de filhos.

O projeto contem um seed de 10 clientes.

Tratamos as seguintes exceções:
> Id não encontrado (para GET por id, PUT e DELETE), retornando código 404.
> Erro de validação, retornando código 422 e mensagens customizada para cada campo inválido. As
regras de validação são:
O Nome: não pode ser vazio
A Data de nascimento: não pode ser data futura.

CHECKLIST:
1. Busca por id retorna cliente existente
2. Busca por id retorna 404 para cliente inexistente
3. Busca paginada retorna listagem paginada corretamente
4. Inserção de cliente insere cliente com dados válidos
5. Inserção de cliente retorna 422 e mensagens customizadas com dados inválidos
6. Atualização de cliente atualiza cliente com dados válidos
7. Atualização de cliente retorna 404 para cliente inexistente
8. Atualização de cliente retorna 422 e mensagens customizadas com dados inválidos
9. Deleção de cliente deleta cliente existente
10. Deleção de cliente retorna 404 para cliente inexistente
