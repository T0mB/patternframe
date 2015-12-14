package assignment_1_1;

import java.util.ArrayList;

public class Format {
	private ArrayList<String> type = new ArrayList<String>();
	
	public Format() {
		
	}

	public void createType(String t) {
		type.add(t.toLowerCase());
	}
	
	public void deleteType(String t) {
		for (int i = 0; i < type.size(); i += 1) {
			if(type.get(i).equals(t.toLowerCase())) {
				type.remove(i);
			}
		}
	}
	
	public String getType(int i) {
		return type.get(i);
	}
	
	public void print() {
		for (int i = 0; i < type.size(); i += 1) {
			System.out.println(type.get(i));
		}
	}
}
