import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> pessoas = new HashMap<>();
        pessoas.put("Ana", 25);
        pessoas.put("Bruno", 30);
        pessoas.put("Carlos", 22);
        pessoas.put("Daniela", 28);
        pessoas.put("Eduardo", 35);

        pessoas.forEach((nome, idade) -> {
            System.out.println("Nome: " + nome + " - Idade: " + idade);
        });
    }
}