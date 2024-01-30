package main.patterns.solid.interfaceSegregation;

public class OfficePrinter implements PrinterInterface, ScannerInterface, FaxInterface {
	/**
	 * OfficePrinter is implementing fax, print, scan and copy methods because OfficePrinter can perform all tasks.
	 */
	@Override
	public void fax(String text, int number) {
		System.out.println("Sending "+text+" to Fax Number: "+ number);	
	}

	@Override
	public void print(String text) {
		System.out.println("Printing "+text);
	}

	@Override
	public void copy() {
		System.out.println("Copying document...");
	}

	@Override
	public void scan() {
		System.out.println("Scanning document...");
	}

}
