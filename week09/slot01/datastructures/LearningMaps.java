package week09.slot01.datastructures;

import java.util.*;

public class LearningMaps {

	public static void main(String[] args) {
		HashMap<String, String> students =
				new HashMap<String, String>();
//		LinkedHashMap<String, String> students =
//				new LinkedHashMap<String, String>();
//		TreeMap<String, String> students =
//				new TreeMap<String, String>();
		
		students.put("01765432", "Abdul");
		students.put("01327777", "Rahman");
		students.put("00123789", "Jailani");
		students.put("51233445", "Mohammad");
		System.out.println(students);
		
		if(!students.containsKey("51233445")) {
			students.put("51233445", "Md");
			System.out.println(students);
		}
		
		students.put("51888999", "Jailani");
		System.out.println(students);
		
		System.out.println(students.get("01765432"));
		
		students.remove("51888999");
		System.out.println(students);
		
		students.remove("51233445", "Mohd");
		System.out.println(students);
		
		students.replace("01765432", "Abd");
		System.out.println(students);
		
		students.replace("01765987", "Abd");
		System.out.println(students);
		
		students.replace("00123789", "Jai", "Haji");
		System.out.println(students);
		
		System.out.println(students.keySet());
		System.out.println(students.values());
	}
	
}





