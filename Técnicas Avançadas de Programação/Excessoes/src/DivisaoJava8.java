import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoJava8 {
	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) { // a partir do java 8
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
		}
	}
}
