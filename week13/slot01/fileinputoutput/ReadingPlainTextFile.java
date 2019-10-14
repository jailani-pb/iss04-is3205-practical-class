package week13.slot01.fileinputoutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingPlainTextFile {

	public static void main(String[] args) throws FileNotFoundException {
		File myFile = new File("abc.txt");
		Scanner read = new Scanner(myFile);
//		System.out.println(read.nextLine());
//		System.out.println(read.nextLine());
//		
//		if(read.hasNextLine()) {
//			System.out.println(read.nextLine());
//		}
		
		while(read.hasNextLine()) {
			System.out.println(read.nextLine());
		}
		read.close();
	}
	
}
