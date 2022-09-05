package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Conexão.Conexão;
import modelo.Destino;

public class DestinoDAO {
	

		Connection conn = null;
		PreparedStatement pstm = null;

		public void save(Destino destinos) {

			// os ? são os parâmetros que nós vamos adicionar na base de dados

			String sql = "INSERT INTO destinos (cidade, estado, pais)" + " VALUES(?,?,?)";

			try {
				// Cria uma conexão com o banco
	conn = Conexão.createConnectionToMySQL();

				// Cria um PreparedStatment, classe usada para executar a query
				pstm = conn.prepareStatement(sql);

				// Adiciona o valor do primeiro parâmetro da sql
				pstm.setString(1, destinos.getCidade_destino());
				// Adicionar o valor do segundo parâmetro da sql
				pstm.setString(2, destinos.getEstado_destino());
				// Adiciona o valor do terceiro parâmetro da sql
				pstm.setString(3, destinos.getPais_destino());

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

		public void removeById(int id) {

			String sql = "DELETE FROM usuario WHERE id = ?";

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

		public void update(Destino destinos) {

			String sql = "UPDATE usuario SET nome = ?, email = ?, senha = ?" + " WHERE id = ?";

			try {
				// Cria uma conexão com o banco
	conn = Conexão.createConnectionToMySQL();

				// Cria um PreparedStatment, classe usada para executar a query
				pstm = conn.prepareStatement(sql);

				// Adiciona o valor do primeiro parâmetro da sql
				pstm.setString(1, destinos.getCidade_destino());
				// Adicionar o valor do segundo parâmetro da sql
				pstm.setString(2, destinos.getEstado_destino());
				// Adiciona o valor do terceiro parâmetro da sql
				pstm.setString(3, destinos.getPais_destino());


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

		public List <Destino> getDestino() {
			String sql = "SELECT * FROM destino WHERE id = ?";

			Destino destino = new Destino();

			ResultSet rset = null;

			try {
				conn = Conexão.createConnectionToMySQL();

				pstm = conn.prepareStatement(sql);

				pstm.setInt(0, 0);

				rset = pstm.executeQuery();

				rset.next();

				destino.setId(rset.getInt("id"));

				destino.setCidade_destino(rset.getString("cidade_destino"));
				
				destino.setEstado_destino(rset.getString("estado_destino"));
				
				destino.setPais_destino(rset.getString("pais_destino"));

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

			return (List<Destino>) destino;
		}

	}