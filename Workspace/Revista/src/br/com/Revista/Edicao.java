package br.com.Revista;
import java.util.Date;

public class Edicao {
	private int numero, tiragem, qtdeVendida;
	private Date data;
	private boolean reciclou;
	private Revista revista;

	public Edicao(int numero, int tiragem, int qtdeVendida, Date data, Revista revista) {
		this.numero = numero;
		this.tiragem = tiragem;
		this.qtdeVendida = qtdeVendida;
		this.data = data;
		this.revista = revista;
		reciclou = false;
	}

	public int getTiragem() {
		return tiragem;
	}
	public void setTiragem(int tiragem) {
		this.tiragem = tiragem;
	}
	public boolean isReciclou() {
		return reciclou;
	}
	public void setReciclou(boolean reciclou) {
		this.reciclou = reciclou;
	}
	public int getNumero() {
		return numero;
	}
	public int getQtdeVendida() {
		return qtdeVendida;
	}
	public Date getData() {
		return data;
	}
	
	public boolean reciclarExemplares() {
		if (reciclou == true) {
			return false;
		}
		
		int qtdeNaoVendida = tiragem - qtdeVendida;
		revista.acumularReciclagem(qtdeNaoVendida);
		reciclou = true;
		return true;
	}
	
}
