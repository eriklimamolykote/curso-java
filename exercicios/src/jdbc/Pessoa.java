// Original author: Leonardo Moura Leitão & Cod3r Cursos
// (C) 2019, 2021 by Cod3r Cursos. All Rights Reserved

package jdbc;

public class Pessoa {
	
	// Declaração de variáveis
	private int codigo;
	private String nome;
	
	// Construtor
	public Pessoa(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}
	
	// Insere código da pessoa no banco de dados
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	// Obtém código da pessoa no banco de dados
	public int getCodigo() {
		return codigo;
	}
	
	// Insere nome da pessoa no banco de dados
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// Obtém o nome da pessoa no banco de dados
	public String getNome() {
		return nome;
	}	
}
