# Exercícios com Arrays, Listas e Mapas em Java

## 📝 Descrição

Este repositório contém uma coleção de exercícios práticos em Java, desenvolvidos para demonstrar a utilização e as principais operações de estruturas de dados essenciais: `Arrays`, `ArrayList` (Listas) e `HashMap` (Mapas). O projeto serve como um material de estudo e consulta para desenvolvedores que desejam aprimorar suas habilidades com as principais estruturas de dados do Java.

---

## ⚙️ Principais Funcionalidades

O repositório aborda os seguintes conceitos:

-   **Arrays**:
    -   Criação e inicialização de arrays de tipos primitivos e de objetos.
    -   Iteração e manipulação de elementos.
    -   Cálculos com elementos de um array, como a soma.
-   **ArrayList**:
    -   Adição, remoção e busca de elementos.
    -   Verificação da existência de um item na lista (`.contains()`).
-   **HashMap**:
    -   Armazenamento de dados no formato chave-valor.
    -   Busca de valores a partir de uma chave (`.get()`).
    -   Iteração sobre os elementos de um mapa.
-   **Boas Práticas**:
    -   Implementação de um CRUD (Create, Read, Update, Delete) simples para gerenciar produtos.
    -   Comparativo de desempenho entre `ArrayList` e `HashMap` em operações de busca.
    -   Tratamento de exceções como `InputMismatchException` para entradas de usuário.

---

## 💻 Tecnologias e Linguagens Utilizadas

-   **Java**: O projeto foi desenvolvido utilizando a linguagem Java.
-   **JDK**: Versão 23 ou superior.

---

## 📁 Estrutura de Pastas e Arquivos

O projeto está organizado em múltiplos módulos, onde cada pasta `ex` representa um exercício específico:

```
/
├── ex2/src/Main.java       # Exercício com Arrays de Strings
├── ex3/src/Main.java       # Exercício de soma com Arrays
├── ex4/src/Main.java       # Adicionando itens em um ArrayList
├── ex5/src/Main.java       # Removendo itens de um ArrayList
├── ex6/src/Main.java       # Verificando se um item existe no ArrayList
├── ex7/src/Main.java       # Criando e iterando sobre um HashMap
├── ex8/src/Main.java       # Buscando um item em um HashMap
├── ex9/src/Main.java       # Comparando performance: ArrayList vs HashMap
├── ex10/src/Main.java      # CRUD de produtos com HashMap
└── tester/src/Main.java    # Arquivo que executa todos os exercícios em sequência
```

---

## ▶️ Passo a Passo de Execução

Você pode executar cada exercício individualmente ou todos de uma vez.

### Executando um exercício específico

1.  Navegue até a pasta do exercício desejado. Por exemplo, para o exercício 4:
    ```bash
    cd ex4/src
    ```
2.  Compile o arquivo `.java` usando o compilador Java:
    ```bash
    javac Main.java
    ```
3.  Execute o programa compilado:
    ```bash
    java Main
    ```

### Executando todos os exercícios em sequência

1.  Navegue até a pasta `tester`:
    ```bash
    cd tester/src
    ```
2.  Compile e execute o arquivo `Main.java`:
    ```bash
    javac Main.java
    java Main
    ```

---

## 💡 Exemplo de Uso (Exercício 8)

Este exercício demonstra como buscar um valor em um `HashMap` a partir de uma chave fornecida pelo usuário.

**Código (`ex8/src/Main.java`):**
```java
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Cria e preenche o HashMap
        HashMap<String, Integer> pessoas = new HashMap<>();
        pessoas.put("Ana", 25);
        pessoas.put("Bruno", 30);
        pessoas.put("Carlos", 22);

        // Pede ao usuário para digitar um nome
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o nome para busca: ");
        String nomeBuscado = scanner.nextLine();

        // Busca o nome no HashMap e exibe o resultado
        Integer idadeEncontrada = pessoas.get(nomeBuscado);
        if (idadeEncontrada != null) {
            System.out.println("A idade de " + nomeBuscado + " é: " + idadeEncontrada + " anos.");
        } else {
            System.out.println("Nome '" + nomeBuscado + "' não encontrado no cadastro.");
        }
        scanner.close();
    }
}
```

**Saída esperada no terminal:**

```
--- Pessoas Cadastradas ---
Nome: Ana - Idade: 25
Nome: Bruno - Idade: 30
Nome: Carlos - Idade: 22
---------------------------
Informe o nome para busca: Bruno
A idade de Bruno é: 30 anos.
```
