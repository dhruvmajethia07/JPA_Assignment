package com.cg.jpacurd.dao;

import com.cg.jpacurd.entities.Author;

public interface AuthorDao {
	public abstract Author getAuthorById(int id);

	public abstract void addAuthor(Author Author);

	public abstract void removeAuthor(Author Author);

	public abstract void updateAuthor(Author Author);

	public abstract void commitTransaction();

	public abstract void beginTransaction();

}
