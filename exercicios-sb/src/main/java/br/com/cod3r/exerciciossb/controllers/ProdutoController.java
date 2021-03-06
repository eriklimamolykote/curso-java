// (C) 2019, 2021 by Leonardo Moura Leit�o and Cod3r Cursos
// All rights reserved

package br.com.cod3r.exerciciossb.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.exerciciossb.model.entities.Produto;
import br.com.cod3r.exerciciossb.model.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;

	// Cria um novo produto
	// @PostMapping
	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
	public @ResponseBody Produto salvarProduto(@Valid Produto produto) {
		produtoRepository.save(produto);
		return produto;
	}
	
	
	// Consulta lista de produtos cadastrados
	@GetMapping
	public Iterable<Produto> obterProdutos() {
		return produtoRepository.findAll();
	}
	
	// Consulta produto por nome
		@GetMapping(path = "/nome/{parteNome}")
		public Iterable<Produto> obterProdutosPorNome(@PathVariable String parteNome) {
			// return produtoRepository.findByNomeContainingIgnoreCase(parteNome);
			return produtoRepository.searchByNameLike(parteNome);
		}
	
	// Consulta paginada
	@GetMapping(path = "/pagina/{numeroPagina}/{qtdePagina}")
	public Iterable<Produto> obterProdutosPorPagina(
			@PathVariable int numeroPagina, @PathVariable int qtdePagina) {
		if (qtdePagina >= 5) 
			qtdePagina = 5;
		Pageable page = PageRequest.of(numeroPagina, qtdePagina);
		return produtoRepository.findAll();
	}
	
	// Consulta produto pelo ID
	@GetMapping(path = "/{id}")
	public Optional<Produto> obterProdutoPorId(@PathVariable int id) {
		return produtoRepository.findById(id);
	}
	
	// Altera todas as informações de um produto
	/* @PutMapping
	public Produto alterarProduto(@Valid Produto produto) {
		produtoRepository.save(produto);
		return produto;
	} */
	
	// Exclui produto pelo seu ID
	@DeleteMapping(path = "/{id}")
	public void excluirProduto(@PathVariable int id) {
		produtoRepository.deleteById(id);
	}
}
