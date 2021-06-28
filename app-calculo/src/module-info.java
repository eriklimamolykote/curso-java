// Original author: Leonardo Moura Leitão & Cod3r Cursos
// (C) 2019, 2021 by Cod3r Cursos. All Rights Reserved 

module app.calculo {
	// Importa módulo de outro projeto
	requires transitive app.logging;
	// Exporta um módulo para que este fique visível para
	// outros projetos
	exports br.com.cod3r.app.calculo;
	
	exports br.com.cod3r.app.calculo.interno
		to app.financeiro;
	
	opens br.com.cod3r.app.calculo to app.financeiro;
}