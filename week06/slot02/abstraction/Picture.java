package week06.slot02.abstraction;

public class Picture implements Clickable, Movable {

	public String fileName;
	
	public Picture(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void click() {
		System.out.println("Picture with file name, " + 
				this.fileName + " is clicked.");
	}

	@Override
	public void move() {
		System.out.println("Picture with file name, " +
				this.fileName + " is moved.");
	}
	
}
