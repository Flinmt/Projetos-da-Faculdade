package br.com.Revista;
import java.util.Date;
public class AppRevista {

	public static void main(String[] args) {
		Date data = new Date();
		
		Revista revista = new Revista(01, "Maiorais");
		revista.adicionarEdicao(01, data, 150, 50, revista);
		revista.adicionarEdicao(02, data, 240, 60, revista);
		revista.adicionarEdicao(03, data, 450, 150, revista);
		
		for (int i=0; i < revista.getEdicao().size(); i++) {
			System.out.println(revista.getEdicao().get(i).getNumero());
			System.out.println(revista.getEdicao().get(i).getData());
			System.out.println(revista.getEdicao().get(i).getTiragem());
			System.out.println(revista.getEdicao().get(i).getQtdeVendida());
			System.out.println("______________________________________________");
		}
		
		for (int i=0; i < 2; i++) {
			if (revista.getEdicao().get(1).reciclarExemplares() == false) {
				System.out.println("Revista já reciclada.");
			} else {
				revista.getEdicao().get(1).reciclarExemplares();
			}	
		}
	}
}
