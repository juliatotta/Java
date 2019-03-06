//Vetores parte2
public class Programa17 {

	public static void main(String[] args) {
		int numeros[] = new int[10];

		System.out.println("Tamanho do vetor: " + numeros.length);

		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 5;
		}

		System.out.println("Posição [0] -> " + numeros[0]);
		System.out.println("Posição [1] -> " + numeros[1]);
		System.out.println("Posição [2] -> " + numeros[2]);
		System.out.println("Posição [3] -> " + numeros[3]);
		System.out.println("Posição [4] -> " + numeros[4]);
		System.out.println("Posição [5] -> " + numeros[5]);
		System.out.println("Posição [6] -> " + numeros[6]);
		System.out.println("Posição [7] -> " + numeros[7]);
		System.out.println("Posição [8] -> " + numeros[8]);
		System.out.println("Posição [9] -> " + numeros[9]);
	}

}
