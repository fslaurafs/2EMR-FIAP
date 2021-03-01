package br.com.fiap.nacJavaOneFinal.ex04;

import java.util.Random;

public class Dados {
	public static void main(String[] agrs) throws InterruptedException {
		System.out.println("Simulacao de lancamento de 2 dados.");
				
		int dado1 = new Random().nextInt(6) + 1;
		int dado2 = new Random().nextInt(6) + 1;
		
		int soma = dado1 + dado2;
		
		Thread.sleep(1000);
		System.out.printf("O primeiro dado deu: ");
		Thread.sleep(1000);
		System.out.print(dado1);
		
		Thread.sleep(1000);
		System.out.printf("\nO segundo dado deu: ");
		Thread.sleep(1000);
		System.out.print(dado2);
		
		Thread.sleep(1000);
		System.out.printf("\nA soma dos valores é %d", soma);
	}
}
