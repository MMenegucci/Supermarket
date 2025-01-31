package Programming;

import java.util.InputMismatchException;
import java.util.Scanner;

import static Functions.atualizarPreco.atualizarPreco;
import static Functions.cadastrarProduto.cadastrarProduto;
import static Functions.listarProdutos.listarProdutos;
import static Functions.removerProduto.removerProduto;
import static Functions.sairPrograma.sairPrograma;
import static Functions.verificarEstoque.verificarEstoque;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.println("=== SISTEMA ATIVADO! ===");

            while (true) {
                System.out.println();
                System.out.println("1 - Cadastrar Produto");
                System.out.println("2 - Verificar Estoque");
                System.out.println("3 - Listar Produtos");
                System.out.println("4 - Atualizar Preço");
                System.out.println("5 - Remover Produto");
                System.out.println("0 - Sair");
                System.out.println();

            int opcao = -1;
            boolean entradaValida = false;

            while (!entradaValida) {
                try {
                    System.out.println("Escolha uma opção: ");
                    opcao = sc.nextInt();
                    sc.nextLine();
                    entradaValida = true;
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Digite um número.");
                    sc.nextLine();
                }
            }

            switch (opcao) {
                case 1:
                    cadastrarProduto(sc);
                    break;
                case 2:
                    verificarEstoque(sc);
                    break;
                case 3:
                    listarProdutos(sc);
                    break;
                case 4:
                    atualizarPreco(sc);
                    break;
                case 5:
                    removerProduto(sc);
                    break;
                case 0:
                    sairPrograma(sc);
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}