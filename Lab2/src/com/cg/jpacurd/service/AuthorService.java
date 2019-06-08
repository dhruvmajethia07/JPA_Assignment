package com.cg.jpacurd.service;

import com.cg.jpacurd.entities.Author;

public interface AuthorService {
	public abstract void addAuthor(Author Author);

	public abstract void updateAuthor(Author Author);

	public abstract void removeAuthor(Author Author);

	public abstract Author findAuthorById(int id);

}
