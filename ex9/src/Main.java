import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criar os conjuntos de dados
        ArrayList<String> lista = new ArrayList<>();
        HashMap<String, Integer> mapa = new HashMap<>();

        // Preenchimento com 10.000 nomes
        for (int i = 0; i < 1000000; i++) {
            String nome = "Nome" + i;
            lista.add(nome);
            mapa.put(nome, i);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome a ser buscado (ex: Nome9999): ");
        String nomeBuscado = scanner.nextLine();

        // Buscar no ArrayList (for-each)
        long inicioLista = System.currentTimeMillis();
        boolean encontradoLista = false;
        for (String nome : lista) {
            if (nome.equals(nomeBuscado)) {
                encontradoLista = true;
                break;
            }
        }
        long fimLista = System.currentTimeMillis();
        long tempoLista = fimLista - inicioLista;

        // Buscar no HashMap (get direto)
        long inicioMapa = System.currentTimeMillis();
        Integer valor = mapa.get(nomeBuscado);  // Retorna null se não encontrar
        boolean encontradoMapa = (valor != null);
        long fimMapa = System.currentTimeMillis();
        long tempoMapa = fimMapa - inicioMapa;

        // Exibir resultados
        System.out.println("\nResultado da busca:");
        System.out.println("ArrayList -> Encontrado: " + encontradoLista + " | Tempo: " + tempoLista + " ms");
        System.out.println("HashMap   -> Encontrado: " + encontradoMapa + " | Tempo: " + tempoMapa + " ms");

        scanner.close();
    }
}
