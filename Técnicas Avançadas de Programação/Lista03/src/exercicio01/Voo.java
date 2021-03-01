package exercicio01;

import java.time.LocalDate;

public class Voo {
	
	private int numero;
	private LocalDate data;
	private boolean[] lugares;
	
	public Voo(int numero, LocalDate data) {
		this.numero = numero;
		this.data = data;
		this.lugares = new boolean [100];
	}
	
	private Voo(int numero, LocalDate data, boolean[] lugares) {
		this(numero, data);
		this.lugares = lugares;
	}
	
	public int proximoLivre() {
		for(int i = 0; i < this.lugares.length; i++) {
			if(!this.lugares[i]) {
				return i + 1;
			}
		}
		return -1;
	}
	
	public boolean verifica(int lugar) {
		return this.lugares[lugar - 1];
	}
	
	public boolean ocupa(int lugar) {
		if(this.verifica(lugar)) return false;
		return(this.lugares[lugar - 1] = true);
	}
	
	public int vagas() {
		int disponiveis = 0;
		for(boolean lugar : this.lugares) {
			if(!lugar) {
				disponiveis++;
			}
		}
		return disponiveis;
	}
	
	public int getVoo() {
		return this.numero;
	}
	
	public LocalDate getData() {
		return this.data;
	}
	
	public Voo clone() {
		return new Voo(this.numero, this.data, this.lugares);
	}
}
