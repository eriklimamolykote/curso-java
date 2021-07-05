// (C) 2019, 2021 by Leonardo Moura Leit�o and Cod3r Cursos
// All rights reserved

package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Wizard extends Application {
	
	// Declaração de variáveis
	private Stage janela;
	private Scene passo1;
	private Scene passo2;
	private Scene passo3;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		janela = primaryStage;
		
		criarPasso1();
		criarPasso2();
		criarPasso3();
		
		// Configura tiulo e o exibe
		janela.setScene(passo1);
		janela.setTitle("Wizard :: Passo 01");
		janela.show();
	}
	
	// Primeiro passo
	private void criarPasso1() {
		// Cria botão
		Button proximoPasso = new Button("Ir ao Passo 2 >>");
		// Ação para ir ao passo 2
		proximoPasso.setOnAction(e -> {
			janela.setScene(passo2);
			// Altera o título da janela
			janela.setTitle("Wizard :: Passo 02");
		});
		// Cria nova caixa horizontal, ajusta seu alinhamento e 
		// adiciona o botão "proximoPasso"
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(proximoPasso);
		
		passo1 = new Scene(box, 400, 400);
	}
	
	// Segundo passo
	private void criarPasso2() {
		// Botão para ir para o passo anterior
		Button passoAnterior = new Button("<< Voltar ao Passo 1");
		// Ação para voltar ao passo 1
		passoAnterior.setOnAction(e -> {
			janela.setScene(passo1);
			// Altera o título da janela
			janela.setTitle("Wizard :: Passo 01");
		});
		// Cria botão
		Button proximoPasso = new Button("Ir ao Passo 3 >>");
		// Ação para ir ao passo 3
		proximoPasso.setOnAction(e -> {
			janela.setScene(passo3);
			// Altera o título da janela
			janela.setTitle("Wizard :: Passo 03");
		});
		// Cria nova caixa horizontal, ajusta seu alinhamento e 
		// adiciona o botão "proximoPasso"
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(passoAnterior);
		box.getChildren().add(proximoPasso);
		
		passo2 = new Scene(box, 400, 400);
	}
	
	// Terceiro passo
	private void criarPasso3() {
		// Botão para ir para o passo anterior
		Button passoAnterior = new Button("<< Voltar ao Passo 2");
		// Ação para voltar ao passo 2
		passoAnterior.setOnAction(e -> {
			janela.setScene(passo2);
			// Altera o título da janela
			janela.setTitle("Wizard :: Passo 02");
		});
		// Cria botão
		Button proximoPasso = new Button("Finalizar");
		// Sai da aplicação
		proximoPasso.setOnAction(e -> {
			System.exit(0);
		});
		// Cria nova caixa horizontal, ajusta seu alinhamento e 
		// adiciona o botão "proximoPasso"
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(passoAnterior);
		box.getChildren().add(proximoPasso);
		
		passo3 = new Scene(box, 400, 400);
	}
	
	// Classe principal
	public static void main(String[] args) {
		// Inicia o aplicativo
		launch(args);
	}
}
