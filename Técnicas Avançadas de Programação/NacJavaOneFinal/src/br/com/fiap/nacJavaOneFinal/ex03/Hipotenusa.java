package br.com.fiap.nacJavaOneFinal.ex03;

import java.util.Scanner;

public class Hipotenusa {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//hipotenusa
		double hipot;
		
		//leitura dos catetos
		System.out.print("Informe o cateto 'A': ");
		double catA = scan.nextInt();
		System.out.print("Informe o cateto 'B': ");
		double catB = scan.nextInt();
		
		hipot = Math.sqrt(Math.pow(catA, 2) + Math.pow(catB, 2));
		
		System.out.printf("A hipotenusa eh igual a %.2f%n", hipot);
		
		scan.close();
	}
}
