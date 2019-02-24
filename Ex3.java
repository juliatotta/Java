import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		int num1, num2, num3, soma;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		num1 = scanner.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		num2 = scanner.nextInt();
		
		System.out.println("Digite o terceiro numero: ");
		num3 = scanner.nextInt();
		
		num1 = num1 + num2;
		soma = num1 + num3;
		
		System.out.println("Valor da soma dos três números: " + soma);
		
		scanner.close();
	
	}

}
