package com.cg.entity;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();

		book elecbook = new book();
		elecbook.setIsbn(13);
		elecbook.setTitle(".NET");
		elecbook.setPrice(425);

		book elecbook1 = new book();
		elecbook1.setIsbn(14);
		elecbook1.setTitle("Sql");
		elecbook1.setPrice(400);

		book elecbook2 = new book();
		elecbook2.setIsbn(15);
		elecbook2.setTitle("c#");
		elecbook2.setPrice(7000);

		book elecbook3 = new book();
		elecbook3.setIsbn(16);
		elecbook3.setTitle("Linux");
		elecbook3.setPrice(5000);

		Author firstAuthor = new Author();
		firstAuthor.setId(2110);
		firstAuthor.setName("Dhruv");

		firstAuthor.addBook(elecbook);
		firstAuthor.addBook(elecbook1);
		firstAuthor.addBook(elecbook2);

		Author SecondAuthor = new Author();
		SecondAuthor.setId(2111);
		SecondAuthor.setName("majethia");

		SecondAuthor.addBook(elecbook);
		SecondAuthor.addBook(elecbook1);
		SecondAuthor.addBook(elecbook2);

		em.persist(firstAuthor);
		em.persist(SecondAuthor);

		System.out
				.println("Added authors along with book details to database.");

		em.getTransaction().commit();
		em.close();
		factory.close();

	}

}
