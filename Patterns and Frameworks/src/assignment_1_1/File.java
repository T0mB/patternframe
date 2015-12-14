package assignment_1_1;

public class File {
	private String naam;

	public File() {

	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public void saveFile(String type, String naam) {
		System.out.println(naam + "." + type + " is saved");
	}
}
