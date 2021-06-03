// Original author: Leonardo Moura Leitão & Cod3r Cursos
// (C) 2019, 2021 by Cod3r Cursos. All Rights Reserved
// Classe que cria o campo minado

package br.com.cod3r.cm.modelo;

import java.util.ArrayList;
import java.util.List;

public class Campo {
	
	// Linhas e colunas do campo minado
	private final int linha;
	private final int coluna;
	
	private boolean aberto = false; // Verifica se existem espaços abertos no campo para serem explorados
	private boolean minado = false; // Verifica se o espaço possui uma ou mais minas que já explodiram
	private boolean marcado = false; // Verifica se o espaço da mina já está marcado
	
	private List<Campo> vizinhos = new ArrayList<>();
	
	// Construtor do campo minado
	Campo(int linha, int coluna) {
		this.linha = linha; 
		this.coluna = coluna;
	}
	
	boolean adicionarVizinho(Campo vizinho) {
		
	}
}
