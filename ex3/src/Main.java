import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numb = new int[6];
        int soma= 0;
        Scanner scanner = new Scanner(System.in);
        for(int x = 0;x<6;x++){
            System.out.printf("\nInforme seu valor da posição %d: ",x+1);
            numb[x] = scanner.nextInt();
            soma+= numb[x];
        }
        System.out.println("O valor da soma é : "+soma);


    }
}