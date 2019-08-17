package week06.slot02.abstraction;

public class Circle extends Shape2D implements Clickable {

	private double radius;
	
	public Circle(String colour, double radius) {
		super(colour);
		setRadius(radius);
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
		if(this.radius < 0) {
			this.radius = 0;
		}
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	public double getPerimeter() {
		return Math.PI * radius * 2;
	}

	@Override
	public void click() {
		System.out.println("Circle colour, " + this.getColour()
				+ " with radius, " + this.radius + " is clicked.");
	}
}
