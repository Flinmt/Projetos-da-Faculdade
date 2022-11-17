package br.com.Revista;
import java.util.Date;

public class Edicao {
	private int numero, tiragem, qtdeVendida;
	private Date data;
	private boolean reciclou;

	public Edicao(int numero, int tiragem, int qtdeVendida, Date data) {
		this.numero = numero;
		this.tiragem = tiragem;
		this.qtdeVendida = qtdeVendida;
		this.data = data;
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
	
	public void reciclarExemplares() {
		reciclou = true;
	}
	public int obterQtdeReciclaveis() {
		return tiragem - qtdeVendida;
	}
	
	
}
