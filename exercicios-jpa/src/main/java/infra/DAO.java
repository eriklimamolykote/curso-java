// Original author: Leonardo Moura Leitão & Cod3r Cursos
// (C) 2019, 2021 by Cod3r Cursos. All Rights Reserved 

package infra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class DAO<E> {
	
	// Cria instância do gerenciador de entidade
	private static EntityManagerFactory emf;
	private EntityManager em;
	
	private Class<E> classe;
	
	static {
		// Tratamento de erro - Bloco "try / catch"
		try {
			emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		} catch (Exception e) {
			// relatório -> log4j
		}
	}
	
	// Construtor padrão
	public DAO() {
		this(null);
	}
	
	public DAO(Class<E> classe) {
		// Inicializa o gerenciador de entidade
		this.classe = classe;
		em = emf.createEntityManager();
	}
	
	public DAO<E> teste() {
		return this;
	}
	
	// Abre a transação
	public DAO<E> abrirT() {
		em.getTransaction().begin();
		return this;
	}
	
	// Fecha a transação
	public DAO<E> fecharT() {
		em.getTransaction().commit();
		return this;
	}
	
	// Método de inclusão
	public DAO<E> incluir(E entidade) {
		em.persist(entidade);
		return this;
	}
	
	public DAO<E> incluirAtomico(E entidade) {
		return this.abrirT().incluir(entidade).fecharT();
	}
	
	// Localiza um registro pelo seu ID
	public E obterPorID(Object id) {
		return em.find(classe, id);
	}
	
	public List<E> obterTodos() {
		return this.obterTodos(10, 0);
	}
	
	// Obtém todos os registros durante uma consulta
	public List<E> obterTodos(int qtde, int deslocamento) {
		// Lança exceção se a classe estiver nula
		if (classe == null) {
			throw new UnsupportedOperationException("Classe nula");
		}
		
		// Declaração Java Persistence Query Language
		// para exibir os registros de um tabela
		String jpql = "select e from " + classe.getName() + " e";
		TypedQuery<E> query = em.createQuery(jpql, classe);
		query.setMaxResults(qtde);
		query.setFirstResult(deslocamento);
		// Obtém o resultado da consulta
		return query.getResultList();
	}
	
	// Realiza consulta lendo o arquivo "consultas.xml" do pacote META-INF
	public List<E> consultar(String nomeConsulta, Object... params) {
		TypedQuery<E> query = em.createNamedQuery(nomeConsulta,  classe);
		
		for (int i = 0; i < params.length; i += 2) {
			query.setParameter(params[i].toString(), params[i + 1]);
		}
		
		return query.getResultList();
	}
	
	public E consultarUm(String nomeConsulta, Object... params) {
		List<E> lista = consultar(nomeConsulta, params);
		return lista.isEmpty() ? null : lista.get(0);
	}
	
	// Fecha o gerenciador de entidade
	public void fechar() {
		em.close();
	}
}
