package week09.slot01.datastructures;

import java.util.Stack;

public class LearningStack {

	public static void main(String[] args) {
		Stack<String> commands = new Stack<String>();
		
		commands.push("Typed ABC");
		commands.push("Set Font size 14");
		commands.push("Set Bold");
		
		System.out.println(commands);
		
		System.out.println(commands.peek());
		System.out.println(commands);
		System.out.println(commands.peek());
		System.out.println(commands);
		
		System.out.println(commands.pop());
		System.out.println(commands);
		
		while(!commands.isEmpty()) {
			System.out.println(commands.pop());
		}
		System.out.println(commands);
	}
	
}
