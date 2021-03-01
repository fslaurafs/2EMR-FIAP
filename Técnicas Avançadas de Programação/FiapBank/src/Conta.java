import java.text.DecimalFormat;

//tipo, só a definição
public class Conta {
	private Cliente titular;
	private int numero;
	private int agencia;
	private double saldo;
	
	private DecimalFormat formataSaldo = new DecimalFormat("R$ #0.00");
	
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public boolean saca(double valor) {
		if(saldoSuficiente(valor)) {
			this.saldo = this.saldo - valor;
			return true;
		}
		
		return false;
	}
	
	public boolean transfere(double valor, Conta conta) {
		if(!this.saca(valor)) return false;
		conta.deposita(valor);
		return true;
		
	}
	
	private boolean saldoSuficiente(double valor) { // não aparece para o usuário
		return this.saldo >= valor;
	}
	
	// getters e setters
	public double getSaldo() {
		return this.saldo;
	}
	
	public String consultaSaldoFormatado() { // devolve o saldo formatado
		return formataSaldo.format(this.saldo);
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
