package Functions;

import Products.Produto;

import java.util.InputMismatchException;
import java.util.Scanner;

import static Products.Produto.produtos;

public class cadastrarProduto {
    public static void cadastrarProduto(Scanner sc) {
        System.out.println();
        System.out.println("=== CADASTRO DE PRODUTO ===");

        try {
            System.out.println("Digite o número de identificação do produto: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Digite o nome do produto para armazenamento: ");
            String nome = sc.nextLine();

            System.out.println("Digite a categoria do produto: ");
            String categoria = sc.nextLine();

            System.out.println("Digite o preço do produto: ");
            while (!sc.hasNextDouble()) {
                System.out.println();
                System.out.println("Entrada inválida. Digite um número.");
                sc.nextLine();
            }
            double preco = sc.nextDouble();
            sc.nextLine();

            System.out.println("Digite a quantidade em estoque: ");
            while (!sc.hasNextInt()) {
                System.out.println();
                System.out.println("Entrada inválida. Digite um número inteiro.");
                sc.nextLine();
            }
            int quantidade = sc.nextInt();
            sc.nextLine();

            System.out.println("Digite a data de validade (dd/mm/aaaa): ");
            String validade = sc.nextLine();
            System.out.println();

            Produto produto = new Produto(id,nome, categoria, preco, quantidade, validade);
            produtos.add(produto);

            System.out.println("Produto cadastrado com sucesso!");
        } catch (InputMismatchException e){
            System.out.println();
            System.out.println("Entrada inválida. Digite um número.");
            sc.nextLine();
        }
    }
}
