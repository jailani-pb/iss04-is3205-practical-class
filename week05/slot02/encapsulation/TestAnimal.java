package week05.slot02.encapsulation;

public class TestAnimal {

	public static void main(String[] args) {
		Animal animal1 = new Animal("ABC");
		// Encapsulated instance variable, hungerLevel
		// No direct access to it from other classes
//		System.out.println(animal1.hungerLevel);
		
		// Need to go through getter and setter methods.
		System.out.println(animal1.getHungerLevel());
		animal1.setHungerLevel(999);
		System.out.println(animal1.getHungerLevel());
		// Direct access to protected member
		// Animal is in same package as TestAnimal
		System.out.println(Animal.noOfAnimals);
	}
	
}
