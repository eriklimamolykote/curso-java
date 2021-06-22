// Original author: Leonardo Moura Leitão & Cod3r Cursos
// (C) 2019, 2021 by Cod3r Cursos. All Rights Reserved 

package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

// Classe para criação de novos produtos
public class NovoProduto {
	
	public static void main(String[] args) {
		
		// Cria um novo produto
		Produto produto = new Produto("Monitor 23", 789.98);
		
		DAO<Produto> dao = new DAO<>(Produto.class);
		dao.incluirAtomico(produto).fechar();
		
		System.out.println("Id do produto: " + produto.getId());
	}
}
