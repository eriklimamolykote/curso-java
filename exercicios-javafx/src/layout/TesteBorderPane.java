// (C) 2019, 2021 by Leonardo Moura Leit�o and Cod3r Cursos
// All rights reserved

package layout;

import javafx.scene.layout.BorderPane;

public class TesteBorderPane extends BorderPane {
	
	// Construtor padrão
	public TesteBorderPane() {

		// Cria as caixas e ajusta seus posicionamentos
		Caixa c1 = new Caixa().comTexto("Topo");
		setTop(c1);
		
		Caixa c2 = new Caixa().comTexto("Esquerda");
		setLeft(c2);
		
		Caixa c3 = new Caixa().comTexto("Direita");
		setRight(c3);
		
		Caixa c4 = new Caixa().comTexto("Fundo");
		setBottom(c4);
		
		Caixa c5 = new Caixa().comTexto("Área Central");
		setCenter(c5);
	}
}
