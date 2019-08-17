package week06.slot02.abstraction;

public class Square extends Shape2D implements Clickable, Movable {

	private double side;
	
	public Square(String colour, double side) {
		super(colour);
		setSide(side);
	}
	
	public double getSide() {
		return side;
	}
	
	public void setSide(double side) {
		this.side = side;
		if(this.side < 0) {
			this.side = 0;
		}
	}

	public double getArea() {
		return side * side;
	}

	public double getPerimeter() {
		return 4 * side;
	}

	@Override
	public void move() {
		System.out.println("Square colour, " + this.getColour()
				+ " with side, " + this.side + " is moved.");
	}

	@Override
	public void click() {
		System.out.println("Square colour, " + this.getColour()
			+ " with side, " + this.side + " is clicked.");
	}
	
}
