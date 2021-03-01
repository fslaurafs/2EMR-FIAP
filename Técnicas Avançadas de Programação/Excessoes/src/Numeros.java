import javax.swing.JOptionPane;

public class Numeros {

	public static int recebeNumero(String mensagem) {
		try {
			int numero = Integer.parseInt(JOptionPane.showInputDialog(mensagem));
			return numero;
		} catch(NumberFormatException e) {
			System.err.println(e.getMessage());
			return recebeNumero(mensagem);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(recebeNumero("Digite um numero: "));
	}
	
}
