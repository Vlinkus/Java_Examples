package main.patterns.solid.singleResponsibility;

public class TextEditor {
	/**
	 *  TextEditor_TwoResponsibilities have only one responsibility: manipulating the text.
	 */
	
	private String text;

	public TextEditor(String text) {
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
	

}
