package main.patterns.solid.openClose;

public class OldBook {
	/**
	 * OldBook has only name and author
	 */
	String name;
	String author;
	public OldBook(String name, String author) {
		this.name = name;
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book " + name + ", author " + author;
	}
	
}
