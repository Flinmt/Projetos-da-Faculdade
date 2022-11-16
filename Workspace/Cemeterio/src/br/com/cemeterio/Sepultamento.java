package br.com.cemeterio;

public class Sepultamento {
	private int idSepultamento;
	private String data;
	private Corpo corpo;
	private Tumulo tumulo;
	
	public Sepultamento(int idSepultamento, String data, Corpo corpo, Tumulo tumulo) {
		super();
		this.idSepultamento = idSepultamento;
		this.data = data;
		this.corpo = corpo;
		this.tumulo = tumulo;
	}
	
	public int getIdSepultamento() {
		return idSepultamento;
	}
	public String getData() {
		return data;
	}
	public Corpo getCorpo() {
		return corpo;
	}
	
	public Tumulo getTumulo() {
		return tumulo;
	}

	public void sepultar() {
		corpo.sepultar();
		tumulo.ocupado();
	}
}
