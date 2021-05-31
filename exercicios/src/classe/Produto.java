// Original author: Leonardo Moura Leitão & Cod3r Cursos
// (C) 2019, 2021 by Cod3r Cursos. All Rights Reserved

package classe;

public class Produto {

	// Declaração de variáveis
	String nome;
	double preco;
	double desconto;
	
	// Construtor padrão
	Produto() {
		
	}
	
	Produto(String nomeInicial) {
		nome = nomeInicial;
	}
	
	Produto(String nomeInicial, double precoInicial, 
			double descontoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
	}
	
	// Método para calcular o desconto
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}
}
