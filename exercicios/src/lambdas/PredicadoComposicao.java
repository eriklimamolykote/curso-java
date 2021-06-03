// Original author: Leonardo Moura Leitão & Cod3r Cursos
// (C) 2019, 2021 by Cod3r Cursos. All Rights Reserved

package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {
	
	public static void main(String[] args) {
		
		// Verifica se o número é par ou ímpar
		Predicate<Integer> isPar = num -> num %2 == 0;
		// Verfica se o número possui três dígitos
		Predicate<Integer> isTresDigitos = 
				num -> num >= 100 && num <= 999;
				
		// Composição de duas funções para verificar se o
		// número é par e possui três dígitos		
		System.out.println(isPar.and(isTresDigitos).test(122));
		
		// Outro cenário
		System.out.println(isPar.or(isTresDigitos).test(123));
	}
}
