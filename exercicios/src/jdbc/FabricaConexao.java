// Original author: Leonardo Moura Leitão & Cod3r Cursos
// (C) 2019, 2021 by Cod3r Cursos. All Rights Reserved

package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
	
	public static Connection getConexao() {
		
		// Tenta se conectar com o banco de dados
		try {
			
			// Acessa o banco de dados MySQL na porta 3306
			final String url = "jdbc:mysql://localhost:3306/curso_java?verifyServerCertificate=false&useSSL=true";
			// Usuário
			final String usuario = "erik";
			// Senha - Necessária para estabelecer a conexão
			final String senha = "";
			
			return DriverManager.getConnection(url, usuario, senha);
		
			// Lança exceção caso não consiga estabelecer a 
			// conexão com o banco de dados
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
