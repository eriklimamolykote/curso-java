// (C) 2019, 2021 by Leonardo Moura Leit�o and Cod3r Cursos
// All rights reserved

package fxml;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AppFXML extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		// Carrega arquivo CSS
		String arquivoCSS = getClass().getResource("/fxml/Login.css")
				.toExternalForm();
		// Carrega arquivo "Login.fxml"
		URL arquivoFXML = getClass().getResource("/fxml/Login.fxml");
		GridPane raiz = FXMLLoader.load(arquivoFXML);
		
		// Cria cena
		Scene cena = new Scene(raiz, 350, 350);
		// Aplica formatação de estilo
		cena.getStylesheets().add(arquivoCSS);
		
		// Exibe o estágio
		primaryStage.setResizable(false);
		primaryStage.setTitle("Tela de Login");
		primaryStage.setScene(cena);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
