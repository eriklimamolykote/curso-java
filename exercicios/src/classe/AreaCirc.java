// Original author: Leonardo Moura Leitão & Cod3r Cursos
// (C) 2019, 2021 by Cod3r Cursos. All Rights Reserved

package classe;

public class AreaCirc {
	
	double raio;
	final static double PI = 3.14;
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		return PI * Math.pow(raio,  2);
	}
	
	static double area(double raio) {
		return PI * Math.pow(raio,  2);
	}
}