package br.com.Revista;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Revista {
	private int codigo, reciclagemProduzida;
	private String titulo;
	private List<Edicao> edicao;
	
	public Revista(int codigo, String titulo) {
		super();
		this.codigo = codigo;
		this.reciclagemProduzida = 0;
		this.titulo = titulo;
		this.edicao = new ArrayList<Edicao>();
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getCodigo() {
		return codigo;
	}

	public int getReciclagemProduzida() {
		return reciclagemProduzida;
	}

	public List<Edicao> getEdicao() {
		return edicao;
	}

	public void adicionarEdicao(int nr, Date dt, int trg, int qv, Revista revista) {
		edicao.add(new Edicao (nr, trg, qv, dt, revista));
	}
	
	public void removerEdicao(Edicao edicao) {
		this.edicao.remove(edicao);
	}
	
	public void acumularReciclagem(int qntdeReciclada) {
		reciclagemProduzida += qntdeReciclada;
	}
}
