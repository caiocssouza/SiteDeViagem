package modelo;

import DAO.DestinoDAO;

public class Principal {

	public static void main(String[] args) {
		
		DestinoDAO destinoDAO = new DestinoDAO();
		
		Destino destino1 = new Destino();
		destino1.setCidade_destino("São Paulo");
		destino1.setEstado_destino("SP");
		destino1.setPais_destino("Brasil");
		
		destinoDAO.save(destino1);
		
		for (Destino d : destinoDAO.getDestinos()) {

			System.out.println("Cidade: " + d.getCidade_destino());
			System.out.println("Estado: " + d.getEstado_destino());
			System.out.println("País: " + d.getPais_destino());

			
		}

	}

}
