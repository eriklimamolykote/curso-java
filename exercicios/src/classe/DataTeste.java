// Original author: Leonardo Moura Leitão & Cod3r Cursos
// (C) 2019, 2021 by Cod3r Cursos. All Rights Reserved

package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		
		Data d2 = new Data(31, 12, 2020);
		d1.ano = 2021;
		
		String dataFormatada1 = d1.obterDataFormatada();
		
		System.out.println(dataFormatada1);
		System.out.println(d2.obterDataFormatada());
		
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
	}
}
