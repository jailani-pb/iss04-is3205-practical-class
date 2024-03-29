package week05.slot02.inheritance;

import week05.slot02.encapsulation.Animal;

public class Lion extends Animal {

	protected static int noOfLions = 0;
	
	public Lion(String name) {
		super(name);
		noOfLions++;
		noOfAnimals++;
	}
	
	public String hunt() {
		return name + " is hunting.";
	}
	
	public String eat() {
		return hunt() + " It is now eating.";
	}
	
	@Override
	public String toString() {
		return "Lion: " + super.toString();
	}

}




