// Original author: Leonardo Moura Leitão & Cod3r Cursos
// (C) 2019, 2021 by Cod3r Cursos. All Rights Reserved

package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioConsultarRegistros {
	
public static void main(String[] args) throws SQLException {
	
		Scanner entrada = new Scanner(System.in);
		
		// Cria conexão com o banco de dados
		Connection conexao = FabricaConexao.getConexao();
		// String que contém o comando SQL para realizar a consulta
		// no banco de dados
		String sql = "SELECT * FROM pessoas WHERE nome = ?";
		
		System.out.print("Informe o valor pra pesquisa: ");
		String valor = entrada.nextLine();
		
		// Cria declaração e executa a requisição SQL
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, "%" + valor + "%");
		ResultSet resultado = stmt.executeQuery(sql);
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		// Captura código da pessoa e seu nome se existir
		// no banco de dados
		// Caso não exista, ignora
		while (resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));
		}
		
		// Exibe código e nome de cada pessoa no banco de dados
		// que for encontrada durante a consulta
		for (Pessoa p: pessoas) {
			System.out.println(p.getCodigo() + " ==> " + p.getNome());
		}
		
		// Fecha a conexão com o banco de dados
		stmt.close();
		conexao.close();
		entrada.close();
	}
}
