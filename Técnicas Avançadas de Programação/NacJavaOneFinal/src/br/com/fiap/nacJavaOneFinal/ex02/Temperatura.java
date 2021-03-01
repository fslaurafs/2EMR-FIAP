package br.com.fiap.nacJavaOneFinal.ex02;

import java.util.Scanner;

public class Temperatura {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[1] Celsius para Fahrenheit \n[2] Fahrenheit para Celsius");
		System.out.print("Escolha seu metodo de conversao: ");
		int convert = scan.nextInt();
		
		System.out.print("Informe a temperatura: ");
		int temp = scan.nextInt();
		
		if(convert == 1) {
			double tempF = ((9 * temp) / 5) + 32;
			System.out.printf("A temperatura de %d°C equivale a %.2f°F", temp, tempF);
		}
		
		else {
			double tempC = ((temp - 32) / 9) * 5;
			System.out.printf("A temperatura de %d°F equivale a %.2f°C", temp, tempC);
		}
		
		scan.close();
	}
}
