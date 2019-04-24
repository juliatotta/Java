package br.com.geekuniversity.secao11;

public class Conta {
	int numero;
	float saldo;
	float limite;
	Cliente cliente;
	
	public Conta(int numero, float saldo, float limite, Cliente cliente) {
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		this.cliente = cliente;
	}
	
	void sacar(float valor) {
		if(valor <= this.saldo) {
		this.saldo = this.saldo - valor;
		}else {
			System.out.println("Valor insuficiente!");
		}
	}
	
	void depositar(float valor) {
		this.saldo = this.saldo + valor;
	}
}
