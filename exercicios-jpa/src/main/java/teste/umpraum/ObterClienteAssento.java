// Original author: Leonardo Moura Leitão & Cod3r Cursos
// (C) 2019, 2021 by Cod3r Cursos. All Rights Reserved 

package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

// Relação bidirecional entre as tabelas "Cliente" e "Assento"
public class ObterClienteAssento {
	
	public static void main(String[] args) {
		
		// Cria nova instância da classe "Cliente" e obtém seus
		// dados: ID, nome e assento
		DAO<Cliente> daoCliente = new DAO<>(Cliente.class);
		
		Cliente cliente = daoCliente.obterPorID(1L);
		System.out.println(cliente.getAssento(null).getNome());
		
		// Fecha o DAO do cliente
		daoCliente.fechar();
		
		// Cria nova instância da classe "Assento" e obem seus
		// dados: ID do cliente, nome do cliente e nº do assento
		DAO<Assento> daoAssento = new DAO<>(Assento.class);
		Assento assento = daoAssento.obterPorID(4L);
		
		System.out.println(assento.getCliente().getNome());
		
		// Fecha o DAO do asento
		daoAssento.fechar();
	}
}
