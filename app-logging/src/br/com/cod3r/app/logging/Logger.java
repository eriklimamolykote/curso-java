// Original author: Leonardo Moura Leitão & Cod3r Cursos
// (C) 2019, 2021 by Cod3r Cursos. All Rights Reserved 

package br.com.cod3r.app.logging;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
	// Obtém informações de um relatório
	public static void info(String msg) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println("[INFO]" + msg);
		System.out.println("[INFO] " + sdf.format(new Date())
				+ " - " + msg);
	}
}
