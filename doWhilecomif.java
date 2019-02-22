import java.util.Scanner;


//while e do while
public class Programa08 {

	public static void main(String[] args) {
		
		int idade;
		String nome;
		
		
		//Para receber dados do usuário via teclado
		Scanner teclado = new Scanner(System.in);
		
		//Primeiro executa o bloco, depois faz a checagem 
		do {
		System.out.println("Informe seu nome: ");
		nome = teclado.nextLine();
		System.out.println("Informe sua idade: ");
		//idade = teclado.nextInt(); bug 
		idade = Integer.parseInt(teclado.nextLine());
		
    if(idade > 0){
		System.out.println(nome + " tem " + idade + " anos");
		}
   } while(idade > 0);
		
		teclado.close();
	
	}
}
