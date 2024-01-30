package main.patterns.solid.openClose;

public class NewBook extends OldBook{
	
	private String description;
	private String genre;

	public NewBook(String name, String author) {
		super(name, author);
	}

	public NewBook(String name, String author, String description, String genre) {
		super(name, author);
		this.description = description;
		this.genre = genre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
}
