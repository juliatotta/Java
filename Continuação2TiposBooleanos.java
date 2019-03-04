//Tipos Booleanos
public class Programa14 {

	public static void main(String[] args) {
		//Tipos primitivos 
		boolean verdadeiro = true;
		boolean falso = false; 
		boolean ativo = true;

		//Tipos não primitivos 
		Boolean v = true;
		Boolean f = false;

		System.out.println("Verdadeiro -> " + verdadeiro);
		System.out.println("Falso -> " + falso);
		System.out.println("V -> " + v);
		System.out.println("F -> " + f);

		if(verdadeiro == true) {
			System.out.println("É verdadeiro!");
		}else {
			System.out.println("É falso!");
		}

		if((1 == 1) == true) {
			System.out.println("Verdadeiro =D");
		}else {
			System.out.println("Falso :(");
		}
		
		if(ativo) {
			System.out.println("Pode entrar no sistema");
		}else {
			System.out.println("...Acesso negado!");
		}

	}

}
