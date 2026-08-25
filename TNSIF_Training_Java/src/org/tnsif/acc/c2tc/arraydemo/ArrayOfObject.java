package org.tnsif.acc.c2tc.arraydemo;

class Book
{
	String title;
	String author;
	double price;
	
	public Book(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	void display()
	{
		System.out.println("Title :" +title +"Author :" + author + "Price :"+ price );
		
	}
	
}


public class ArrayOfObject {

	public static void main(String[] args) {
		Book[] books =new Book[3];
		
		books[0]= new Book("Java ", " Vishu",1000);
		books[1]= new Book("Java ", "Indu",5000);
		books[2]= new Book("Java ", "Anusha",2500);
		
		for (Book book:books) {
		book.display();
		}

	}

}