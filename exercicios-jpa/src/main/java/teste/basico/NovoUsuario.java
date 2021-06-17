// Original author: Leonardo Moura Leitão & Cod3r Cursos
// (C) 2019, 2021 by Cod3r Cursos. All Rights Reserved 

package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

// Cria novo usuário utilizando "Hibernate"
public class NovoUsuario {
	
	public static void main(String[] args) {
		
		// Cria um gerenciador de entidade
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		// Os passos a seguir servem para 
		// persistir informações no banco de dados
		Usuario novoUsuario = new Usuario("Erik", "erik@lanche.com.br");
		
		em.getTransaction().begin();
		em.persist(novoUsuario);
		em.getTransaction().commit();
		
		System.out.println("O Id gerado foi: " + novoUsuario.getId());
		
		// Fecha o gerenciador de entidade
		em.close();
		emf.close();
	}
}
