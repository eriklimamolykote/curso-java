// Original author: Leonardo Moura Leitão & Cod3r Cursos
// (C) 2019, 2021 by Cod3r Cursos. All Rights Reserved 

package modelo.umpramuitos;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Pedido {
	
	// Declaração de variáveis
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private Date data;
	
	// esse é o valor padrão (...TooMany -> LAZY)
	@OneToMany(mappedBy = "pedido", fetch = FetchType.LAZY)
	private List<ItemPedido> itens;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	public Pedido() {
		this(new Date());
	}
	
	// Construtor padrão
	public Pedido(Date data) {
		super();
		this.data = data;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}
}
