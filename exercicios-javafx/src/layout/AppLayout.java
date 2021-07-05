// (C) 2019, 2021 by Leonardo Moura Leit�o and Cod3r Cursos
// All rights reserved

package layout;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AppLayout extends Application{
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent raiz = null;
		
		// raiz = new TesteAnchorPane();
		// raiz = new TesteBorderPane();
		// raiz = new TesteFlowPane();
		// raiz = new TesteGridPane();
		// raiz = new TesteStackPane();
		raiz = new TesteTilePane();
		
		// Scene principal = new Scene(new TesteAnchorPane(), 800, 600);
		Scene principal = new Scene(raiz, 800, 600);
		
		// Cria e exibe o estágio
		primaryStage.setScene(principal);
		primaryStage.setTitle("Gerenciadores de Layout");
		primaryStage.show();
	}
	
	// Método principal
	public static void main(String[] args) {
		// Lança a cena
		launch(args);
	}
}
