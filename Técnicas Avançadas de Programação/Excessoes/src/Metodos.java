
public class Metodos {
	
	public static void metodo2() {
		System.out.println("Inicio do metodo 2");
		int[] v = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		try {
			for(int i = 0; i <= v.length; i++) {
				System.out.println(v[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("Fim do metodo 2");
	}
	
	public static void metodo1() {
		System.out.println("Inicio do metodo 1");
		metodo2();
		System.out.println("Fim do metodo 1");
	}
	
	public static void main(String[] args) {
		System.out.println("Inicio do metodo main");
		System.out.println("Fim do metodo main");
	}
}
