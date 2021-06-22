// Original author: Leonardo Moura Leitão & Cod3r Cursos
// (C) 2019, 2021 by Cod3r Cursos. All Rights Reserved 

package teste.umpramuitos;

import infra.DAO;
import modelo.basico.Produto;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedido;

public class NovoPedido {
	
	public static void main(String[] args) {
		
		DAO<Object> dao = new DAO<>();
		
		Produto produto = new Produto("Geladeira", 2789.99);
		Pedido pedido = new Pedido();
		ItemPedido item = new ItemPedido(pedido, produto, 10);
		
		// Realiza as operações necessárias para efetuar um pedido
		// de compra
		dao
			.abrirT()
			.incluir(produto)
			.incluir(pedido)
			.incluir(item)
			.fecharT()
			.fechar();
	}
}
