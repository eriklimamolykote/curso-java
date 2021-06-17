// Original author: Leonardo Moura Leitão & Cod3r Cursos
// (C) 2019, 2021 by Cod3r Cursos. All Rights Reserved 

package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

// Obtém um registro de usuário utilizando "Hibernate"
public class ObterUsuario {
	
	public static void main(String[] args) {
		
		// Cria um gerenciador de entidade
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		// Retorna o usuário
		Usuario usuario = em.find(Usuario.class, 1L);
		System.out.println(usuario.getNome());
		
		// Fecha o gerenciador de entidade
		em.close();
		emf.close();
	}
}
