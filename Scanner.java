import java.util.Scanner;

public class Programa07 {

	public static void main(String[] args) {
		
		int idade;
		String nome;
		
		
		//Para receber dados do usuário via teclado
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe seu nome: ");
		nome = teclado.nextLine();
		System.out.println("Informe sua idade: ");
		idade = teclado.nextInt();
		
		System.out.println(nome + " tem " + idade + " anos");
		
		teclado.close();
	}
}
