package week11.slot01.string.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherRegex {

	public static void main(String[] args) {
		String htmlText =
				"<html>" +
				"<h1>ABC</h1>" +
				"<p>123</p>" +
				"<p>456</p>" +
				"</html>";
		System.out.println(htmlText);
		Pattern htmlPattern = Pattern.compile("(<p>.*?</p>)");
		Matcher htmlMatcher = htmlPattern.matcher(htmlText);
		
		int count = 0;
		while(htmlMatcher.find()) {
			count++;
			System.out.println(count + ": " + htmlMatcher.group(1));
		}
		System.out.println("Total Pattern Count: " + count);
	}
	
}
