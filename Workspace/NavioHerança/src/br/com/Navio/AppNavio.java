package br.com.Navio;
import java.util.ArrayList;
import java.util.List;

public class AppNavio {

	public static void main(String[] args) {
		List<NavioContainer> navioContainer;
		navioContainer = new ArrayList<NavioContainer>();
		
		List<NavioGraneleiro> navioGraneleiro;
		navioGraneleiro = new ArrayList<NavioGraneleiro>();
		//__________________________________________________
		
		navioContainer.add(new NavioContainer(33, 2, "Bela Fera", 100000, 2, 30));
		navioContainer.add(new NavioContainer(48, 2, "Arrecifes", 120000, 2, 30));
		navioContainer.add(new NavioContainer(52, 1, "Aguas Belas", 90000, 0, 25));
		
		navioGraneleiro.add(new NavioGraneleiro(10, 4, "Estrela do Mar", 50000, 4));
		navioGraneleiro.add(new NavioGraneleiro(25, 3, "Cruzeiro do Sul", 80000, 6));
		//___________________________________________________________________________
		
		System.out.println("Navios Conteiners: ");
		System.out.println("_____________________________");
		for (NavioContainer navioC : navioContainer) {
			System.out.println("ID: " + navioC.getId());
		    System.out.println("Nome: " + navioC.getNome());
		    System.out.println("_____________________________");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Navios Graneleiros: ");
		System.out.println("_____________________________");
		for (NavioGraneleiro navioG : navioGraneleiro) {
			System.out.println("ID: " + navioG.getId());
		    System.out.println("Nome: " + navioG.getNome());
		    System.out.println("_____________________________");
		}
	}

}
