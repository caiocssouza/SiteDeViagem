package crud;

import modelo.Passagem;
import DAO.PassagemDAO;

import java.util.Date;
import java.util.Scanner;

public class PassagemCRUD {
	
	public static void main(String[] args) {
		
		PassagemDAO passagemDAO = new PassagemDAO();
		
		Scanner entrada = new Scanner(System.in);
		
		String preço = "";
		Date data_passagem;
		int posição = 0;
		int opcao = 0;
		
		do {
			System.out.println("=AGENDA CRUD=");
			System.out.println("[1] - CADASTRAR");
			System.out.println("[2] - EXCLUIR");
			System.out.println("[3] - ATUALIZAR");
			System.out.println("[4] - MOSTRAR");
			System.out.println("[5] - SAIR");
			opcao = entrada.nextInt();

			switch (opcao) {
			case 1: {
				System.out.println("Digite o preço: ");
				preço = entrada.next();

				System.out.println("Escolha a data da passagem: ");
				data_passagem = entrada.next();

				Passagem passagem = new Passagem();

				PassagemDAO.save(passagem);
				break;
			}
			case 2: {
				System.out.println("Digite o id para deletar: ");
				try {
					posição = entrada.nextInt();
					
					PassagemDAO.removeById(posição);
					
				} catch (Exception e) {
					// e.getMessage();
					 
					System.out.println(" Nenhum contato para excluir ");
				}

				break;
			}
			case 3: {

				System.out.println("Digite o id do Passagem para atualizar: ");
				posição = entrada.nextInt();

				System.out.println("Digite a cidade: ");
				preço = entrada.next();

				System.out.println("Digite o estado: ");
				data_passagem = entrada.nextDate();
				

				Passagem.setId(posição);

				PassagemDAO.update(Passagem);
			}
			case 4: {
				for (Passagem p : PassagemDAO.getPassagem()) {

					System.out.println("PREÇO: " + p.getPreço_passagem());
					System.out.println("DATA: " + p.getData_passagem());

				}
				break;
			}
			case 5: {

				System.out.print("Digite o ID: ");
				int id = entrada.nextInt();
				
				Passagem p = new Passagem();

				p = PassagemDAO.getPassagemById(id);

				System.out.println("PREÇO: " + p.getPreço_passagem());
				System.out.println("DATA: " + p.getData_passagem());

				
			}
				break;

			case 6: {
				System.out.println(" === Obrigado por usar nossa Agenda === ");
				break;
			}
			default:
				System.out.println("Opcao invalida: ");

			}
			;
		}
		
		while(opcao != 6);
	}

}
