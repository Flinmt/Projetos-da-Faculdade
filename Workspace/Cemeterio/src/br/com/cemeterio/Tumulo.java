package br.com.cemeterio;

public class Tumulo {
	private int idTumulo;
	private String localizacao;
	private boolean ocupado;
	
	public Tumulo(int idTumulo, String localizacao) {
		super();
		this.idTumulo = idTumulo;
		this.localizacao = localizacao;
		this.ocupado = false;
	}

	public int getIdTumulo() {
		return idTumulo;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public boolean isOcupado() {
		return ocupado;
	}
	
	public void ocupado() {
		ocupado = true;
	}
	
	public void desocupado() {
		ocupado = false;
	}
}
