package ex4;

public abstract class Tax {

	public int tax;
	
	public Tax() {
		setTax(10);
	}
	
	public int taxRule() {
		int taxCalc = 1 + (getTax() / 100);
		return taxCalc;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}
	
	
}
