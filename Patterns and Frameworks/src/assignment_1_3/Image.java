package assignment_1_3;

public class Image {
	public int width, height, oriWidth, oriHeight;
	public String name;
	
	public Image(int width, int height, String name) {
		this.width = width;
		this.oriWidth = width;
		this.height = height;
		this.oriHeight = height;
		this.name = name;
	}

	public void shrink() {
		width = width/2;
		height = height/2;
		System.out.println("The " + name + " image is shrinked with and is now " + width + "x" + height + " resolution");
	}

	public void enlarge() {
		width = width*2;
		height = height*2;
		System.out.println("The " + name + " image is enlarged with and is now " + width + "x" + height + " resolution");
	}
	
	public void restore() {
		width = oriWidth;
		height = oriHeight;
		System.out.println("The " + name + " image is set to the orignal " + width + "x" + height + " resolution");
	}

	public void show() {
		System.out.println("The " + name + " image is shown with " + width + "x" + height + " resolution");
	}
}
