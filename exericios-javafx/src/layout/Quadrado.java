// (C) 2019, 2021 by Leonardo Moura Leit�o and Cod3r Cursos
// All rights reserved

package layout;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Quadrado extends Rectangle{
	
private static int i = 0;
	
	// Array de cores
	private String[] cores = {
		"c33c5e", "#39aac6", "#28d79a",
		"#fb750e", "#6657a8", "#f9060e"
	};
	
	// Construtor padrão
	public Quadrado() {
		this(100);
	}
	
	public Quadrado(int tamanho) {
		
		// Ajusta largura e altura
		setWidth(tamanho);
		setHeight(tamanho);
		
		// Ajusta fundo
		setFill(Color.web(cores[i]));
		
		i++;
		
		if (i == 6) i = 0;
	}
}
