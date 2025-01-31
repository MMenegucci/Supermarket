package Functions;

import Products.Produto;

import java.util.Scanner;

import static Products.Produto.produtos;

public class atualizarPreco {
    public static void atualizarPreco(Scanner sc) {
        System.out.println();
        System.out.println("Produtos cadastrados: ");
        System.out.println();
        for (Produto produto : produtos) {
            System.out.println(produto);
            System.out.println();
        }
        System.out.println("Digite o ID do produto: ");
        int id = sc.nextInt();
        sc.nextLine();

        Produto produto = produtos.stream().filter(p -> p.getId() == id).findFirst().orElse(null);

        if (produto != null) {
            System.out.println();
            System.out.println("Digite o novo preço: ");
            double novoPreco = sc.nextDouble();
            sc.nextLine();

            produto.setPreco(novoPreco);
            System.out.println();
            System.out.println("Preço atualizado com sucesso!");
            System.out.println();
        } else {
            System.out.println();
            System.out.println("Produto não encontrado.");
            System.out.println();
        }
    }
}
