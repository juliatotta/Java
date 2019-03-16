//Objetos


public class Programa22 {

	public static void main(String[] args) {
		int numero = 4;

		//CLASSE PRODUTO
		//Declaração e instanciação/iniciação do objeto
		//p0 -> instância do objeto ou objeto
		Produto p0 = new Produto();
		p0.nome = "Caneta Bic";
		p0.preco = 2.45f ;
		p0.desconto = 5.0f;

		System.out.println("****** Produto 1 ******");
		System.out.println(p0.nome);
		System.out.println("R$" + p0.preco);
		System.out.println(p0.desconto + "%");


		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 2.367f;
		p1.desconto = 15.0f;

		System.out.println("****** Produto 2 ******");
		System.out.println(p1.nome);
		System.out.println("R$" + p1.preco);
		System.out.println(p1.desconto + "%");
		
		
		System.out.println("\n");


		//CLASSE PESSOA
		Pessoa pessoa1 = new Pessoa();
		pessoa1.nome = "Julia";
		pessoa1.email = "tottajulia@gmail.com";
		pessoa1.ano_nascimento = 1997;

		System.out.println("****** Pessoa ******");
		System.out.println("Nome: " + pessoa1.nome);
		System.out.println("E-mail: " + pessoa1.email);
		System.out.println("Ano de Nascimento: " + pessoa1.ano_nascimento);
	}

}
