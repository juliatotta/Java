//Instrução Switch
public class Programa06 {

	public static void main(String[] args) {
		int numero = 10;
		
		
		switch (numero) {
		case 2:
			System.out.println("O numero é 2");
			break;
		case 3:
			System.out.println("O numero é 3");
			break;
		case 4:
			System.out.println("O numero é 4");
			break;
		default:
			System.out.println("O numero é " + numero);
			break;
		}
	}
}
