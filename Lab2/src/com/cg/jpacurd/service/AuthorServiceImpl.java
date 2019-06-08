package com.cg.jpacurd.service;

import com.cg.jpacurd.dao.AuthorDao;
import com.cg.jpacurd.dao.AuthorDaoImpl;
import com.cg.jpacurd.entities.Author;


public class AuthorServiceImpl  implements AuthorService{
	private AuthorDao dao;

	public AuthorServiceImpl() {
		dao = new AuthorDaoImpl();
	}

	public void addAuthor(Author Author) {
		dao.beginTransaction();
		dao.addAuthor(Author);
		dao.commitTransaction();
	}
	
	public void updateAuthor(Author Author) {
		dao.beginTransaction();
		dao.updateAuthor(Author);
		dao.commitTransaction();
	}
	
	
	public void removeAuthor(Author Author) {
		dao.beginTransaction();
		dao.removeAuthor(Author);
		dao.commitTransaction();
	}
	
	
	public Author findAuthorById(int id) {
		//no need of transaction, as it's an read operation
		Author Author  = dao.getAuthorById(id);
		return Author;
	}
}
