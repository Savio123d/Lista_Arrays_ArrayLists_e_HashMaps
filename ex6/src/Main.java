import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> nome = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        for (int x = 0; x < 5; x++) {
            System.out.printf("Informe o nome do produto %d: ", x + 1);
            nome.add(scanner.next());
        }

        System.out.print("\nDigite o nome de um produto para verificar se está na lista: ");
        String produtoProcurado = scanner.next();

        if (nome.contains(produtoProcurado)) {
            System.out.println("Produto encontrado.");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }
}
