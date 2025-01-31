package Products;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private List<Produto> listaProduto = new ArrayList<>();

    public void addProduto (Produto produto) {
        listaProduto.add(produto);
    }
    public void removeProduto(int id) {
        listaProduto.removeIf(product -> product.getId() == id);
    }
    public void listarProduto () {
        for (Produto p : listaProduto) {
        }
    }
}
