O projeto Supermarket é um sistema interativo desenvolvido em Java para gerenciar o estoque de um supermercado. Ele permite o cadastro, listagem, atualização e remoção de produtos, além de verificar a quantidade total em estoque. O programa foi criado com base nos princípios da Programação Orientada a Objetos (POO), utilizando boas práticas como encapsulamento e modularização.

Funcionalidades

Cadastro de Produtos: Permite ao usuário inserir novos produtos com ID, nome, categoria, preço, quantidade e data de validade.

Listagem de Produtos: Exibe todos os produtos cadastrados no sistema.

Atualização de Produtos: Possibilita a alteração do preço de um produto já cadastrado.

Remoção de Produtos: Permite excluir um produto do estoque com base no ID.

Verificação de Estoque:

Total de produtos disponíveis no sistema.

Consulta específica da quantidade em estoque de um determinado produto.

Validação de Entrada: O programa verifica se os valores inseridos pelo usuário são válidos, evitando erros de digitação.

Interface Interativa: Sistema baseado em menus que guia o usuário nas operações.

Tecnologias Utilizadas

Java: Linguagem principal para a implementação.

Scanner (java.util.Scanner): Utilizado para interação com o usuário via terminal.

Tratamento de Exceções: Implementado para evitar falhas com entradas inválidas.

Coleções Java (List): Utilizado para armazenar e manipular a lista de produtos de forma eficiente.

Estrutura do Código

O projeto está organizado nos seguintes pacotes:

Supermarket
│── src/
│   ├── application/
│   │   ├── Main.java       # Classe principal, responsável pelo fluxo do programa
│   ├── entities/
│   │   ├── Produto.java    # Classe responsável pelos atributos e métodos dos produtos

Main.java: Contém a lógica de interação com o usuário, menu principal e chamadas para os métodos necessários.

Produto.java: Representa os produtos cadastrados, contendo atributos e métodos para manipulação dos mesmos.
