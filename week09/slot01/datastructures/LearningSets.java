package week09.slot01.datastructures;

import java.util.*;

public class LearningSets {

	public static void main(String[] args) {
//		HashSet<String> icNumber = new HashSet<String>();
//		LinkedHashSet<String> icNumber = 
//				new LinkedHashSet<String>();
		TreeSet<String> icNumber = new TreeSet<String>();
		
		icNumber.add("51345678");
		icNumber.add("00123456");
		icNumber.add("00123456");
		icNumber.add("01987654");
		System.out.println(icNumber);
		
		System.out.println(icNumber.contains("00123456"));
		System.out.println(icNumber.contains("01123456"));
		
		icNumber.remove("00123456");
		System.out.println(icNumber);
		
		for(String e : icNumber) {
			System.out.println(e);
		}
	}
	
}
