package week03.accessmodifier;

import week03.slot02.School;

public class TestAccessModifier {

	public static void main(String[] args) {
		School sict = new School("SICTABC", "School of ICT");
		School sbs = new School("SBS", "School of Business");
//		sict.shortform = "SCT";
		System.out.println(sict);
		sict.setShortform("ABCDEFGHI");
		System.out.println(sict);
		
		week02.Student student1 = new week02.Student("123", "ABC");
		week03.slot01.Student student2 = 
				new week03.slot01.Student("456", "DEF", 2000, 'A');
	}
	
}
