package br.com.livros;

public class Editora {
	private int idEditora;
	private String razaoSocial, contato, cidade, uF;
	
	public Editora(int idEditora, String razaoSocial, String contato, String cidade, String uF) {
		super();
		this.idEditora = idEditora;
		this.razaoSocial = razaoSocial;
		this.contato = contato;
		this.cidade = cidade;
		this.uF = uF;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getuF() {
		return uF;
	}

	public void setuF(String uF) {
		this.uF = uF;
	}

	public int getIdEditora() {
		return idEditora;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}
}
