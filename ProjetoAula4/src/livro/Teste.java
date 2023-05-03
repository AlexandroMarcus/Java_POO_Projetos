package livro;

public class Teste {
	public static void main(String[]args) {
		Livro livro1 = new Livro();
		livro1.autor = "Ignacio Loyola";
		livro1.precoProducao = 9.5f;
		livro1.precoVenda = 19.99f;
		livro1.titulo = "O homem que odiava segunda-feira";
		livro1.paginas = 200;
		
		//Impressão na tela dos atributos
		System.out.println("Autor: " + livro1.autor + "Preco de producao: " + livro1.precoProducao + "Preco de Venda: " + 
		livro1.precoVenda + "Titulo do Livro: " + livro1.titulo + "Paginas: " + livro1.paginas);
		
		//Impressao do Lucro e Imposto
		System.out.println("O livro: " + livro1.titulo + "Lucro por venda R$: " + livro1.lucro() + "e paga em imposto: " + 
		livro1.imposto());
		
		//Criacao do livro digital e atributos
		LivroDigital livro2 = new LivroDigital();
		livro2.autor = "Pierre Bayard";
		livro2.precoProducao = 15.0f;
		livro2.precoVenda = 34.99f;
		livro2.titulo = "Como falar dos livros que nao lemos";
		livro2.paginas = 200;
		livro2.linkDownload = "google Livros";
		livro2.tamanhoMB = 4;
		
		//Impressão na tela dos atributos
		System.out.println("Autor: " + livro2.autor + "Preco de producao: " + livro2.precoProducao + livro2.precoVenda
		+ "Titulo: " + livro2.titulo + "Paginas: " + livro2.paginas + "Link do livro: " + livro2.linkDownload + "Tamanho em MB: " + 
		livro2.tamanhoMB);
		
		//Impressao do Lucro e Imposto
		System.out.println("O Livro: " + livro2.titulo + "O lucro por venda R$: " + livro2.lucro() + "e paga em imposto: " + 
		livro2.imposto());
		
		
		
		
	}
}
