// Original author: Leonardo Moura Leitão & Cod3r Cursos
// (C) 2019, 2021 by Cod3r Cursos. All Rights Reserved 

package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

// Relação um-pra-um entre as tabelas "Cliente" e "Assento"
public class NovoClienteAssento1 {
	
	public static void main(String[] args) {
		
		// Cria novas instâncias de cada classe
		Assento assento = new Assento("16A");
		Cliente cliente = new Cliente("Carlos", assento);
		
		DAO<Object> dao = new DAO<>();
		
		// Abre uma transação e realiza operações de inclusão
		dao.abrirT()
			.incluir(assento)
			.incluir(cliente)
			.fecharT()
			.fechar();
	}
}
