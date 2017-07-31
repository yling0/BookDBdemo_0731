package bookdb;

import java.util.ArrayList;

public class BookDatabase {
	ArrayList <Book> bookList;
	
	public BookDatabase ()
	{
		 this.bookList = new ArrayList<Book>();
	}
	
	public ArrayList<Book> searchByAuthor(String author){
		return new ArrayList<Book>();		
	}
	
	public ArrayList<Book> getBookList(){
		return bookList;
	}
	
	public void setBookList(ArrayList<Book> bookList){
		this.bookList = bookList;
	}
	
	public void addBook (Book bookToAdd)
	{
		bookList.add(bookToAdd);
	}
	
	

}

