package br.com.livros;

public class AppLivro {

	public static void main(String[] args) {
		Editora editora[] = new Editora[2];
		editora[0] = new Editora(01, "AB", "8198830-6184", "Recife", "PE");
		editora[1] = new Editora(02, "BC", "8198535-6184", "Recife", "PE");
		
		Genero genero[] = new Genero[3];
		genero[0] = new Genero(01, "Terror");
		genero[1] = new Genero(02, "Suspence");
		genero[2] = new Genero(03, "Aventura");
		
		Livro livro[] = new Livro[5];
		livro[0] = new Livro(01, 89, "Morte da Bezerra", "94851321468", editora[0], genero[1]);
		livro[1] = new Livro(02, 102, "Morte da Bezerra - O Retorno", "94851321468", editora[0], genero[1]);
		livro[2] = new Livro(03, 45, "Ressurreição da Bezerra", "94851321468", editora[0], genero[0]);
		livro[3] = new Livro(04, 280, "O Avô da Bezerra", "94851321468", editora[1], genero[2]);
		livro[4] = new Livro(05, 640, "A Calsinha do avô da Bezerra", "94851321468", editora[1], genero[1]);
		
		for (int i = 0; i<livro.length; i++) {
			System.out.println(livro[i].getTitulo() + ", " + livro[i].getGenero().getNomeGenero() + ", " + livro[i].getEditora().getRazaoSocial() 
					+ ", " + livro[i].getEditora().getCidade());
		}
	}

}
