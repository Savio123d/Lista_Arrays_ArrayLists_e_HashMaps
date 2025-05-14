import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> nome = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        for (int x=0;x<5;x++){
            System.out.printf("\nInforme o nome do produto %d:",x+1);
            nome.add(scanner.next());
        }
        int cont=1;
        System.out.printf("Remova algum produto: ");
        nome.remove(scanner.next());
        for(String f : nome){
            System.out.printf("\nNumero: %d e Produto: %s",cont,f);
            cont++;
        }
    }
}