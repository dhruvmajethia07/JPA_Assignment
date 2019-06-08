package com.cg.jpacurd.client;

import java.util.Scanner;

import com.cg.jpacurd.entities.Author;
import com.cg.jpacurd.service.AuthorService;
import com.cg.jpacurd.service.AuthorServiceImpl;


public class Client {

	public static void main(String[] args) {
		int choice = 0;
		AuthorService service = new AuthorServiceImpl();
		//Debug this program as Debug -> Debug as Java Application
		try(Scanner sc = new Scanner(System.in))
		{
			int id;
			String fname,lname,mname,phone;
			do
				
			{
				System.out.println("1-Add Author : ");
				System.out.println("2-Update Author: ");
				System.out.println("3-Remove Author");
				System.out.println("Enter choice : ");
				choice = sc.nextInt();
				
				switch(choice)
				{
				case 1 : 
					
					System.out.println("enter Firstname");
					fname = sc.next();
					System.out.println("enter Middlename");
					mname = sc.next();
					System.out.println("enter Lastname");
					lname = sc.next();
					System.out.println("enter Phone");
					phone = sc.next();
					Author Author = new Author();
					Author.setFirstName(fname);
					Author.setMiddleName(mname);
					Author.setLastName(lname);
					Author.setPhoneNo(phone);
					service.addAuthor(Author);
					break;
				case 2 : 
					System.out.println("enter Id to update");
					id = sc.nextInt();
					Author AuthorUpdate;
					AuthorUpdate = service.findAuthorById(id);
					if(AuthorUpdate == null)
					{
						System.out.println("Author with Id " + id + " is missing ");
					}
					else
					{
						System.out.println("enter Phone");
						phone = sc.next();
						AuthorUpdate.setPhoneNo(phone);
						service.updateAuthor(AuthorUpdate);
						System.out.println("Update Successfull...");
					}
					break;
				case 3 : 
					System.out.println("enter Id to delete");
					id = sc.nextInt();
					Author AuthorDelete;
					AuthorDelete = service.findAuthorById(id);
					if(AuthorDelete == null)
					{
						System.out.println("Author with Id " + id + " is missing ");
					}
					else
					{
						service.removeAuthor(AuthorDelete);
						System.out.println("Delete Successfull...");
					}
					break;
				
				}
				System.out.println("Do you want to continue 1-yes 0-No");
				choice = sc.nextInt();
			}while(choice != 0);
		}
		
	
		
		
		System.out.println("End of program...");
		
	}
}
