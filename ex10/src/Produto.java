import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Produto {
    private HashMap<Integer,String> produtos;

    public Produto() {
        produtos = new HashMap<>();
    }
    public void addProduto(int codigo,String nome){
        if (produtos.containsKey(codigo)){
            System.out.printf("\nProduto com código[%d] já cadastrado\n",codigo);
        }else {
            produtos.put(codigo,nome);
        }

    }
    public String buscarProduto(int codigo){
        if (produtos.containsKey(codigo)){
            return produtos.get(codigo);
        }
        return "Produto não Encontrado";
    }
    public ArrayList<String> listarProdutos(){
        ArrayList<String> produtosCadastrados = new ArrayList<>();

        Set<Integer> chaves = produtos.keySet();
        for(int chave: chaves){
            String produtoFormatado = chave + " - " + buscarProduto(chave);
            produtosCadastrados.add(produtoFormatado);
        }

        return produtosCadastrados;
    }
}
