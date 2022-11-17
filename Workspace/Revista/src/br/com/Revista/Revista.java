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

	public void adicionarEdicao(int nr, Date dt, int trg, int qv) {
		edicao.add(new Edicao (nr, trg, qv, dt));
	}
	
	public void removerEdicao(Edicao edicao) {
		this.edicao.remove(edicao);
	}
	
	public String reciclarEdicao(int nrEdicao) {
		for (Edicao edicao: edicao) {
			if (edicao.getNumero() == nrEdicao) {
				int reciclados = edicao.obterQtdeReciclaveis();
				if (reciclados == 0) {
					return "Nao houve exemplares para reciclar.";
				} else if (edicao.isReciclou()) {
					return "Edicao ja reciclada.";
				} else {
					reciclagemProduzida += reciclados;
					edicao.reciclarExemplares();
					return "Reciclagem Realizada.";
				}
			} 
		}
		
		return "Edicao nao Encontrada.";
	}
		
}
