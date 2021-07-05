// (C) 2019, 2021 by Leonardo Moura Leit�o and Cod3r Cursos
// All rights reserved

package layout;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Caixa extends HBox {
	
	private static int i = 0;
	
	// Array de cores
	private String[] cores = {
		"c33c5e", "#39aac6", "#28d79a",
		"#fb750e", "#6657a8", "#f9060e"
	};
	
	// Construtor padrão
	public Caixa() {
		this(100, 100);
	}
	
	public Caixa(int largura, int altura) {
		// Ajusta o alinhamento
		setAlignment(Pos.CENTER);
		
		// Ajusta largura e altura
		setMinWidth(largura);
		setMinHeight(altura);
		
		// Ajusta fundo
		BackgroundFill fill = new BackgroundFill(
				Color.web(cores[i++]), CornerRadii.EMPTY, Insets.EMPTY);
		setBackground(new Background(fill));
		
		i++;
		
		if (i == 6) i = 0;
	}
	
	// Adiciona um rótulo dentro de uma caixa
	public Caixa comTexto(String texto) {
		Label label = new Label(texto);
		label.setFont(new Font(24));
		getChildren().add(label);
		return this;
	}
}
