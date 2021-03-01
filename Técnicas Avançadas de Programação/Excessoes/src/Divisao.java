import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {
	public static void main(String[] args) {
		Scanner scan = null;
		
		try {
			scan = new Scanner(System.in);
			System.out.print("Informe o numerador: ");
			int numerador = scan.nextInt();
			
			System.out.print("Informe o denominador: ");
			int denominador = scan.nextInt();
			
			System.out.println("O resultado eh: " + (numerador / denominador));
			
		} catch (InputMismatchException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Executou o finally");
			scan.close();
		}
		
	}
}
