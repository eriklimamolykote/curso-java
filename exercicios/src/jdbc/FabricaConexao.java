// Original author: Leonardo Moura Leitão & Cod3r Cursos
// (C) 2019, 2021 by Cod3r Cursos. All Rights Reserved

package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao {
	
	public static Connection getConexao() {
		
		// Tenta se conectar com o banco de dados
		try {
			
			Properties prop = getProperties();
			
			// Acessa o banco de dados MySQL na porta 3306
			final String url = prop.getProperty("banco.url");
			// Usuário
			final String usuario = prop.getProperty("banco.usuario");
			// Senha - Necessária para estabelecer a conexão
			final String senha = prop.getProperty("banco.senha");
			
			return DriverManager.getConnection(url, usuario, senha);
		
			// Lança exceção caso não consiga estabelecer a 
			// conexão com o banco de dados
		} catch (SQLException | IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	// Método que obtém propriedades necessárias para estabelecer uma
	// conexão com o sistema gerenciador de banco de dados
	private static Properties getProperties() throws IOException {
		
		// Cria uma nova instância para carregar as propriedades
		Properties prop = new Properties();
		String caminho = "/conexao.properties";
		prop.load(FabricaConexao.class.getResourceAsStream(caminho));
		return prop;
	}
}
