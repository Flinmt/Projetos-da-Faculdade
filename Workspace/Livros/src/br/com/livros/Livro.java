package br.com.livros;

public class Livro {
	private int idLivro, numeroPaginas;
	private String titulo, iSBN;
	private Editora editora;
	private Genero genero;
	
	public Livro(int idLivro, int numeroPaginas, String titulo, String iSBN, Editora editora, Genero genero) {
		super();
		this.idLivro = idLivro;
		this.numeroPaginas = numeroPaginas;
		this.titulo = titulo;
		this.iSBN = iSBN;
		this.editora = editora;
		this.genero = genero;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getIdLivro() {
		return idLivro;
	}

	public String getiSBN() {
		return iSBN;
	}

	public Editora getEditora() {
		return editora;
	}

	public Genero getGenero() {
		return genero;
	}
	
	
	
}
