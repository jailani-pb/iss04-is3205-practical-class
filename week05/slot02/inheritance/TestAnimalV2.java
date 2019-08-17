package week05.slot02.inheritance;

import week05.slot01.encapsulation.Animal;

public class TestAnimalV2 {

	public static void main(String[] args) {
		// Cannot direct access protected member
		// Animal is in different package from TestAnimalV2
//		System.out.println(Animal.noOfAnimals);
		
		Lion lion1 = new Lion("ABC");
		// Lion is a subclass of Animal
		// Lion inherits all Animal class's members
		// Lion can access all visible Animal class's members
		System.out.println(lion1.name);
		System.out.println(lion1.getHungerLevel());
		lion1.setHungerLevel(999);
		System.out.println(lion1.getHungerLevel());
		// Lion can access its own member
		System.out.println(Lion.noOfLions);
		System.out.println(lion1.hunt());
		// Lion cannot access Elephant class's member
//		System.out.println(Lion.noOfElephants);
//		System.out.println(lion1.play());
		// If you need class's members to be available to
		// every subclasses, implement them in the superclass
		System.out.println(lion1.eat()); // This is overrided in Lion
		
		Elephant elephant1 = new Elephant("DEF");
		// Elephant is a subclass of Animal
		// Elephant inherits all Animal class's members
		// Elephant can access all visible Animal class's members
		System.out.println(elephant1.name);
		System.out.println(elephant1.getHungerLevel());
		elephant1.setHungerLevel(999);
		System.out.println(elephant1.getHungerLevel());
		// Elephant can access its own member
		System.out.println(elephant1.play());
		System.out.println(Elephant.noOfElephants);
		// Elephant cannot access Lion class's member.
//		System.out.println(Elephant.noOfLions);
//		System.out.println(elephant1.hunt());
		// If you need class's members to be available to
		// every subclasses, implement them in the superclass
		System.out.println(elephant1.eat());
		// Method overloading.
		System.out.println(elephant1.eat("leaves"));
		
		System.out.println(elephant1);
		System.out.println(lion1);
	}
	
}
