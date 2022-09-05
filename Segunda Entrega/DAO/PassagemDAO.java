package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import Conexão.Conexão;
import modelo.Passagem;

public class PassagemDAO {

	Connection conn = null;
	PreparedStatement pstm = null;

	public void save(Passagem passagem) {


		String sql = "INSERT INTO passagem (data, preço, id)" + " VALUES(?,?,?)";

		try {
			
			conn = Conexão.createConnectionToMySQL();

			pstm = conn.prepareStatement(sql);

			pstm.setDate(1, new Date(passagem.getData().getTime()));
			
			pstm.setString(2, passagem.getPreço_passagem());
			
			pstm.setInt(3, passagem.getId());

			pstm.execute();

		} catch (Exception e) {

			e.printStackTrace();
		} finally {


			try {
				if (pstm != null) {

					pstm.close();
				}

				if (conn != null) {
					conn.close();
				}

			} catch (Exception e) {

				e.printStackTrace();
			}
		}
	}

	public void removeById(int id) {

		String sql = "DELETE FROM passagem WHERE id = ?";

		try {
			conn = Conexão.createConnectionToMySQL();

			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, id);

			pstm.execute();

		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			try {
				if (pstm != null) {

					pstm.close();
				}

				if (conn != null) {
					conn.close();
				}

			} catch (Exception e) {

				e.printStackTrace();
			}
		}
	}

	public void update(Passagem passagem) {

		String sql = "UPDATE passagem SET data = ?, preço = ?" + " WHERE id = ?";

		try {
			// Cria uma conexão com o banco
			conn = Conexão.createConnectionToMySQL();

			// Cria um PreparedStatment, classe usada para executar a query
			pstm = conn.prepareStatement(sql);

			// Adiciona o valor do primeiro parâmetro da sql
			pstm.setDate(1, (Date) passagem.getData());
			// Adicionar o valor do segundo parâmetro da sql
			pstm.setNString(2, passagem.getPreço_passagem());
			
			// Executa a sql para inserção dos dados
			pstm.execute();

		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			// Fecha as conexões

			try {
				if (pstm != null) {

					pstm.close();
				}

				if (conn != null) {
					conn.close();
				}

			} catch (Exception e) {

				e.printStackTrace();
			}
		}
	}

	public Passagem getPassagem(int id) {

		String sql = "SELECT * FROM Passagem where id = ?";
		
		Passagem passagem = new Passagem();
		
		ResultSet rset = null;

		try {
			conn = Conexão.createConnectionToMySQL();

			pstm = conn.prepareStatement(sql);

			rset = pstm.executeQuery();

			while (rset.next()) {

				passagem.setId(rset.getInt("id"));
				
				passagem.setData(rset.getDate("data_passagem"));
				
				passagem.setPreço_passagem(rset.getString("preço_passagem"));
				
			}
		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			try {

				if (rset != null) {

					rset.close();
				}

				if (pstm != null) {

					pstm.close();
				}

				if (conn != null) {
					conn.close();
				}

			} catch (Exception e) {

				e.printStackTrace();
			}
		}

		return passagem;
	}

}
