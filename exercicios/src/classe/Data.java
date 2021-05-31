// Original author: Leonardo Moura Leitão & Cod3r Cursos
// (C) 2019, 2021 by Cod3r Cursos. All Rights Reserved

package classe;

import java.util.Date;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	// construtor padrão, que retorna a data de 01/01/1970
		Data() {
			dia = 1;
			mes = 1;
			ano = 1970;
		}
		
		Data(int diaInicial, int mesInicial, int anoInicial) {
			dia = diaInicial;
			mes = mesInicial;
			ano = anoInicial;
		}
	
	String obterDataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}

	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}
	
	
}
