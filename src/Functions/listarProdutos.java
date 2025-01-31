package Functions;

import Products.Produto;

import java.util.Scanner;

import static Products.Produto.produtos;

public class listarProdutos {
    public static void listarProdutos(Scanner sc) {
        if (produtos.isEmpty()) {
            System.out.println();
            System.out.println("Nenhum produto cadastrado");
        } else {
            System.out.println();
            System.out.println("Lista de Produtos:");
            for (Produto produto : produtos) {
                System.out.println(produto);
            }
        }
    }
}
