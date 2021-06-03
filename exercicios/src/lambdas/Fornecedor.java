// Original author: Leonardo Moura Leitão & Cod3r Cursos
// (C) 2019, 2021 by Cod3r Cursos. All Rights Reserved

package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
	
	public static void main(String[] args) {
		
		// Forncedor
		Supplier<List<String>> umaLista = 
				() -> Arrays.asList("Ana", "Bia", "Lia", "Gui");
				
		System.out.println(umaLista.get());		
	}
}
