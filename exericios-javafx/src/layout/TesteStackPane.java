// (C) 2019, 2021 by Leonardo Moura Leit�o and Cod3r Cursos
// All rights reserved

package layout;

import javafx.application.Platform;
import javafx.scene.layout.StackPane;

public class TesteStackPane extends StackPane{
	// Construtor padrão
	public TesteStackPane() {
		Caixa c1 = new Caixa().comTexto("1");
		Caixa c2 = new Caixa().comTexto("2");
		Caixa c3 = new Caixa().comTexto("3");
		Caixa c4 = new Caixa().comTexto("4");
		Caixa c5 = new Caixa().comTexto("5");
		Caixa c6 = new Caixa().comTexto("6");
		
		getChildren().addAll(c1, c2, c3, c4, c5, c6);
		
		// Evento de clique do mouse
		setOnMouseClicked(e -> {
			if (e.getSceneX() > getScene().getWidth() / 2) {
				// Movimenta os elementos para frente
				getChildren().get(0).toFront();
			} else {
				// Movimenta os elementos para trás
				getChildren().get(5).toBack();
			}
		});
		
		// Cria uma thread, põe o primeiro elemento na frente dos outros 
		// e configura o tempo de repouso
		Thread t = new Thread(() -> {
			while (true) {
				try {
					Thread.sleep(3000);
					
					Platform.runLater(() -> {
						getChildren().get(0).toFront();
					});
					
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		});
		
		// Se a thread principal morrer, esta daqui também morre
		t.setDaemon(true);
		// Inicia a thread
		t.start();
	}
}
