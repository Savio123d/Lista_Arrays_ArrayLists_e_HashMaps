import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exercício 01
        int[] Numb = new int[5];
        try {
            for (int x = 0; x < 5; x++) {
                System.out.printf("Informe o valor %d: ", x + 1);
                Numb[x] = scanner.nextInt();
            }
            for (int x = 0; x < 5; x++) {
                System.out.printf("Posição: %d, Valor: %d%n", x + 1, Numb[x]);
            }
        } catch (InputMismatchException erro) {
            System.out.println("Erro: você digitou um valor inválido!");
            System.out.println("Possível solução: digite apenas números inteiros. Exemplo: 999");
            scanner.nextLine(); // limpar buffer
        }

        // Exercício 02
        String[] cidades = {"Marialva", "Maringar", "Mandaguari", "Floresta"};
        for (String cidade : cidades) {
            System.out.println("Nome: " + cidade);
        }

        // Exercício 03
        int[] numeros = new int[6];
        int soma = 0;
        try {
            for (int x = 0; x < 6; x++) {
                System.out.printf("\nInforme seu valor da posição %d: ", x + 1);
                numeros[x] = scanner.nextInt();
                soma += numeros[x];
            }
            System.out.println("O valor da soma é : " + soma);
        } catch (InputMismatchException erro) {
            System.out.println("Erro valor inválido!");
            System.out.println("Possível solução: digite apenas números inteiros. Exemplo: 999");
            scanner.nextLine();
        }

        // Exercício 04
        ArrayList<String> produtos = new ArrayList<>();
        for (int x = 0; x < 5; x++) {
            System.out.printf("\nInforme o nome do produto %d: ", x + 1);
            produtos.add(scanner.next());
        }
        int cont = 1;
        for (String prod : produtos) {
            System.out.printf("\nNúmero: %d e Produto: %s", cont, prod);
            cont++;
        }

        // Exercício 05
        System.out.printf("\nRemova algum produto: ");
        String produtoRemover = scanner.next();
        produtos.remove(produtoRemover);
        cont = 1;
        for (String prod : produtos) {
            System.out.printf("\nNúmero: %d e Produto: %s", cont, prod);
            cont++;
        }

        // Exercício 06
        System.out.print("\nDigite o nome de um produto para verificar se está na lista: ");
        String produtoProcurado = scanner.next();
        if (produtos.contains(produtoProcurado)) {
            System.out.println("Produto encontrado.");
        } else {
            System.out.println("Produto não encontrado.");
        }

        // Exercício 07
        HashMap<String, Integer> pessoas = new HashMap<>();
        pessoas.put("Ana", 25);
        pessoas.put("Bruno", 30);
        pessoas.put("Carlos", 22);
        pessoas.put("Daniela", 28);
        pessoas.put("Eduardo", 35);

        pessoas.forEach((nome, idade) -> {
            System.out.println("Nome: " + nome + " - Idade: " + idade);
        });

        // Exercício 08
        System.out.print("Informe o nome para busca: ");
        scanner.nextLine(); // limpar buffer
        String nomeBuscado = scanner.nextLine();
        Integer idadeEncontrada = pessoas.get(nomeBuscado);
        if (idadeEncontrada != null) {
            System.out.println("A idade de " + nomeBuscado + " é: " + idadeEncontrada + " anos.");
        } else {
            System.out.println("Nome '" + nomeBuscado + "' não encontrado no cadastro.");
        }

        // Exercício 09
        ArrayList<String> lista = new ArrayList<>();
        HashMap<String, Integer> mapa = new HashMap<>();
        for (int i = 0; i < 10000; i++) {
            String nome = "Nome" + i;
            lista.add(nome);
            mapa.put(nome, i);
        }

        System.out.print("Digite o nome a ser buscado (ex: Nome9999): ");
        String nomeProcurado = scanner.nextLine();

        long inicioLista = System.currentTimeMillis();
        boolean encontradoLista = false;
        for (String nome : lista) {
            if (nome.equals(nomeProcurado)) {
                encontradoLista = true;
                break;
            }
        }
        long fimLista = System.currentTimeMillis();
        long tempoLista = fimLista - inicioLista;

        long inicioMapa = System.currentTimeMillis();
        boolean encontradoMapa = mapa.get(nomeProcurado) != null;
        long fimMapa = System.currentTimeMillis();
        long tempoMapa = fimMapa - inicioMapa;

        System.out.println("\nResultado da busca:");
        System.out.println("ArrayList -> Encontrado: " + encontradoLista + " | Tempo: " + tempoLista + " ms");
        System.out.println("HashMap   -> Encontrado: " + encontradoMapa + " | Tempo: " + tempoMapa + " ms");

        // Exercício 10
        HashMap<Integer, String> catalogo = new HashMap<>();
        int opcao;
        do {
            System.out.println("\n=== CRUD de Produto ===");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Buscar Produto");
            System.out.println("3 - Listar Produtos");
            System.out.println("9 - Sair");
            System.out.print("Selecione uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o código do produto: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite o nome do produto: ");
                    String nomeProduto = scanner.nextLine();
                    catalogo.put(codigo, nomeProduto);
                    break;
                case 2:
                    System.out.print("Digite o código do produto: ");
                    int codBusca = scanner.nextInt();
                    String resultado = catalogo.get(codBusca);
                    if (resultado != null) {
                        System.out.println("Produto encontrado: " + resultado);
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("Lista de produtos cadastrados:");
                    catalogo.forEach((cod, nome) -> System.out.println("Código: " + cod + ", Produto: " + nome));
                    break;
                case 9:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 9);

        scanner.close();
    }
}