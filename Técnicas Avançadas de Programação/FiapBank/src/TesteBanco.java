
public class TesteBanco {
	public static void main(String[] args) { //static não gera instancia, deixa alocado na memoria
		Conta conta = new Conta();  //cria uma conta corrente
		Cliente jim = new Cliente();
		jim.setNome("Jim");
		conta.setTitular(jim);
		conta.deposita(3500);
		System.out.println(conta.getTitular().getNome());
		System.out.println(conta.getSaldo());
		
		Conta contaDoThiago = new Conta(); //cria uma conta corrente
		contaDoThiago.deposita(2000);
		boolean sacou = contaDoThiago.saca(500);
		if(sacou) {
			System.out.println("Saque efetuado com sucesso!");
		} else {
			System.out.println("Saldo insuficiente!");
		}
		
		if(conta.transfere(2000, contaDoThiago)) {
			System.out.println("Transferencia efetuada com sucesso!");
		} else {
			System.out.println("Saldo insuficiente!");
		}
		
		System.out.println("Saldo do Jim: " + conta.getSaldo());
		System.out.println("Saldo do Thiago: " + contaDoThiago.getSaldo());
		System.out.println(conta.getSaldo() + contaDoThiago.getSaldo());
		
	}
}
