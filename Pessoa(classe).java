//Classes
//Atributos
//Métodos

public class Pessoa {
	String nome, email;
	int ano_nascimento;
	
	//Cosntrutor vazio
	public Pessoa() {
		
	}
	
	//Construtor com parâmetro
	public Pessoa(String nome, String email, int ano_nascimento) {
		this.nome = nome;
		this.email = email;
		this.ano_nascimento = ano_nascimento;
		
	}
	
	void imprime_informacoes() {
		System.out.println("Nome: " + this.nome);
		System.out.println("E-mail: " + this.email);
		System.out.println("Ano de Nascimento: " + this.ano_nascimento);
	
		System.out.println("");
	}
}
