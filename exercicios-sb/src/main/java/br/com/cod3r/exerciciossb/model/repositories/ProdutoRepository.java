// (C) 2019, 2021 by Leonardo Moura Leit�o and Cod3r Cursos
// All rights reserved

package br.com.cod3r.exerciciossb.model.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import br.com.cod3r.exerciciossb.model.entities.Produto;

// Interface de repositório de produto
public interface ProdutoRepository 
	extends PagingAndSortingRepository<Produto, Integer>{
	
	public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);
	
	// Outras consultas
	
	/* findByNomeContaining
	 * findByNomeIsContaining
	 * findByNomeContains
	 * 
	 * findByNomeStartsWith
	 * findByNomeEndsWith
	 * 
	 * findByNomeNotContaining
	 */
	
	@Query("SELECT p FROM  Produto p WHERE p.nome LIKE %:nome%")
	public Iterable<Produto> searchByNameLike(@Param("nome") String nome);

}
