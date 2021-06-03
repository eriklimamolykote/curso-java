// Original author: Leonardo Moura Leitão & Cod3r Cursos
// (C) 2019, 2021 by Cod3r Cursos. All Rights Reserved

package lambdas;

public class Threads {
	
	public static void main(String[] args) {
		
		// Cria dois Runnables,
		// sendo que um é implementado com um executável que 
		// imprime uma frase 10 vezes
		Runnable trabalho1 = new Trabalho1();
		Runnable trabalho2 = new Runnable() {
			public void run() {
				for (int i = 0; i <= 10; i++) {
					System.out.println("Tarefa #02");
					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}
				}
			}
		};
		
		Runnable trabalho3 = Threads::trabalho3;
		
		// Cria três Threads e as inicializa
		Thread t1 = new Thread(trabalho1);
		Thread t2 = new Thread(trabalho2);
		Thread t3 = new Thread(trabalho3);
		
		t1.start();
		t2.start();
		t3.start();
	}
	
	static void trabalho3() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Tarefa #03");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
		}
	}
}
