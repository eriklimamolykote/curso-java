// Original author: Leonardo Moura Leitão & Cod3r Cursos
// (C) 2019, 2021 by Cod3r Cursos. All Rights Reserved 

package modelo.muitospramuitos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Sobrinho {
	
	// Declaração de variáveis
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	@ManyToMany(mappedBy = "sobrinhos")
	private List<Tio> tios = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Tio> getTios() {
		return tios;
	}

	public void setTios(List<Tio> tios) {
		this.tios = tios;
	}
	
	// Construtor padrão
	public Sobrinho(String nome) {
		super();
		this.nome = nome;
	}
	
	public Sobrinho() {
		
	}
}
