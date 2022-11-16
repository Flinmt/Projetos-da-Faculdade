package br.com.cemeterio;

public class Corpo {
	private int idCorpo;
	private String nome, situacao;
	
	public Corpo(int idCorpo, String nome) {
		super();
		this.idCorpo = idCorpo;
		this.nome = nome;
		this.situacao = "Aguardando Sepultamento";
	}

	public int getIdCorpo() {
		return idCorpo;
	}

	public String getNome() {
		return nome;
	}

	public String getSituacao() {
		return situacao;
	}
	
	public void sepultar() {
		situacao = "Sepultado";
	}
	
	public void exumar() {
		situacao = "Exumado";
	}
}
