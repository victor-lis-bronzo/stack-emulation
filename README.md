# Simulação de uma pilha em Java

## Sobre o exercício

Este projeto foi desenvolvido para a disciplina de Estrutura de Dados. A
proposta era criar um programa capaz de gerenciar uma pilha e implementar as
operações básicas dessa estrutura:

- inserir um elemento no topo;
- remover o elemento do topo;
- imprimir os elementos armazenados;
- verificar se a pilha está vazia;
- verificar se a pilha está cheia;
- consultar o elemento que está no topo.

Uma pilha segue o princípio **LIFO** (*Last In, First Out*, ou "último a entrar,
primeiro a sair"). Portanto, o último elemento inserido é sempre o primeiro a
ser removido. Um exemplo cotidiano é uma pilha de pratos: só é possível retirar
primeiro o prato que está por cima.

## Solução implementada

A classe `Pilha` representa a estrutura usando:

- um vetor de `String` chamado `elementos`, que armazena os valores;
- um inteiro chamado `topo`, que indica a próxima posição livre do vetor.

Ao criar uma pilha, o construtor recebe sua capacidade. Neste projeto, o
programa principal cria uma pilha com espaço para 10 elementos:

```java
Pilha pilha = new Pilha(10);
```

O valor inicial de `topo` é `0`, indicando que a pilha começa vazia. Quando um
elemento é inserido, ele ocupa `elementos[topo]` e, em seguida, `topo` é
incrementado. Quando um elemento é removido, `topo` é decrementado e a posição
liberada recebe uma string vazia.

## Operações da classe `Pilha`

### `empilha(String valor)`

Insere `valor` na próxima posição disponível. A inserção só acontece quando a
pilha não está cheia, evitando ultrapassar o limite do vetor.

### `desempilha()`

Remove o elemento que está no topo. A operação só acontece quando a pilha não
está vazia, mantendo o índice `topo` dentro dos limites válidos.

### `imprimirPilha()`

Percorre as posições ocupadas, da primeira até a posição anterior ao topo, e
exibe o índice e o valor de cada elemento.

### `verificarPilhavazia()`

Retorna `true` quando `topo` é igual a `0`, pois isso significa que nenhum
elemento está armazenado.

### `verificarPilhaCheia()`

Retorna `true` quando `topo` é igual ao tamanho do vetor, indicando que todas as
posições disponíveis estão ocupadas.

### `retornaElementoTopoPilha()`

Retorna o elemento que está na posição `topo - 1`, que é a última posição
preenchida e, portanto, o topo da pilha.

Essa consulta deve ser feita apenas quando a pilha possui elementos. Caso a
pilha esteja vazia, não existe elemento no topo para ser retornado.

## Demonstração no `App`

O arquivo `App.java` demonstra o funcionamento da estrutura com este fluxo:

1. cria uma pilha com capacidade para 10 elementos;
2. imprime a pilha inicialmente vazia;
3. adiciona `Victor` e depois `Lucas`;
4. remove `Lucas`, que foi o último elemento inserido;
5. adiciona `Muniz`, `Maranhão` e `Mari`;
6. imprime a pilha e mostra `Mari` como elemento do topo.

Esse comportamento confirma a regra LIFO: depois de inserir `Victor` e `Lucas`,
o `desempilha()` remove `Lucas`, e não `Victor`.

## Como executar

Com o JDK instalado, compile os arquivos para a pasta `bin`:

```bash
javac -d bin src/*.java
```

Depois, execute a classe principal:

```bash
java -cp bin App
```

## Estrutura do projeto

```text
src/
├── App.java       # Programa de demonstração
└── Pilha.java     # Implementação da pilha
```