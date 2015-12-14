package assignment_1_3;

public class Main {
	public static void main(String[] args) {

		Image img = new Image(1600, 800, "Tree");
		img.shrink();
		img.show();
		
		System.out.println("");
		Image img2 = new Image(250, 150, "Test");
		img2.enlarge();
		img2.show();
		
		System.out.println("");
		Image img3 = new Image(2000, 1800, "Photo");
		img3.shrink();	
		img3.show();
		img3.restore();
		img3.show();
	}
}