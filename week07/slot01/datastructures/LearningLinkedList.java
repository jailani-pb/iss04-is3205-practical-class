package week07.slot01.datastructures;

import java.util.LinkedList;
import java.util.ListIterator;

public class LearningLinkedList {

	public static void main(String[] args) {
		LinkedList<String> nameList = new LinkedList<String>();
		
		nameList.addLast("A");
		nameList.addLast("B");
		nameList.addFirst("C");
		
		System.out.println(nameList);
		
		ListIterator<String> listIterator = nameList.listIterator();
		
		System.out.println(listIterator.next());
		System.out.println(listIterator.next());
		System.out.println(listIterator.next());
//		System.out.println(listIterator.next());
		if(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		
		listIterator.next();
		listIterator.next();
		
		listIterator.add("D");
		System.out.println(nameList);
		
		System.out.println(listIterator.next());
		listIterator.remove();
		System.out.println(nameList);
		// list iterator has to traverse a data
		// before removing data
//		listIterator.remove();
		
		listIterator.previous();
		listIterator.previous();
		
		listIterator.set("F");
		System.out.println(nameList);
		
		nameList.add(1, "G");
		System.out.println(nameList);
		
		nameList.remove(2);
		System.out.println(nameList);
		
		nameList.set(2, "H");
		System.out.println(nameList);
	}
	
}







