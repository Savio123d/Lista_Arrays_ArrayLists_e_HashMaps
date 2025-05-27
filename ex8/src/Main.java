import java.util.HashMap;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> pessoas = new HashMap<>();
        pessoas.put("Ana", 25);
        pessoas.put("Bruno", 30);
        pessoas.put("Carlos", 22);
        pessoas.put("Daniela", 28);
        pessoas.put("Eduardo", 35);

        System.out.println("--- Pessoas Cadastradas ---");
        pessoas.forEach((nome, idade) -> {
            System.out.println("Nome: " + nome + " - Idade: " + idade);
        });
        System.out.println("---------------------------");

        Scanner scanner = new Scanner(System.in);

        // Pedir ao usuário para digitar um nome
        System.out.print("Informe o nome para busca: "); // Usamos print para o usuário digitar na mesma linha
        String nomeBuscado = scanner.nextLine(); // Ler o nome digitado pelo usuário

        // Buscar o nome no HashMap
        // O método get(chave) retorna o valor associado à chave,
        // ou null se a chave não for encontrada.
        Integer idadeEncontrada = pessoas.get(nomeBuscado);

        // Verificar se o nome foi encontrado e imprimir o resultado
        if (idadeEncontrada != null) {
            // Se idadeEncontrada não for null, o nome existe no mapa
            System.out.println("A idade de " + nomeBuscado + " é: " + idadeEncontrada + " anos.");
        } else {
            // Se idadeEncontrada for null, o nome não foi encontrado
            System.out.println("Nome '" + nomeBuscado + "' não encontrado no cadastro.");
        }

        // Fechar o Scanner para liberar os recursos
        scanner.close();
        
    }
}