package main.patterns.solid.interfaceSegregation;

public class LaserPrinter implements PrinterInterface {
	/**
	 * LaserPrinter is not forced to implement fax, print and copy methods. It implements only print method because it has no other functionality.
	 */

	@Override
	public void print(String text) {
		System.out.println("Printing "+text);
	}

}
