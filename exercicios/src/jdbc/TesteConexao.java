// Original author: Leonardo Moura Leitão & Cod3r Cursos
// (C) 2019, 2021 by Cod3r Cursos. All Rights Reserved

package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Classe para testar conexão do código Java com
// um sistema gerenciador de banco de dados
public class TesteConexao {
	
	// Tenta estabelecer uma conexão com o banco de dados
	// Se não conseguir, lança uma exceção
	public static void main(String[] args) throws SQLException {
		
		// Acessa o banco de dados MySQL na porta 3306
		final String url = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true";
		// Usuário
		final String usuario = "erik";
		// Senha - Necessária para estabelecer a conexão
		final String senha = "";
		
		Connection conexao = DriverManager
				.getConnection(url, usuario, senha);
		
		// Imprime mensagem caso a conexão tenha sido bem sucedida
		System.out.println("Conexão efetuada com sucesso!");
		// Fecha a conexão com o banco
		conexao.close();
	}
}
