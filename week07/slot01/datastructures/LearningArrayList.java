package week07.slot01.datastructures;

import java.util.ArrayList;

import week05.slot01.encapsulation.Animal;

public class LearningArrayList {

	public static void main(String[] args) {
//		// To store a list of Integers
//		ArrayList<Integer> ageList = new ArrayList<Integer>();
//		// To store a list of Animals
//		ArrayList<Animal> animalList = new ArrayList<Animal>();
		// To store a list of Strings
		ArrayList<String> nameList = new ArrayList<String>();
		System.out.println(nameList.size());
		System.out.println(nameList.isEmpty());
		System.out.println(nameList);
		
		nameList.add("A");
		System.out.println(nameList.size());
		System.out.println(nameList.isEmpty());
		System.out.println(nameList);
		
		nameList.add("B");
		nameList.add("C");
		System.out.println(nameList.size());
		System.out.println(nameList);
		
		nameList.add(0, "D");
		System.out.println(nameList);
		
		// Cannot skip an index.
		// Last data is at index 3, the next index should be 4.
//		nameList.add(5, "E");
		
		nameList.add(nameList.size()-1, "E");
		System.out.println(nameList);
		
		// Removing data using index
		nameList.remove(nameList.size()-1);
		System.out.println(nameList);
		// Removing data by specifying an object
		nameList.remove("D");
		System.out.println(nameList);
		
		nameList.set(0, "F");
		System.out.println(nameList);
		
		System.out.println(nameList.get(0));
		String tempData = nameList.get(nameList.size()-1);
		System.out.println(tempData);
		
		System.out.println(nameList);
	}
	
}




