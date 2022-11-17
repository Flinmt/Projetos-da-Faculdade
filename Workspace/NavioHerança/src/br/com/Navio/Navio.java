package br.com.Navio;

public abstract class Navio {
	private int id, quantidadePoroes;
	private String nome, disponibilidade;
	private double capacidadeCarga;
	
	public Navio(int id, int quantidadePoroes, String nome, double capacidadeCarga) {
		super();
		this.id = id;
		this.quantidadePoroes = quantidadePoroes;
		this.nome = nome;
		this.disponibilidade = "Vazio";
		this.capacidadeCarga = capacidadeCarga;
	}

	public int getQuantidadePoroes() {
		return quantidadePoroes;
	}
	public void setQuantidadePoroes(int qauntidadePoroes) {
		this.quantidadePoroes = qauntidadePoroes;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getCapacidadeCarga() {
		return capacidadeCarga;
	}
	public void setCapacidadeCarga(double capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}
	public int getId() {
		return id;
	}
	public String getDisponibilidade() {
		return disponibilidade;
	}

	public void iniciarCarregamento() {
		disponibilidade = "Carregando";
	}
	public void bloquearCarregamento() {
		disponibilidade = "Lotado";
	}
	
}
