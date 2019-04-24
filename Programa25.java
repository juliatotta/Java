package br.com.geekuniversity.secao11;

public class Programa25 {
	public static void main(String[] args) {
		Cliente diogo = new Cliente("Diogo Magalhaes Martins", "Rua Conselheiro Zacarias, 94");
		Cliente julia = new Cliente("Julia Totta Amaro", "Rua Conselheiro Zacarias, 94");
		
		Conta conta_diogo = new Conta(1, 2000.0f, 10000.0f, diogo);
		Conta conta_julia = new Conta(2, 20.0f, 100.0f, julia);
		
		System.out.println("Saldo do Diogo: " + conta_diogo.saldo);
		System.out.println("Saldo da Júlia: " + conta_julia.saldo);
		
		System.out.println("SAQUE");
		
		conta_diogo.sacar(600);
		System.out.println("Saldo do Diogo (depois do saque): " + conta_diogo.saldo);
		
		conta_julia.sacar(300);
		System.out.println("Saldo da Júlia (depois do saque): " + conta_julia.saldo);
		
	}
}
