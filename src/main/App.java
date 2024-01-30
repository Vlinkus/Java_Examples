package main;

import java.util.ArrayList;
import java.util.Arrays;

import main.patterns.solid.openClose.BookStore;
import main.patterns.solid.openClose.NewBook;
import main.patterns.solid.openClose.OldBook;
import main.patterns.solid.singleResponsibility.TextEditor;
import main.patterns.solid.singleResponsibility.TextEditor_TwoResponsibilities;
import main.patterns.solid.singleResponsibility.TextPrinter;

public class App {

	public static void main(String[] args) {
		TextEditor_TwoResponsibilities txt = new TextEditor_TwoResponsibilities("Alio Valio Alio JAVA Alio");
		txt.findWordAndDelete("Alio");
		txt.printText();
		
		TextPrinter printer = new TextPrinter(new TextEditor("Solid Principles"));
		printer.printText();
		printer.printTextToUpperCase();
		printer.printOutEachWordOfText();
		
		BookStore bookStore = new BookStore(new ArrayList<>());
		OldBook oldBook1 = new OldBook("Sea", "Alice");
		OldBook oldBook2 = new OldBook("Ocean", "Bob");
		NewBook newBook = new NewBook("Lake", "Charlie", "Short Story", "Novel");
		bookStore.addNewBook(oldBook1);
		bookStore.addNewBook(oldBook2);
		bookStore.addNewBook(newBook);
		bookStore.getBooks().forEach(bk -> System.out.println(bk));
	}

}
