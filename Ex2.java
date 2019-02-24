import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		float numero;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um numero real: ");
		numero = scanner.nextFloat();
		
		System.out.println("Voce digitou o numero: " + numero);
		scanner.close();
	}

}
