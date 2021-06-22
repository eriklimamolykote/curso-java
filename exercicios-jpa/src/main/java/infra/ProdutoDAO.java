// Original author: Leonardo Moura Leitão & Cod3r Cursos
// (C) 2019, 2021 by Cod3r Cursos. All Rights Reserved 

package infra;

import modelo.basico.Produto;

public class ProdutoDAO extends DAO<Produto> {
	
	public ProdutoDAO() {
		super(Produto.class);
	}
}
