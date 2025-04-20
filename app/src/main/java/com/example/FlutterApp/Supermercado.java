import java.util.ArrayList;
import java.util.List;

public class Supermercado {
    private List<String> produtos;

    public Supermercado() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(String produto) {
        produtos.add(produto);
    }

    public List<String> getProdutos() {
        return produtos;
    }
}