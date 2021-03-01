
public class TesteReferencia {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(30);
		
		Conta novaConta = conta;
		System.out.println(novaConta.getSaldo());
		
		novaConta.deposita(50);
		System.out.println(conta.getSaldo());
		
		System.out.println(conta);
		System.out.println(novaConta);
		System.out.println(conta == novaConta);
		
	}
	
}
