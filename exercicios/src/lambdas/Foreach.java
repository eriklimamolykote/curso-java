// Original author: Leonardo Moura Leitão & Cod3r Cursos
// (C) 2019, 2021 by Cod3r Cursos. All Rights Reserved

package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays
				.asList("Bruno", "Erik", "Lucas", "Bianca");
		
		System.out.println("Forma tradicional...");
		for (String nome: aprovados) {
			System.out.println(nome);
		}
		
		// Usando expressão Lambda
		System.out.println("\nAgora usando expressão Lamda...");
		
		aprovados.forEach(nome -> System.out.println(nome + "!!!"));
		
		// Referência de Método
		System.out.println("\nMethod Reference #01...");
		aprovados.forEach(System.out::println);
		
		// Outra expressão LAmbda
		System.out.println("\nLambda #02...");
		aprovados.forEach(nome -> meuImprimir(nome));
		
		// Outra referência de método
		System.out.println("\nMethod Reference #02...");
		aprovados.forEach(Foreach::meuImprimir);
	}
	
	static void meuImprimir(String nome) {
		System.out.println("Oi! Meu nome é " + nome);	
	}
}
