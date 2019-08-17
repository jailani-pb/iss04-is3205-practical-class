package week06.slot01.polymorphism;

import week06.slot01.abstraction.*;

public class TestShape2D {

	public static void main(String[] args) {
		Shape2D shape1 = new Circle("RED", 10.4);
		shape1 = new Rectangle("BLUE", 8.9, 7.7);
		shape1 = new Square("GREEN", 1.1);
		
		Shape2D[] shapes = new Shape2D[10];
		shapes[0] = new Circle("RED", 10.4);
		shapes[1] = new Rectangle("BLUE", 8.9, 7.7);
		shapes[2] = new Square("GREEN", 1.1);
		System.out.println(shapes[0] + " " + shapes[0].getArea());
		System.out.println(shapes[1] + " " + shapes[1].getArea());
		System.out.println(shapes[2] + " " + shapes[2].getArea());
		
		// Need to do type casting, to run a specific class's member.
		((Circle) shapes[0]).setRadius(100.1);
		System.out.println(shapes[0] + " " + shapes[0].getArea());
		// Be careful when you do type casting
//		((Square) shapes[1]).setSide(10.1);
		
		// Use instanceof keyword to check what type of object in the index
		for(int i = 0; i < shapes.length; i++) {
			if(shapes[i] instanceof Circle) {
				((Circle) shapes[i]).setRadius(96.5);
			}
			if(shapes[i] instanceof Square) {
				((Square) shapes[i]).setSide(30.4);
			}
			if(shapes[i] instanceof Rectangle) {
				((Rectangle) shapes[i]).setLength(3.4);
				((Rectangle) shapes[i]).setHeight(8.4);
			}
			if(shapes[i] != null) {
				System.out.println(shapes[i] + " " 
							+ shapes[i].getPerimeter());
			}
		}
	}
	
}




