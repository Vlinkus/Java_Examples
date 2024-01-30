package main.patterns.solid.interfaceSegregation;

public class ForcedLaserPrinter implements ToBigPrinterInterface {
	/**
	 * LaserPrinter is forced to implement fax, print and copy methods even the printer it self can not perform such actions.
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

}
