package week03.slot02;

public class TestReferenceDataType {

	public static void main(String[] args) {
		// Two types of data types
		// 1) Primitive data types
		// double, float, long, int, short, byte, boolean, char
		int x = 100;
		double y = 5.0;
		boolean isTrue = false;
		// 2) Reference data types
		// String, Scanner, Student, School, any class name.
		String name1 = "Jailani";
		String name2 = "Jailani";
		String name3 = new String("Jailani");
		System.out.println(name1 == name2);
		System.out.println(name1 == name3);
		
		School sict = new School("SICT", "School of ICT");
		School sbs = new School("SBS", "School of Engineering");
		School sse = sbs;
		System.out.println(sict);
		System.out.println(sbs);
		System.out.println(sse);
		sbs.name = "School of Business";
		System.out.println(sict);
		System.out.println(sbs);
		System.out.println(sse);
		
		sict = null;
		sse = null;
	}
	
}
