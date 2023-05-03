package livro;

public class Livro {
	public String autor;
	public float precoProducao;
	public float precoVenda;
	public String titulo;
	public float paginas;
	
	public Livro() {
		
	}
	
	/*public Livro(String autor, float precoProducao, float precoVenda, String titulo, float paginas) {
		this.autor = autor;
		this.precoProducao = precoProducao;
		this.precoVenda = precoVenda;
		this.titulo = titulo;
		this.paginas = paginas; 
	} 
	*/
	//Cálculo do lucro
	public float lucro() {
		return (precoVenda - precoProducao);
	}
	//Cálculo imposto 20% sobre o lucro
	public float imposto() {
		return (0.2f*this.lucro());
	}
	//Titulo do livro
	public void titulo() {
		System.out.println("Titulo: " + titulo);
	}
}
