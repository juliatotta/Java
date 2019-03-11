import java.util.Scanner;

//Criando funções

/*
 Faça um programa que receba diversos nomes de frutas do usuário, no final imprima essas frutas em ordem contrária. O programa deve solicitar ao usuário quantas frutas ele quer informar. 
 */


public class Programa20 {
	static String frutas[];

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int quantidade;

		System.out.println("Informe quantas frutas deseja cadastrar: ");
		quantidade = scanner.nextInt();


		cadastrar_dados(quantidade);
		mostrar_dados(quantidade);
		

		scanner.close();

	}


	/* Uma função deve ter:
	 * a) Tipo de retorno
	 * b) Nome
	 * c) Parâmetros/Argumentos de entrada
	 * d) Retorno (Opcional - Depende do tipo de retorno)
	 */
	static void cadastrar_dados(int quantidade) {

		//Definindo o tamanho do vetor
		frutas = new String[quantidade];
		for(int i = 0; i < quantidade; i++) {
			System.out.println("Informe a " + (i + 1) + "º fruta: ");
			frutas[i] = scanner.next();
		}

	}
	static void mostrar_dados(int quantidade) {
		for(int i = (quantidade -1); i >=0; i--) {
			System.out.println(frutas[i]);
		}
	}
}
