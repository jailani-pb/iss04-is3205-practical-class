package week11.slot01.string.regex;

public class IntroductionToRegex {

	public static void main(String[] args) {
		String oop = "IS3205 Object Oriented Programming IS3205";
		System.out.println(oop);
		oop.replaceAll("IS3205", "######");
		System.out.println(oop);
		System.out.println(oop.replaceAll("IS3205", "######"));
		System.out.println(oop.replaceAll("O", "#"));
		System.out.println(oop.replaceAll("O", "#").replaceAll("o", "#"));
		System.out.println(oop.replaceAll("[Oo]", "#"));
		System.out.println(oop.replaceAll("[aeiouAEIOU]", "#"));
		System.out.println(oop.replaceAll("[^aeiouAEIOU]", "#"));
		System.out.println(oop.replaceAll("[aeiouAEIOU][aeiouAEIOU]", "##"));
		System.out.println(oop.replaceAll("[a-z]", "#"));
		System.out.println(oop.replaceAll("[a-zA-Z]", "#"));
		System.out.println(oop.replaceAll("[a-zA-Z0-9]", "#"));
		System.out.println(oop.replaceAll("[a-zA-Z0-9 ]", "#"));
		System.out.println(oop.replaceAll("[a-zA-Z0-9&&[^aeiouAEIOU]]", "#"));
		
		System.out.println(oop.replaceAll("^IS3205", "######"));
		System.out.println(oop.replaceAll("IS3205$", "######"));
		
		System.out.println(oop.replaceAll("[aeiouAEIOU]{2}", "##"));
		
		String abc123 = "aaaaabbbbcc11111122222333";
		System.out.println(abc123);
		System.out.println(abc123.replaceAll("b{4}", "####"));
		System.out.println(abc123.replaceAll("^a{5}b{4}", "#########"));
		
		String[] icNumbers = {"00-123456", "0F-T23UVX", "51-667890",
				"01-234567890", "00-987654", "00 345678"};
		
		for(String ic : icNumbers) {
			System.out.println(ic + ": " + ic.matches("^[0-9]{2}-[0-9]{6}$"));
		}
		
	}
	
}
