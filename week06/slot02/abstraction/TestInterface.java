package week06.slot02.abstraction;

public class TestInterface {

	public static void main(String[] args) {
		Clickable clickableObject = new Picture("myPicture.jpg");
		clickableObject.click();
		clickableObject = new Circle("RED", 5.4);
		clickableObject.click();
		clickableObject = new Square("BLUE", 10.1);
		clickableObject.click();
		
		// Rectangle does not implement Clickable,
		// Cannot assign to clickableObject variable.
//		clickableObject = new Rectangle("GREEN", 10.2, 1.2);
		
		Movable movableObject = new Picture("mySelfie.jpg");
		movableObject.move();
		movableObject = new Rectangle("GREEN", 10.2, 1.2);
		movableObject.move();
	}
	
}
