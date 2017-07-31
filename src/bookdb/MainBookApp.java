package bookdb;

import java.util.ArrayList;



public class MainBookApp {
	
	public static void main (String args[])
	{
		BookDatabase newBookDB = new BookDatabase();
		
		Book newBook = new Book();
		newBook.setSku("001");
		newBook.setAuthor("New Author");
		newBook.setTitle("Title");
		newBook.setDescription("This is a book description");
		newBook.setPrice(5.99);
		
		
		newBookDB.addBook(newBook);
		
		
		ArrayList<Book> bookList = new ArrayList<Book>();
		
		Book newBook1 = new Book();
		newBook1.set("Java1001", "Kathy Sierra and Bert Bates", "Head First Java", "Easy to read Java workbook", 47.50);
		
		Book newBook2 = new Book();
		newBook2.set("Java1002", "Bruce Eckel", "Thinking in Java", "Details about Java under the hood", 20.00);
		
		Book newBook3 = new Book();
		newBook3.set("Orcl1003", "Jeanne Boyarsky", "OCP: Oracle Certified Professional Java SE", "Everything you need to know in one place", 45.00);
		
		Book newBook4 = new Book();
		newBook4.set("Python1004", "Al Sweigart", "Automate the Boring Stuff with Python", "Fun with Python", 10.50);
		
		Book newBook5 = new Book();
		newBook5.set("Zombie1005", "Simon Monk", "The Maker's Guide to the Zombie Apocalypse", "Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi", 16.50);
		
		Book newBook6 = new Book();
		newBook6.set("Rasp1006", "Donald Norris", "Raspberry Pi Projects for the Evil Genius", "A dozen fiendishly fun projects for the Raspberry Pi!", 14.75);
		
		bookList.add(newBook1);
		bookList.add(newBook2);
		bookList.add(newBook3);
		bookList.add(newBook4);
		bookList.add(newBook5);
		bookList.add(newBook6);
		
		return bookList;
		
		
	}
	
	

}
