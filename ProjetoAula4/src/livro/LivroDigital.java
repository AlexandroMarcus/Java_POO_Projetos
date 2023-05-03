package livro;

public class LivroDigital extends Livro{
	public String autor;
	public float precoVenda;
	public float precoProducao;
	public String titulo;
	public int paginas;
	public String linkDownload;
	public int tamanhoMB;

	//Cálculo do lucro
	public float lucro() {
		return (precoVenda - precoProducao);
	}
	//Tamanho do arquivo por páginas
	public float tamanhoDePaginas() {
		return ((float) tamanhoMB / (float)paginas);
	}
	//Titulo do livro
	public void Titulo() {
		System.out.println("Titulo: " + titulo);
	}
	//Cálculo do imposto 20% sobre o lucro + 2
	public float imposto() {
		return (0.2f*this.lucro()+2);
	}
}
