package controler;

import modelo.Destino;

import java.util.Scanner;

import DAO.DestinoDAO;

public static void main (String[] args) {
	
	DestinoDAO destinoDAO = new DestinoDAO();
	
	Scanner entrada = new Scanner(System.in);
	int posição = 0;
	int opcao = 0;
	String cidade = "";
	String estado = "";
	String país = "";
	
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
			System.out.println("Digite a cidade: ");
			cidade = entrada.next();

			System.out.println("Digite o estado: ");
			estado = entrada.next();
			
			System.out.println("Digite o estado: ");
			país = entrada.next();

			Destino destino1 = new Destino();

			destinoDAO.save(destino1);
			break;
		}
		case 2: {
			System.out.println("Digite o id para deletar: ");
			try {
				posição = entrada.nextInt();
				
				DestinoDAO.removeById(posição);
				
			} catch (Exception e) {
				// e.getMessage();
				 
				System.out.println(" Nenhum contato para excluir ");
			}

			break;
		}
		case 3: {

			System.out.println("Digite o id do destino para atualizar: ");
			posição = entrada.nextInt();

			System.out.println("Digite a cidade: ");
			cidade = entrada.next();

			System.out.println("Digite o estado: ");
			estado = entrada.next();
			
			System.out.println("Digite o estado: ");
			país = entrada.next();

			destino.setId(posição);

			destinoDAO.update(destino);
		}
		case 4: {
			for (Destino d : destinoDAO.getDestino()) {

				System.out.println("CIDADE: " + d.getCidade_destino());
				System.out.println("ESTADO: " + d.getEstado_destino());
				System.out.println("PAÍS: " + d.getPais_destino());

			}
			break;
		}
		case 5: {

			System.out.print("Digite o ID: ");
			int id = entrada.nextInt();
			
			Destino d = new Destino();

			d = destinoDAO.getDestinoById(id);

			System.out.println("CIDADE: " + d.getCidade_destino());
			System.out.println("ESTADO: " + d.getEstado_destino());
			System.out.println("PAÍS: " + d.getPaís_destino());

			
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

	 while (opcao != 6);

	entrada.close();

	}
}

	



