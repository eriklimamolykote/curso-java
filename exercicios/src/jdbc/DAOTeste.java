// Original author: Leonardo Moura Leitão & Cod3r Cursos
// (C) 2019, 2021 by Cod3r Cursos. All Rights Reserved

package jdbc;

public class DAOTeste {
	
	public static void main(String[] args) {
		
		// Cria nova instância para se conectar com um banco de dados
		DAO dao = new DAO();
		
		// Insere novos registros dentro da tabela "pessoas"
		String sql = "INSERT INTO pessoas (nome, codigo) VALUES (?, ?)";
		System.out.println(dao.incluir(sql,  "João da Silva", 1000));
		System.out.println(dao.incluir(sql,  "Ana Julia", 1001));
		System.out.println(dao.incluir(sql,  "Djalma Pereira", 1002));
		
		// Fecha conexão com o banco de dados
		dao.close();
	}

}
