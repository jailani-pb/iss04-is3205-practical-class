package week09.slot01.datastructures;

import java.util.LinkedList;
import java.util.Queue;

public class LearningQueue {

	public static void main(String[] args) {
		Queue<String> commands = new LinkedList<String>();
		
		commands.offer("Typed ABC");
		commands.offer("Set Font Size 14");
		commands.offer("Set Bold");
		System.out.println(commands);
		
		System.out.println(commands.peek());
		System.out.println(commands);
		System.out.println(commands.peek());
		System.out.println(commands);
		
		System.out.println(commands.poll());
		System.out.println(commands);
		
		while(!commands.isEmpty()) {
			System.out.println(commands.poll());
		}
		System.out.println(commands);
	}
	
}
