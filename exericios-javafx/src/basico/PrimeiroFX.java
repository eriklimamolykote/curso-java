// (C) 2019, 2021 by Leonardo Moura Leitão and Cod3r Cursos
// All rights reserved

package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class PrimeiroFX extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// Cria botões
		Button botaoA = new Button("A");
		Button botaoB = new Button("B");
		Button botaoC = new Button ("C");
		
		// Faz o botão A imprimir "A"
		botaoA.setOnAction(e -> {System.out.println("A");});
		// Faz o botão B imprimir "B"
		botaoB.setOnAction(e -> {System.out.println("B");});
		// Faz o botão C encerrar a cena
		botaoC.setOnAction(e -> {System.exit(0);});
		
		// Cria uma nova caixa e adiciona botões à ela
		HBox box = new HBox();
		// Configura o alinhamento
		box.setAlignment(Pos.CENTER);
		// Configura o espaçamento
		box.setSpacing(10);
		box.getChildren().add(botaoA);
		box.getChildren().add(botaoB);
		box.getChildren().add(botaoC);
		
		// Cria uma cena e adiciona a caixa à ela
		Scene unicaCena = new Scene(box, 100, 150);
		// Exibe a cena que foi criada
		primaryStage.setScene(unicaCena);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
