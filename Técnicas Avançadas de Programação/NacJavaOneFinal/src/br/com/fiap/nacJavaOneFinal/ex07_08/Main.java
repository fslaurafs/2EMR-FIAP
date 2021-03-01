package br.com.fiap.nacJavaOneFinal.ex07_08;

import br.com.fiap.estoque.Produto;
import br.com.fiap.estoque.Venda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do protudo: ");
        String nomeProduto = scanner.nextLine();
        System.out.print("Digite o preco do protudo: R$");
        double preco = scanner.nextDouble();
        System.out.print("Digite a quantidade do protudo no estoque: ");
        int quantidade = scanner.nextInt();

        Produto produto = new Produto(nomeProduto, quantidade, preco);

        System.out.print("Digite o quantidade que voce quer comprar do produto: ");
        quantidade = scanner.nextInt();

        Venda venda = new Venda(produto, quantidade);
        venda.realizarVenda();

        System.out.println(produto);
        System.out.println(venda);

        scanner.close();
    }
}
