// (C) 2019, 2021 by Leonardo Moura Leit�o and Cod3r Cursos
// All rights reserved

package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {
	
	// Método que imprime uma saudação num aplicativo SpringBoot
	@GetMapping(path = {"/ola", "/saudacao" })
	public String ola() {
		return "Olá, Spring Boot (GET)!";
	}
}
