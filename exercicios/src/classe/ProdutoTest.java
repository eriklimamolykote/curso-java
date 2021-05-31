// Original author: Leonardo Moura Leitão & Cod3r Cursos
// (C) 2019, 2021 by Cod3r Cursos. All Rights Reserved

package classe;

public class ProdutoTest {

	public static void main(String[] args) {
		
		// Chama o construtor para instanciar um novo produto
		Produto p1 = new Produto("Notebook", 4356.89, 0.25);
		
		// Instancia um novo produto e atribui nome, preço e percentual de desconto
		Produto p2 = new Produto("Caneta Preta");
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		p2.desconto = 0.29;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.1);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("Média do carrinho = R$%.2f", mediaCarrinho);
	}
}
