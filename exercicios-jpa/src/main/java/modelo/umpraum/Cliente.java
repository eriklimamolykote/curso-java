// Original author: Leonardo Moura Leitão & Cod3r Cursos
// (C) 2019, 2021 by Cod3r Cursos. All Rights Reserved 

package modelo.umpraum;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {
	
	// Decalração de variáveis
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	// Relacionamento um-pra-um com a tabela "Assento"
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "assento_id", unique = true)
	private Assento assento;
	
	// Construtor padrão
	public Cliente() {
		
	}

	public Cliente(String nome, Assento assento) {
		super();
		this.nome = nome;
		this.assento = assento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Assento getAssento(Assento assento) {
		return assento;
	}
}
