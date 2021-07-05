// (C) 2019, 2021 by Leonardo Moura Leit�o and Cod3r Cursos
// All rights reserved

package layout;

import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

public class TesteGridPane extends GridPane {
	// Construtor padrão
	public TesteGridPane() {
		
		// Cria caixas com texto
		Caixa c1 = new Caixa().comTexto("1");
		Caixa c2 = new Caixa().comTexto("2");
		Caixa c3 = new Caixa().comTexto("3");
		Caixa c4 = new Caixa().comTexto("4");
		Caixa c5 = new Caixa().comTexto("5");
		Caixa c6 = new Caixa().comTexto("6");
		
		// Ajusta linhas vizíveis na grade
		setGridLinesVisible(true);
		
		// Adiciona as colunas
		getColumnConstraints().addAll(cc(), cc(), fcc(), cc(), cc());
		
		// Adiciona as linhas
		getRowConstraints().addAll(rc(), rc(), frc(), rc(), rc());
		
		setVgap(10);
		setHgap(10);
		
		// Adiciona elementos
		add(c1, 0, 0, 2, 2);
		add(c2, 1, 1, 2, 2);
		add(c3, 4, 2, 1, 3);
		add(c4, 3, 1);
		add(c5, 0, 4, 2, 1);
		add(c6, 3, 3);
	}
	
	// Função para criar colunas
	private ColumnConstraints cc() {
		ColumnConstraints cc = new ColumnConstraints();
		// Ajusta percentual de largura
		cc.setPercentWidth(20);
		cc.setFillWidth(true);
		return cc;
	}
	
	// Função para criar colunas fixas
	private ColumnConstraints fcc() {
		ColumnConstraints fcc = new ColumnConstraints();
		// Ajusta percentual de largura
		// cc.setPercentWidth(20);
		fcc.setMinWidth(50);
		fcc.setMaxWidth(50);
		// cc.setFillWidth(true);
		return fcc;
		}
	
	// Função para criar linhas
	private RowConstraints rc() {
		RowConstraints rc = new RowConstraints();
		// Ajusta percentual de altura
		rc.setPercentHeight(20);
		rc.setFillHeight(true);
		return rc;
	}
	
	// Função para criar linhas fixas
	private RowConstraints frc() {
		RowConstraints rc = new RowConstraints();
		// Ajusta percentual de altura
		rc.setMinHeight(20);
		rc.setMaxHeight(20);
		return rc;
		}
}
