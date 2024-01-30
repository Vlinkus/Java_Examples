package main.patterns.solid.openClose;

import java.util.List;

public class BookStore {
	
	List<OldBook> books;
	
	public BookStore(List<OldBook> books) {
		this.books = books;
	}
	
	public List<OldBook> getBooks() {
		return books;
	}

	public String addNewBook(OldBook book) {
		books.add(book);
		return "Added new Book: "+book.getName();
	}
	
	public String sellBook(OldBook book) {
		books.remove(book);
		return "Sold Book: "+book.getName();
	}

}
