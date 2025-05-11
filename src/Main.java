import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] Numb = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int x = 0; x < 5; x++) {
            System.out.printf("Informe o valor %d: ", x + 1);
            Numb[x] = scanner.nextInt();
        }

        for (int x = 0; x < 5; x++) {
            System.out.printf("Posição: %d, Valor: %d%n", x + 1, Numb[x]);
        }
        scanner.close();
    }
}
