import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
         Produto crud = new Produto();
        do {
            System.out.println("===CRUD de Produto===");
            System.out.println("1- Cadastrar Produto");
            System.out.println("2- Buscar Produto");
            System.out.println("3- Listar Produto");
            System.out.println("9- Sair");
            System.out.print("Selecione uma opção: ");
            opcao = scanner.nextInt();
            switch (opcao){
                case 1:

                    System.out.println("===Cadastrar===");
                    System.out.printf("Digite o código do produto: ");
                    int codigoDigitado = scanner.nextInt();
                    System.out.printf("\nDigite o nome do Produto: ");
                    String nomeDigitado = scanner.next();
                    crud.addProduto(codigoDigitado,nomeDigitado);
                    break;

                case 2:

                    System.out.println("===Buscar===");
                    System.out.printf("Digite o código do produto: ");
                    int codigoBusca = scanner.nextInt();
                    String nomeProdutoBuscar = crud.buscarProduto(codigoBusca);
                    System.out.printf("Produto Buscado %\n",nomeProdutoBuscar);
                    break;

                case 3:

                    System.out.println("===Listar===");

                    ArrayList<String> produtosCadastrados = crud.listarProdutos();
                    for(String produto : produtosCadastrados){
                        System.out.println(produto);
                    }
                    break;
                case 9:
                    System.out.println("Saindo..."); break;
                default:
                    System.out.println("Numero digitado invalido");
                    break;
            }
        }while (opcao!=9);
    }
}