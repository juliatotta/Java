import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		int numero;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um numero inteiro: ");
		numero = scanner.nextInt();

		System.out.println("Voce digitou o numero: " + numero);
		scanner.close();
	}

}
