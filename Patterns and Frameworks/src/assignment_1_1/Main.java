package assignment_1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		Format format = new Format();
		File file = new File();

		format.createType("Word '97");
		format.createType("XML");
		format.createType("RTF");
		format.createType("HTML");
		format.createType("txt");

		format.print();

		
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Naam bestand? ");
		String naam = br.readLine();
		System.out.print("Opslaan als type? ");
		String type = br.readLine();
		
		file.saveFile(type, naam);
	}
}
