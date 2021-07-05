// (C) 2019, 2021 by Leonardo Moura Leit�o and Cod3r Cursos
// All rights reserved

package layout;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.FlowPane;

public class TesteFlowPane extends FlowPane {
	
	// Construtor padrão
	public TesteFlowPane() {
		// Cria quadrados
		Quadrado q1 = new Quadrado();
		Quadrado q2 = new Quadrado();
		Quadrado q3 = new Quadrado();
		Quadrado q4 = new Quadrado();
		Quadrado q5 = new Quadrado();
		
		// Ajusta o espaçamento entre os elementos
		setHgap(10); // Horizontal
		setVgap(10); // Vertical
		setPadding(new Insets(10)); // Separação
		
		setOrientation(Orientation.VERTICAL); // Orientação vertical
		setAlignment(Pos.CENTER_RIGHT); // Alinhamento centro-direita
		
		getChildren().addAll(q1, q2, q3, q4, q5);
	}
}
