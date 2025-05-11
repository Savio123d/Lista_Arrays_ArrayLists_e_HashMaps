import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] nome = new String[4];
        Scanner scanner = new Scanner(System.in);
        nome[0] = "Marialva";
        nome[1] = "Maringar";
        nome[2] = "Mandaguari";
        nome[3] = "Floresta";
        for(String f : nome){
            System.out.println("Nome: " + f);
        }

    }
}