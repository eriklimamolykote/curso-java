// Original author: Leonardo Moura Leitão & Cod3r Cursos
// (C) 2019, 2021 by Cod3r Cursos. All Rights Reserved

package lambdas;

import java.util.function.Function;

public class Funcao {
	
	public static void main(String[] args) {
		
		// Expressão Lambda que recebe um número e
		// verifica se ele é par ou ímpar
		Function<Integer, String> parOuImpar =
				numero -> numero % 2 == 0 ? "Par" : "Ímpar";
				
		// Expressão Lambda que recebe um número e 
		// o imprime concatenado com uma mensagem
		Function<String, String> oResultadoE = 
				valor -> "O resultado é: " + valor;
		
		// Expressão Lambda que recebe uma String como parâmetro
		// e retorna uma String		
		Function<String, String> empolgado = 
				valor -> valor + "!!!";
				
		Function<String, String> duvida = 
				valor -> valor + "???";
		
		// Expresão que imprime o resultado da verificação
		// entre par ou ímpar			
		String resultadoFinal1 = parOuImpar
				.andThen(oResultadoE)
				.andThen(empolgado)
				.apply(32);
		
		// Faz a mesma coisa que o caso anterior,
		// exceto por imprimir interrogações ao invés de 
		// exclamações
		String resultadoFinal2 = parOuImpar
				.andThen(oResultadoE)
				.andThen(duvida)
				.apply(33);
		
		System.out.println(resultadoFinal1);
		System.out.println(resultadoFinal2);
		System.out.println(parOuImpar.apply(32));
	}
}
