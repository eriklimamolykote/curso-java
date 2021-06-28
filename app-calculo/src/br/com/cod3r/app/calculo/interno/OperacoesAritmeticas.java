// Original author: Leonardo Moura Leitão & Cod3r Cursos
// (C) 2019, 2021 by Cod3r Cursos. All Rights Reserved 

package br.com.cod3r.app.calculo.interno;

import java.util.Arrays;

// Realiza operações aritméticas básicas (Adição, subtração, multiplicação e
// divisão)
public class OperacoesAritmeticas {
	
	public double soma(double... nums) {
		return Arrays.stream(nums).reduce(0.0, (t, a) -> t + a);
	}
}
