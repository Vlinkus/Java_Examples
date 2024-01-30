package main.patterns.solid.singleResponsibility;

import java.util.Arrays;

public class TextPrinter {
	/**
	 *  TextEditor_TwoResponsibilities have only one responsibility: printing the text.
	 */
	TextEditor textEditor;

	public TextPrinter(TextEditor textEditor) {
		this.textEditor = textEditor;
	}
	
	public void printText() {
        System.out.println(textEditor.getText());
    }
	
	public void printTextToUpperCase() {
        System.out.println(textEditor.getText().toUpperCase());
    }
	
	public void printOutEachWordOfText() {
		System.out.println(Arrays.toString(textEditor.getText().split(" ")));
	}

}
