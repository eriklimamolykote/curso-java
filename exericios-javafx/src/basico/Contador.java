// (C) 2019, 2021 by Leonardo Moura Leit�o and Cod3r Cursos
// All rights reserved

package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application {
	
	// Declara��o de vari�veis
	private int contador = 0;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// Cria dois r�tulos
		Label labelTitulo = new Label("Contador");
		// Adiciona formata��o de estilo ao r�tulo do t�tulo
		labelTitulo.getStyleClass().add("titulo");
		Label labelNumero = new Label("0");
		// Adiciona formata��o de estilo ao r�tulo do n�mero
		labelNumero.getStyleClass().add("numero");
		
		// Cria os bot�es de decremento e de incremento
		Button botaoDecremento = new Button("-");
		botaoDecremento.setOnAction(e -> {
			contador--;
			labelNumero.setText(Integer.toString(contador));
		});
		Button botaoIncremento = new Button("+");
		botaoIncremento.setOnAction(e -> {
			contador++;
			labelNumero.setText(Integer.toString(contador));
		});
		
		// Cria nova caixa horizontal
		HBox boxBotoes = new HBox();
		// Configura o alinhamento da caixa com os bot�es
		boxBotoes.setAlignment(Pos.CENTER);
		// Configura o espa�amento da caixa com os bot�es
		boxBotoes.setSpacing(10);
		boxBotoes.getChildren().add(botaoDecremento);
		boxBotoes.getChildren().add(botaoIncremento);
		
		// Cria caixa vertical principal e adiciona os r�tulos e os bot�es
		// � ela
		VBox boxConteudo = new VBox();
		// Adiciona formata��o de estilo � caixa vertical principal
		boxConteudo.getStyleClass().add("conteudo");
		// Configura o espa�amento da caixa vertical principal
		boxConteudo.setSpacing(10);
		// Configura o alinhamento da caixa principal
		boxConteudo.setAlignment(Pos.CENTER);
		boxConteudo.getChildren().add(labelTitulo);
		boxConteudo.getChildren().add(labelNumero);
		boxConteudo.getChildren().add(boxBotoes);
		
		// Busca um arquivo de formata��o de estilo (CSS)
		String caminhoDoCss = getClass()
				.getResource("/basico/Contador.css").toExternalForm();
		
		// Cria a cena
		Scene cenaPrincipal = new Scene(boxConteudo, 400, 400);
		// Aplica a formata��o de estilo na cena
		cenaPrincipal.getStylesheets().add(caminhoDoCss);
		// Muda o tipo da letra
		cenaPrincipal.getStylesheets().add("https://fonts.googleapis.com/css2?family=Oswald");
		
		primaryStage.setScene(cenaPrincipal);
		
		// Exibe a cena que foi criada
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
