// Original author: Leonardo Moura Leitão & Cod3r Cursos
// (C) 2019, 2021 by Cod3r Cursos. All Rights Reserved

package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

// Classe que contém métodos necessários para excluir um registro
// de uma pessoa no sistema gerenciador de banco de dados
public class ExcluirPessoa {
	
	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		
		// Obtém do usuário o código do registro
		// a ser excluído
		System.out.println("Informe o código: ");
		int codigo = entrada.nextInt();
		
		// Cria conexão com o banco de dados
		Connection conexao = FabricaConexao.getConexao();
		
		// Declaração SQL para excluir um registro específico
		// da tabela "pessoas"
		String sql = "DELETE FROM pessoas WHERE codigo = ?";
		
		// Executa a declaração SQL para realizar a exclusão
		// do registro
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, codigo);
		
		int contador = stmt.executeUpdate();
		
		// Exibe mensagem de erro apenas se houver algum
		// problema durante a exclusão do registro solicitado
		if (contador > 0) {
			System.out.println("Pessoa excluída com sucesso!");
		} else {
			System.out.println("Nada feito");
		}
		
		// Fecha a conexão com o banco de dados
		conexao.close();
		entrada.close();
	}
}
