package br.com.fiap.estoque;

public class Venda {
    private Produto produto;
    private int quantidade;
    private double valorVenda;

    public Venda(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorVenda = 0.0;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void realizarVenda() {
        this.valorVenda = produto.getPrecoVenda() * this.quantidade;
    }

    @Override
    public String toString() {
        return "Foi realizado a venda de " + quantidade + " " +
                produto.getDescricao() + " em um valor total de R$" + String.format("%.2f", valorVenda);
    }
}
