// Original author: Leonardo Moura Leitão & Cod3r Cursos
// (C) 2019, 2021 by Cod3r Cursos. All Rights Reserved

package br.com.cod3r.cm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	void testarSeIgualADois() {
		
		int a = 1 + 1;
		assertEquals(2, a);
	}
	
	@Test
	void testarSeIgualATres() {
		
		int x = 2 + 10 - 9;
		assertEquals(3, x);
	}
}
