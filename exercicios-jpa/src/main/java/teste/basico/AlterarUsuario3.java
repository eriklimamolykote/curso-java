// Original author: Leonardo Moura Leitão & Cod3r Cursos
// (C) 2019, 2021 by Cod3r Cursos. All Rights Reserved 

package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

// Altera registro de um usuário utilizando "Hibernate"
public class AlterarUsuario3 {
	
	public static void main(String[] args) {
		
		// Cria um gerenciador de entidade
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		// Localiza o registro e o altera
		Usuario usuario = em.find(Usuario.class, 7L);
		em.detach(usuario);
		
		usuario.setNome("Erik");
		
		// Realiza as alterações no banco de dados
		// em.merge(usuario);
		
		em.getTransaction().commit();
		
		// Fecha o gerenciador de entidade
		em.close();
		emf.close();
	}
}
