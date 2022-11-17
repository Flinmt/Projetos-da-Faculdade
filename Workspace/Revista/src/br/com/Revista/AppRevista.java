package br.com.Revista;
import java.util.Date;
public class AppRevista {
	
	static Revista revista;
	public static void main(String[] args) {
		Date data = new Date();
		revista = new Revista(01, "Revistinha Show");
		
		revista.adicionarEdicao(52, data, 1000, 800);
		revista.adicionarEdicao(53, data, 900, 900);
		revista.adicionarEdicao(54, data, 1200, 1000);
		
		realizarReciclagem(53);
		realizarReciclagem(54);
		realizarReciclagem(54);
		realizarReciclagem(99);
	}
	
	 public static void realizarReciclagem(int nrEdicao) {
		System.out.println("Edicao Numero: " + nrEdicao);
		System.out.println();
		System.out.println(revista.reciclarEdicao(nrEdicao));
		
		for (Edicao edicao : revista.getEdicao()) {
			if (edicao.getNumero() == nrEdicao) {
				System.out.println("Reciclagem Produzida: " + revista.getReciclagemProduzida());
				System.out.println(edicao.isReciclou());
			}
		}
		System.out.println("_____________________________________________________");
	 }
}
