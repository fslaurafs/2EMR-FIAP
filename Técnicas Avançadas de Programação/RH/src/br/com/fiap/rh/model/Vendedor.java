package br.com.fiap.rh.model;

public class Vendedor {
	private String nome;
	private int cpf;
	private double salarioBase;
	private double percentualBonus;
	private int quantidadeVendas;
	
	public double calculaSalario() {
		double salario = this.salarioBase * (1 + percentualBonus);
		salario += this.quantidadeVendas * .1; //soma 10% das vendas para bonus
		return salario;
	}
	
	
}
