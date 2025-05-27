import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] Numb = new int[5];
        Scanner scanner = new Scanner(System.in);

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
        } finally {
            scanner.close();
        }
    }
}
