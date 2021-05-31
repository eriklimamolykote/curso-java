// Original author: Leonardo Moura Leitão & Cod3r Cursos
// (C) 2019, 2021 by Cod3r Cursos. All Rights Reserved

package fundamentos;

import java.util.Scanner; // Necessário para capturar entrada do teclado

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		// Ler num1
		// Ler num2
		// + - * / %
		
		// Cria novo objeto Scanner, que é conectado à entrada padrão
		Scanner scanner = new Scanner(System.in);
		
		// Solicita que o usuário digite dois números
		System.out.print("Digite o primeiro número: ");
		double num1 = scanner.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		double num2 = scanner.nextDouble();
		
		// Solicita que o usuário escolha uma dentre as quatro operações básicas
		// Adição, subtração, multiplicação e divisão
		System.out.print("Escolha uma operação: ");
		String operacao = scanner.next();
		
		// Realiza os cálculos de cada operação
		double resultado = "+".equals(operacao) ? num1 + num2 : 0;
		resultado = "-".equals(operacao) ? num1 - num2: resultado;
		resultado = "*".equals(operacao) ? num1 * num2 : resultado;
		resultado = "/".equals(operacao) ? num1 / num2 : resultado;
		
		
		// Imprime o resultado da operação
		System.out.printf("%.2f %s %.2f = %.2f",
				num1, operacao, num2, resultado);
		scanner.close();
	}
}