package br.com.fiap.estacionamento;
import java.util.Scanner;

import br.com.fiap.estacionamento.modelo.Estacionamento;
import br.com.fiap.estacionamento.modelo.Veiculo;

//private para atributo
//public para metodo

public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("informe a placa do veiculo: ");
		String placa = scan.nextLine();
		
		System.out.print("informe a marca do veiculo: ");
		String marca = scan.nextLine();
		
		System.out.print("informe o modelo do veiculo: ");
		String modelo = scan.nextLine();
		
		Estacionamento estacionamento = new Estacionamento();
		estacionamento.entra(new Veiculo(placa, marca, modelo));
		
		int opcao = 0;
		while(opcao != 1) {
			System.out.print("Pressione 1 para sair com o veiculo: ");
			opcao = scan.nextInt();
			
			if(opcao == 1) {
				estacionamento.sai();
			}
		}
		
		System.out.print(estacionamento.relatorio());
		scan.close();
	}

}
