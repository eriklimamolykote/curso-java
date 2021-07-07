// (C) 2019, 2021 by Leonardo Moura Leit�o and Cod3r Cursos
// All rights reserved

package br.com.cod3r.exerciciossb.models;

public class Cliente {
	
	// Declaração de variáveis
	private int id;
	private String nome;
	private String cpf;
	
	// Construtor padrão
	public Cliente (int id, String nome, String cpf) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
