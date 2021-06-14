// Original author: Leonardo Moura Leitão & Cod3r Cursos
// (C) 2019, 2021 by Cod3r Cursos. All Rights Reserved

package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// Classe que cria um novo banco de dados a partir de
// um código em Java
public class CriarBanco {
	public static void main(String[] args) throws SQLException {
		
		// Acessa o banco de dados MySQL na porta 3306
		final String url = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true";
		// Usuário
		final String usuario = "erik";
		// Senha - Necessária para estabelecer a conexão
		final String senha = "";
		
		Connection conexao = DriverManager
				.getConnection(url, usuario, senha);
		
		// Cria e e executa um comando no sistema gerenciador de 
		// banco de dados
		Statement stmt = conexao.createStatement();
		stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");
		
		System.out.println("Banco criado com sucesso!");
		// Fecha a conexão com o banco de dados
		conexao.close();
	}
}
