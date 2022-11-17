package br.com.Navio;

public class NavioContainer extends Navio {
	private int quantidadeGuindaste, quantidadeCamadas;

	public NavioContainer(int id, int quantidadePoroes, String nome, double capacidadeCarga, int quantidadeGuindaste, int quantidadeCamadas) {
		super(id, quantidadePoroes, nome, capacidadeCarga);
		this.quantidadeGuindaste = quantidadeGuindaste;
		this.quantidadeCamadas = quantidadeCamadas;
	}

	public int getQuantidadeGuindaste() {
		return quantidadeGuindaste;
	}

	public void setQuantidadeGuindaste(int quantidadeGuindaste) {
		this.quantidadeGuindaste = quantidadeGuindaste;
	}

	public int getQuantidadeCamadas() {
		return quantidadeCamadas;
	}

	public void setQuantidadeCamadas(int quantidadeCamadas) {
		this.quantidadeCamadas = quantidadeCamadas;
	}
	
	
}
