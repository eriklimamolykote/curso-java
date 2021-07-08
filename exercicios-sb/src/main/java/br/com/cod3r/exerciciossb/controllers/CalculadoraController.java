// (C) 2019, 2021 by Leonardo Moura Leit�o and Cod3r Cursos
// All rights reserved

package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Desafio proposto como exercício do curso "Java 2021 COMPLETO: Do Zero ao
// Profissional + Projetos!"
@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {
	
	// /calculadora/somar/10/20
	/* @GetMapping("/calculadora/somar/")
	public int somar(int a, int b) {
		int soma = a + b;
		return soma;
	} */
	
	// Resposta do desafio - Soma
	@GetMapping("/somar/{a}/{b}")
	public int somar(@PathVariable int a, @PathVariable int b) {
		return a + b;
	}
	
	// /calculadora/subtrair?a=100&b=39
	/* @GetMapping("/calculadora/subtrair")
	public int subtrair(int x, int y) {
		int subtracao = x - y;
		return subtracao;
	} */
	
	// Resposta do desafio - Subtração
	@GetMapping("/subtrair")
	public int subtrair(@RequestParam(name = "a") int a, 
			@RequestParam(name = "b") int b) {
		return a - b;
	}
}
