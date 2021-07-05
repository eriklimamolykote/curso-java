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
	
	// Declaração de variáveis
	private int contador = 0;
	
	private void atualizarLabelNumero(Label label) {
		label.setText(Integer.toString(contador));
		
		label.getStyleClass().remove("verde");
		label.getStyleClass().remove("vermelho");
		
		if (contador > 0) {
			label.getStyleClass().add("verde");
		} else if (contador < 0) {
			label.getStyleClass().add("vermelho");
		}
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// Cria dois rótulos
		Label labelTitulo = new Label("Contador");
		// Adiciona formatação de estilo ao rótulo do título
		labelTitulo.getStyleClass().add("titulo");
		Label labelNumero = new Label("0");
		// Adiciona formatação de estilo ao rótulo do número
		labelNumero.getStyleClass().add("numero");
		
		// Cria os botões de decremento e de incremento
		Button botaoDecremento = new Button("-");
		// Adiciona formatação de estilo
		botaoDecremento.getStyleClass().add("botoes");
		botaoDecremento.setOnAction(e -> {
			contador--;
			atualizarLabelNumero(labelNumero);
		});
		Button botaoIncremento = new Button("+");
		// Adiciona formatação de estilo
		botaoIncremento.getStyleClass().add("botoes");
		botaoIncremento.setOnAction(e -> {
			contador++;
			atualizarLabelNumero(labelNumero);
		});
		
		// Cria nova caixa horizontal
		HBox boxBotoes = new HBox();
		// Configura o alinhamento da caixa com os bot�es
		boxBotoes.setAlignment(Pos.CENTER);
		// Configura o espa�amento da caixa com os bot�es
		boxBotoes.setSpacing(10);
		boxBotoes.getChildren().add(botaoDecremento);
		boxBotoes.getChildren().add(botaoIncremento);
		
		// Cria caixa vertical principal e adiciona os rótulos e os botões
		// à ela
		VBox boxConteudo = new VBox();
		// Adiciona formatação de estilo à caixa vertical principal
		boxConteudo.getStyleClass().add("conteudo");
		// Configura o espaçamento da caixa vertical principal
		boxConteudo.setSpacing(10);
		// Configura o alinhamento da caixa principal
		boxConteudo.setAlignment(Pos.CENTER);
		boxConteudo.getChildren().add(labelTitulo);
		boxConteudo.getChildren().add(labelNumero);
		boxConteudo.getChildren().add(boxBotoes);
		
		// Busca um arquivo de formatação de estilo (CSS)
		String caminhoDoCss = getClass()
				.getResource("/basico/Contador.css").toExternalForm();
		
		// Cria a cena
		Scene cenaPrincipal = new Scene(boxConteudo, 400, 400);
		// Aplica a formatação de estilo na cena
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
