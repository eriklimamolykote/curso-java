// (C) 2019, 2021 by Leonardo Moura Leit�o and Cod3r Cursos
// All rights reserved

package layout;

import java.util.ArrayList;
import java.util.List;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.TilePane;

public class TesteTilePane extends TilePane{
	// Construtor padrão
	public TesteTilePane() {
		
		// Lista de elementos
		List<Quadrado> quadrados = new ArrayList<>();
		
		// Adiciona dez quadrados à cena
		for (int i = 0; i < 10; i++) {
			quadrados.add(new Quadrado(i * 10));
		}
		
		// Ajusta o espaçamento
		setPadding(new Insets(20, 10, 20, 10));
		setVgap(10);
		setHgap(10);
		
		// Ajusta a orientação
		setOrientation(Orientation.VERTICAL);
		
		// Ajusta o alinhamento
		setTileAlignment(Pos.BOTTOM_RIGHT);
		
		getChildren().addAll(quadrados);
	}
}
