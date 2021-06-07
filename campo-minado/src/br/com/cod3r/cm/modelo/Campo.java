// Original author: Leonardo Moura Leitão & Cod3r Cursos
// (C) 2019, 2021 by Cod3r Cursos. All Rights Reserved
// Classe que cria o campo minado

package br.com.cod3r.cm.modelo;

import java.util.ArrayList;
import java.util.List;

import br.com.cod3r.cm.excecao.ExplosaoException;

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
		boolean linhaDiferente = linha != vizinho.linha;
		boolean colunaDiferente = coluna != vizinho.coluna;
		boolean diagonal = linhaDiferente && colunaDiferente;
		
		int deltaLinha = Math.abs(linha - vizinho.linha);
		int deltaColuna = Math.abs(coluna - vizinho.coluna);
		int deltaGeral = deltaColuna + deltaLinha;
		
		if (deltaGeral == 1 && !diagonal) {
			vizinhos.add(vizinho);
			return true;
		} else if (deltaGeral == 2 && diagonal) {
			vizinhos.add(vizinho);
			return true;
		} else {
			return false;
		}
	}
	
	// Método para alternar marcação de locais onde 
	// provavelmente existe uma mina explosiva
	void alternarMarcacao() {
		if (!aberto) {
			marcado = !marcado;
		}
	}
	
	// Método para abrir os espaços no campo minado
	boolean abrir() {
		
		if (!aberto && !marcado) {
			aberto = true;
			
			// Chama ExplosaoException se o usuário pisar
			// na mina explosiva
			if (minado) {
				throw new ExplosaoException();
			}
			
			if (vizinhancaSegura()) {
				vizinhos.forEach(v -> v.abrir());
			}
			
			return true;
		} else {
			return false;
		}
	}
	
	// Método que verifica se os vizinhos do espaço aberto
	// por uma mina que já explodiu são seguros
	boolean vizinhancaSegura() {
		return vizinhos.stream().noneMatch(v -> v.minado);
	}
	
	/// Insere as minas
	void minar() {
		minado = true;
	}
	
	// Verifica se o espaço no campo possui uma mina explosiva
	public boolean isMinado() {
		return minado;
	}
	
	// Métodos que verificam se há uma posição marcada no
	// campo minado
	public boolean isMarcado() {
		return marcado;
	}
	
	// Método que exibe todos os locais que já foram abertos
	void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	
	public boolean isAberto() {
		return aberto;
	}
	
	public boolean isFechado() {
		return !isAberto();
	}
	
	// Métodos que retornam a linha e a coluna de um determinado espaço
	// no campo
	public int getLinha() {
		return linha;
	}
	
	public int getColuna() {
		return coluna;
	}
	
	// Método que verifica se os objetivos do jogo 
	// foram alcançados
	boolean objetivoAlcancado() {
		boolean desvendado = !minado && aberto;
		boolean protegido = minado && marcado;
		return desvendado || protegido;
	}
	
	// Verifica se há minas explosivas ao redor
	// das que já explodiram ou já foram identificadas
	long minasNaVizinhanca() {
		return vizinhos.stream().filter(v -> v.minado).count();	
	}
	
	// Reinicia o jogo
	void reiniciar() {
		aberto = false;
		minado = false;
		marcado = false;
	}
	
	public String toString() {
		if (marcado) {
			return "X";
		} else if (aberto && minado) {
			return "*";
		} else if (aberto && minasNaVizinhanca() > 0) {
			return Long.toString(minasNaVizinhanca());
		} else if (aberto) {
			return " ";
		} else {
			return "?";
		}
	}
}
