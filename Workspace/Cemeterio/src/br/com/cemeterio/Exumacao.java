package br.com.cemeterio;

public class Exumacao {
	private int idExumacao;
	private String data;
	private Sepultamento sepultamento;
	
	public Exumacao(int idExumacao, String data, Sepultamento sepultamento) {
		super();
		this.idExumacao = idExumacao;
		this.data = data;
		this.sepultamento = sepultamento;
	}
	
	public int getIdExumacao() {
		return idExumacao;
	}
	
	public String getData() {
		return data;
	}
	public Sepultamento getSepultamento() {
		return sepultamento;
	}
	
	public void exumar() {
		sepultamento.getCorpo().exumar();
		sepultamento.getTumulo().desocupado();	}
}
