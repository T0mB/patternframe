package ex4;

public class SalesOrder {

	protected Tax tax;

	public SalesOrder(Tax tax) {
		this.tax = tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	public double fill(double bedrag, double procent) {
		double test = procent / 100 + 1;
		double total = bedrag * test;
		return total;
	}

	public String makeReceipt(double total) {
		String receipt = "total amount after tax is: " + total;
		return receipt;
	}
}
