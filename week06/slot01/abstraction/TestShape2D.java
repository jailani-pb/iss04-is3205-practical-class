package week06.slot01.abstraction;

public class TestShape2D {

	public static void main(String[] args) {
		// Cannot create an instance of abstract class.
//		Shape2D shape1 = new Shape2D("RED");
		Circle circle1 = new Circle("RED", 10.5);
		Rectangle rectangle1 = new Rectangle("BLUE", 5.4, 3.85);
		Square square1 = new Square("GREEN", 7.8);
	}
	
}
