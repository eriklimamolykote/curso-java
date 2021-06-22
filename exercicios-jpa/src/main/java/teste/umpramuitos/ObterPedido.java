// Original author: Leonardo Moura Leitão & Cod3r Cursos
// (C) 2019, 2021 by Cod3r Cursos. All Rights Reserved

package teste.umpramuitos;

import infra.DAO;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedido;

public class ObterPedido {
	
	public static void main(String[] args) {
		
		// Cria nova instância da classe pedido e obtém informações
		// relevantes: ID do pedido e quantidade de itens no pedido
		DAO<Pedido> dao = new DAO<>(Pedido.class);
		
		Pedido pedido = dao.obterPorID(1L);
		dao.fechar();
		
		for (ItemPedido item: pedido.getItens()) {
			System.out.println(item.getQuantidade());
			System.out.println(item.getProduto().getNome());
		}
	}
}
