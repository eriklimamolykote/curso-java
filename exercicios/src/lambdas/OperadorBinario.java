// Original author: Leonardo Moura Leitão & Cod3r Cursos
// (C) 2019, 2021 by Cod3r Cursos. All Rights Reserved

package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
	
	public static void main(String[] args) {
		
		// Operador binário
		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
		System.out.println(media.apply(9.8,  5.7));
		
		// Função binária que verifica se um aluno está aprovado ou reprovado
		BiFunction<Double, Double, String> resultado = (n1, n2) ->  {
			double notaFinal = (n1 + n2) / 2;
			return notaFinal >= 7 ? "Aprovado" : "Reprovado";
		};
		
		System.out.println(resultado.apply(9.7,  4.1));
		
		// Função que recebe dois parâmetros para imprimir
		// o conceito de um aluno baseado em sua nota média
		Function<Double, String> conceito = 
				m -> m >= 7 ? "Aprovado" : "Reprovado";
				
		System.out.println(media.andThen(conceito).apply(9.7, 5.1));		
	}
}
