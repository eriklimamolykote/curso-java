// Original author: Leonardo Moura Leitão & Cod3r Cursos
// (C) 2019, 2021 by Cod3r Cursos. All Rights Reserved

package br.com.cod3r.cm.visao;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import br.com.cod3r.cm.excecao.ExplosaoException;
import br.com.cod3r.cm.excecao.SairException;
import br.com.cod3r.cm.modelo.Tabuleiro;

// Classe que exibe o jogo no console
public class TabuleiroConsole {
	
	// Declaração de variáveis
	private Tabuleiro tabuleiro;
	private Scanner entrada = new Scanner(System.in);
	
	// Construtor que recebe uma instância da classe Tabuleiro
	// como parâmetro
	public TabuleiroConsole(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		
		executarJogo();
		
	}

	// Método chamado para iniciar uma partida
	private void executarJogo() {
		try {
			boolean continuar = true;
			
			while (continuar) {
				cicloDoJogo();
				
				System.out.println("Deseja iniciar uma nova partida? (S/n) ");
				String resposta = entrada.nextLine();
				
				if ("n".equalsIgnoreCase(resposta)) {
					continuar = false;
				} else {
					tabuleiro.reiniciar();
				}
			}
		} catch (SairException e) {
			System.out.println("Encerrado");
		} finally {
			entrada.close();
		}
	}

	private void cicloDoJogo() {
		try {
			
			while(!tabuleiro.objetivoAlcancado() ) {
				System.out.println(tabuleiro);
				
				String digitado = capturarValorDigitado(
						"Digite os valores das coordenadas (x, y):");
				
				Iterator<Integer> xy = Arrays.stream(digitado.split(","))
					.map(e -> Integer.parseInt(e.trim())).iterator();
				
				digitado = capturarValorDigitado(
						"1 - Abrir ou 2 - (Des)Marcado");
				
				if ("1".equals(digitado)) {
					tabuleiro.abrir(xy.next(), xy.next());
				} else if ("2".equals(digitado)) {
					tabuleiro.alternarMarcacao(xy.next(), xy.next());
				}
				
				System.out.println(xy.next());
				System.out.println(xy.next());
			}
			
			System.out.println(tabuleiro);
			System.out.println("Parabéns! Você ganhou! :D");
		} catch (ExplosaoException e) {
			System.out.println(tabuleiro);
			System.out.println("Que pena! Você perdeu! :(");
		}
	}
	
	// Captura coordenadas no tabuleiro escolhidas pelo jogador
	private String capturarValorDigitado(String texto) {
		System.out.println(texto);
		String digitado = entrada.nextLine();
		
		// Verifica o que o jogador digitou e sai do jogo
		// com base nessa informação
		if ("sair".equalsIgnoreCase(digitado)) {
			throw new SairException();
		}
		
		return digitado;
	}
}
