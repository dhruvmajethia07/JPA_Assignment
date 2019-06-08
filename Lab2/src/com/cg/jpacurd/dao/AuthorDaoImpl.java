package com.cg.jpacurd.dao;

import javax.persistence.EntityManager;

import com.cg.jpacurd.entities.Author;

public class AuthorDaoImpl implements AuthorDao{
	private EntityManager entityManager;

	public AuthorDaoImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public Author getAuthorById(int id) {
		Author Author = entityManager.find(Author.class, id);
		return Author;
	}

	@Override
	public void addAuthor(Author Author) {
		entityManager.persist(Author);
	}

	@Override
	public void removeAuthor(Author Author) {
		entityManager.remove(Author);
	}

	@Override
	public void updateAuthor(Author Author) {
		entityManager.merge(Author);
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}
}