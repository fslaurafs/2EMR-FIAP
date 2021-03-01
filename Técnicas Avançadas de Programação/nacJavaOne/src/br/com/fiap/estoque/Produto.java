package br.com.fiap.estoque;

public class Produto {
    private String descricao;
    private int quantidadeAtual;
    private int quantidadeMinima;
    private int quantidadeMaxima;
    private double precoVenda;

    public Produto(String descricao, double precoVenda) {
        this.descricao = descricao;
        this.precoVenda = precoVenda;
    }

    public Produto(String descricao, int quantidadeEstoque, double precoVenda) {
        this.descricao = descricao;
        this.quantidadeAtual = quantidadeEstoque;
        this.precoVenda = precoVenda;
    }

    public Produto(String descricao, int quantidadeAtual, int quantidadeMinima, int quantidadeMaxima, double precoVenda) {
        this.descricao = descricao;
        this.quantidadeAtual = quantidadeAtual;
        this.quantidadeMinima = quantidadeMinima;
        this.quantidadeMaxima = quantidadeMaxima;
        this.precoVenda = precoVenda;
    }

    //produto
    public String getDescricao() {
        return descricao;
    }

    public int getQuantidadeAtual() {
        return quantidadeAtual;
    }

    public int getQuantidadeMinima() {
        return quantidadeMinima;
    }

    public void setQuantidadeMinima(int quantidadeMinima) {
        this.quantidadeMinima = quantidadeMinima;
    }

    public int getQuantidadeMaxima() {
        return quantidadeMaxima;
    }

    public void setQuantidadeMaxima(int quantidadeMaxima) {
        this.quantidadeMaxima = quantidadeMaxima;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void setQuantidadeAtual(int quantidadeAtual) {
    	this.quantidadeAtual = quantidadeAtual;
    }

    //venda
    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public String toString() {
        return "Existem " + quantidadeAtual + " " +
                descricao + " no estoque com o valor unitario de  R$" 
        		+ String.format("%.2f", precoVenda);
    }
}
