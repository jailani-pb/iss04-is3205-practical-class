package week13.slot01.fileinputoutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class WritingPlainTextFile {

	public static void main(String[] args) throws IOException {
		File myFile = new File("abc.txt");
		System.out.println("Exists?: " + myFile.exists());
		System.out.println("File?: " + myFile.isFile());
		System.out.println("Directory?: " + myFile.isDirectory());
		System.out.println("AbsolutePath: " + myFile.getAbsolutePath());
		System.out.println("LastModified: " 
					+ new Date(myFile.lastModified()));
		System.out.println("FileName: " + myFile.getName());
		
		// true to append, false to overwrite
		FileWriter fileWriter = new FileWriter(myFile, false);
		PrintWriter write = new PrintWriter(fileWriter);
		write.println("abc");
		write.println("123");
		write.close();
	}
	
}
