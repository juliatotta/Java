//Operações Matemáticas
public class Programa15 {

	public static void main(String[] args) {
		int num1 = 5, num2 = 9, resultado;
		float resultado2; 

		//Soma
		resultado = num1 + num2;
		System.out.println("A soma de " + num1 + " + " + num2 + " = " + resultado);

		//Subtração
		resultado = num2 - num1;
		System.out.println("A subtração de " + num2 + " - " + num1 + " = " + resultado);

		//Subtração2
		resultado = num1 - num2;
		System.out.println("A subtração de " + num1 + " - " + num2 + " = " + resultado);

		//Multiplicação
		resultado = num1 * num2;
		System.out.println("A multiplicação de " + num1 + " * " + num2 + " = " + resultado);
		
		//Divisão
		resultado2 = (float)num2 / (float)num1;
		System.out.println("A divisão de " + num2 + " / " + num1 + " = " + resultado2);
		
		//Divisão2
		resultado2 = (float)num1 / (float)num2;
		System.out.println("A divisão de " + num1 + " / " + num2 + " = " + resultado2);
		
		//Módulo
		resultado = num1 % 2; 
		System.out.println("O resto da divisão de " + num1 + " por 2  = " + resultado);
	}

}
