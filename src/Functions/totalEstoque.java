package Functions;

import Products.Produto;

import static Products.Produto.produtos;

public class totalEstoque {
    public static void totalEstoque() {
        int total = produtos.stream().mapToInt(Produto::getQuantidade).sum();
        System.out.println();
        System.out.println("Total de estoque disponível: " + total);
    }
}
