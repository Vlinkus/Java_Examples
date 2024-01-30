package main.patterns.solid.singleResponsibility;

public class TextEditor_TwoResponsibilities {
	/**
	 *  TextEditor_TwoResponsibilities have two responsibilities: manipulating and printing the text.
	 */
	
	private String text;

	public TextEditor_TwoResponsibilities(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public String findWordAndDelete(String word) {
        text = text.contains(word) ? text.replaceAll(word, "") : text;
        return text;
    }
	
	public void appendText(String additionalText) {
	    text = text.concat(additionalText);
	}
	
	public void printText() {
        System.out.println(getText());
    }
	

}
