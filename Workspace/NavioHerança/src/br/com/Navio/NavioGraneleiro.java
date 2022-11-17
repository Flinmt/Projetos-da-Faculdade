package br.com.Navio;

public class NavioGraneleiro extends Navio {
	private int quantidadeEscotilhas;

	public NavioGraneleiro(int id, int quantidadePoroes, String nome, double capacidadeCarga,int quantidadeEscotilhas) {
		super(id, quantidadePoroes, nome, capacidadeCarga);
		this.quantidadeEscotilhas = quantidadeEscotilhas;
	}

	
	public int getQuantidadeEscotilhas() {
		return quantidadeEscotilhas;
	}

	public void setQuantidadeEscotilhas(int quantidadeEscotilhas) {
		this.quantidadeEscotilhas = quantidadeEscotilhas;
	}
	
	
}
