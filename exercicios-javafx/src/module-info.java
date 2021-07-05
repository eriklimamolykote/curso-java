// (C) 2019, 2021 by Leonardo Moura Leit�o and Cod3r Cursos
// All rights reserved

module exerciciosfx {
	// Requisita uso dos controles do pacote JavaFX
	requires javafx.controls;
	requires javafx.fxml;
	requires org.controlsfx.controls;
	
	// Abre pacotes necessários para a execução de um projeto
	opens basico;
	opens layout;
	opens fxml;
}