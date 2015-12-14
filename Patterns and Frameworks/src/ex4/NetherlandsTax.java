package ex4;

public class NetherlandsTax extends Tax {
	
	private static NetherlandsTax nlInstance = new NetherlandsTax();
	
	private NetherlandsTax() {
		setTax(21);
	}
	
	public static NetherlandsTax getInstance(){
		return  nlInstance;
	}

	public int taxRule() {
		int taxCalc = 1 + (getTax() / 100);
		return taxCalc;
	}

}
