package Functions;

import Products.Produto;

import java.util.Scanner;

import static Products.Produto.produtos;

public class removerProduto {
    public static void removerProduto(Scanner sc) {
        System.out.println();
        System.out.println("Digite o ID do produto: ");
        int id = sc.nextInt();
        sc.nextLine();

        Produto produto = produtos.stream().filter(p -> p.getId() == id).findFirst().orElse(null);

        if (produto != null) {
            produtos.remove(produto);
            System.out.println();
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println();
            System.out.println("Produto não encontrado.");
        }
    }
}
