package Functions;

import Products.Produto;

import java.util.Scanner;

import static Products.Produto.produtos;

public class verificarEstoqueProduto {
    public static void verificarEstoqueProduto(Scanner sc) {
        System.out.println();
        System.out.println("Digite o NOME do produto: ");
        String nome = sc.nextLine();

        Produto produto = produtos.stream()
                .filter(p -> p.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElse(null);

        if (produto != null) {
            System.out.println();
            System.out.println("Quantidade de " + produto.getNome() + " em estoque: " + produto.getQuantidade());
        } else {
            System.out.println();
            System.out.println("Produto não encontrado.");
        }
    }
}
