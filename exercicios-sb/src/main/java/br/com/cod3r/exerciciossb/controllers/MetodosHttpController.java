// (C) 2019, 2021 by Leonardo Moura Leit�o and Cod3r Cursos
// All rights reserved

package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/metodos")
public class MetodosHttpController {
	
	@GetMapping
	public String get() {
		return "Requisição GET";
	}
	
	@PostMapping
	public String postt() {
		return "Requisição POST";
	}
	
	@PutMapping
	public String put() {
		return "Requisição PUT";
	}
	
	@PatchMapping
	public String patch() {
		return "Requisição PATCH";
	}
	
	@DeleteMapping
	public String delete() {
		return "Requisição DELETE";
	}
}
