package br.com.cemeterio;
import java.util.Scanner;

public class AppCemeterio {
	static Scanner scan = new Scanner (System.in);
	static Corpo corpo;
	static Tumulo tumulo;
	static Sepultamento sepultamento;
	static Exumacao exumacao;
	
	public static void main(String[] args) {
		int funcao;
		
		do {
            System.out.println("Olá! qual função que gostaria de acessar?");
            System.out.println("[0] Para finalizar o programa.");
            System.out.println("[1] Para cadastrar novo Corpo.");
            System.out.println("[2] Para cadastrar novo Tumulo.");
            System.out.println("[3] cadastrar e realizar Sepultamento.");
            System.out.println("[4] cadastrar e realizar Exumação.");
            System.out.println("[5] Mostrar Dados");
            System.out.print("Digite a função que deseja: ");
            funcao = scan.nextInt();
            System.out.println("_______________________________________");

            switch (funcao) {
                case 0:
                    System.out.println("Programa Finalizado!");
                    break;
                case 1:
                    cadastrarCorpo();
                    break;
                case 2:
                	cadastrarTumulo();
                    break;
                case 3:
                	cadastrarSepultamento();
                    break;
                case 4:
                	cadastrarExumacao();
                    break;
                case 5:
                	mostrarDados();
                	break;
            }
            
        }while(funcao != 0);
	}
	
	public static void cadastrarCorpo(){
		 System.out.println("_______________________________________");
		 System.out.println("Digite as informações pedidas:");
	     System.out.print("ID do Corpo: ");
	     int id = scan.nextInt();
	     System.out.print("Nome: ");
	     String nome = scan.next();
	     System.out.println("_______________________________________");
	        
	     corpo = new Corpo(id, nome);
	    }
	public static void cadastrarTumulo(){
		 System.out.println("_______________________________________");
		 System.out.println("Digite as informações pedidas:");
	     System.out.print("ID do Tumulo: ");
	     int id = scan.nextInt();
	     System.out.print("Localização: ");
	     String localizacao = scan.next();
	     System.out.println("_______________________________________");
	        
	     tumulo = new Tumulo(id, localizacao);
	    }
	public static void cadastrarSepultamento(){
		if (corpo == null || tumulo == null) {
			System.out.println("Não existe corpo ou tumulo.");
			return;
		} else if(corpo.getSituacao() == "Exumado") {
			System.out.println("Corpo ja foi Exumado.");
			return;
		}
		 System.out.println("_______________________________________");
		 System.out.println("Digite as informações pedidas:");
	     System.out.print("ID do Sepultamento: ");
	     int id = scan.nextInt();
	     System.out.print("Data: ");
	     String data = scan.next();
	     System.out.println("_______________________________________");
	        
	     sepultamento = new Sepultamento(id, data, corpo, tumulo);
	     sepultamento.sepultar();
	    }
	public static void cadastrarExumacao(){
		if (sepultamento == null) {
			System.out.println("Não foi feito Sepultamento.");
			return;
		}
		 System.out.println("_______________________________________");
		 System.out.println("Digite as informações pedidas:");
	     System.out.print("ID da Exumação: ");
	     int id = scan.nextInt();
	     System.out.print("Data: ");
	     String data = scan.next();
	     System.out.println("_______________________________________");
	        
	     exumacao = new Exumacao(id, data, sepultamento);
	     exumacao.exumar();
	    }
	public static void mostrarDados() {
		if (corpo == null || tumulo == null) {
			System.out.println("Não existe corpo ou tumulo. Por favor, realize o cadastro de ambos.");
			return;
		}
		System.out.println("CORPO: ");
		System.out.println(corpo.getIdCorpo());
		System.out.println(corpo.getNome());
		System.out.println(corpo.getSituacao());
		System.out.println("========================================");
		
		System.out.println("TUMULO: ");
		System.out.println(tumulo.getIdTumulo());
		System.out.println(tumulo.getLocalizacao());
		if (tumulo.isOcupado()) {
			System.out.println("Tumulo Ocupado.");
		} else {
			System.out.println("Tumulo Desocupado.");
		}
		System.out.println("========================================");
		
		if (sepultamento == null) {
			System.out.println("Corpo ainda não foi sepultado.");
			return;
		}
		
		System.out.println("SEPULTAMENTO: ");
		System.out.println(sepultamento.getIdSepultamento());
		System.out.println(sepultamento.getData());
		System.out.println("========================================");
		
		if (exumacao == null) {
			System.out.println("Corpo ainda não foi exumado.");
			return;
		}
		
		System.out.println("EXUMAÇÃO: ");
		System.out.println(exumacao.getIdExumacao());
		System.out.println(exumacao.getData() + "/n");
	}
}
