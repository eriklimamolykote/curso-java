// Original author: Leonardo Moura Leitão & Cod3r Cursos
// (C) 2019, 2021 by Cod3r Cursos. All Rights Reserved 

package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Usuario;

// Obtém registros de vários usuários utilizando "Hibernate"
public class ObterUsuarios {
	
	public static void main(String[] args) {
		// Cria um gerenciador de entidade
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		// Cria instância do Java Prescription Query Language
		String jpql = "select u from Usuario u";
		// Realiza uma consulta pelo tipo da classe 
		TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
		// Configura em dez o valor máximo de resultados 
		// para serem exibidos
		query.setMaxResults(10);
		
		// Obtém o resultado da consulta
		List<Usuario> usuarios = query.getResultList();
		/* List<Usuario> usuarios = em
				.createQuery("select u from Usuario u", Usuario.class)
				.setMaxResults(5)
				.getResultList(); */
		
		for (Usuario usuario: usuarios) {
			System.out.println("ID: " + usuario.getId() 
					+ "Nome: " + usuario.getNome());
		}
		
		// Fecha o gerenciador de entidade
		em.close();
		emf.close();
	}
}
