package Products;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private static int contarID = 1;
    private int opcao;
    private int opcao2;
    private String cadastrarProduto;
    private int id;
    private int totalEstoque;
    private String nome;
    private String categoria;
    private double preco;
    private int quantidade;
    private String validade;

    public Produto(int id, String nome, String categoria, double preco, int quantidade, String validade) {
        this.id = contarID++;
        this.cadastrarProduto = cadastrarProduto;
        this.opcao = opcao;
        this.opcao2 = opcao2;
        this.totalEstoque = totalEstoque;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.quantidade = quantidade;
        this.validade = validade;
    }

    @Override
    public String toString() {
        return "ID " + id + " | Nome: " + nome  + " | Categoria: " + categoria + " | Preço: R$" + preco + " | Quantidade: " + quantidade + " | Validade: " + validade;
    }


    public void atualizarQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }

    public void atualizarPreco (double novoPreco) {
        this.preco = novoPreco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getValidade() {
        return validade;
    }

    public static List<Produto> produtos = new ArrayList<>();

    public void setPreco(double novoPreco) {
this.preco = novoPreco;
    }
}
