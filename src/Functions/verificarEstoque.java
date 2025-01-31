package Functions;

import java.util.InputMismatchException;
import java.util.Scanner;

import static Functions.totalEstoque.totalEstoque;
import static Functions.verificarEstoqueProduto.verificarEstoqueProduto;

public class verificarEstoque {
    public static void verificarEstoque(Scanner sc) {
        System.out.println();
        System.out.println("Selecione uma das opções abaixo.");
        System.out.println("1 - Verificar total de estoque armazenado.");
        System.out.println("2 - Verificar estoque de um produto específico.");

        int opcao2 = -1;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.println();
                System.out.println("Escolha uma opção: ");
                opcao2 = sc.nextInt();
                sc.nextLine();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println();
                System.out.println("Entrada inválida. Digite um número.");
                sc.nextLine();
            }
        }

        switch (opcao2) {
            case 1:
                totalEstoque();
                break;
            case 2:
                verificarEstoqueProduto(sc);
                break;
            default:
                System.out.println("Opção inválida. Tente novamente");
        }
    }
}
