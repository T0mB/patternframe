package ex4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskController {

	public static void main(String[] args) throws IOException {
		Tax t = NetherlandsTax.getInstance();
		SalesOrder so = new SalesOrder(t);
		
		double am = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Amount? ");
		String amount = br.readLine();
		try {
			am = Double.parseDouble(amount);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		double test = so.fill(am, t.getTax());
		System.out.println(so.makeReceipt(test));
		
	}

}
