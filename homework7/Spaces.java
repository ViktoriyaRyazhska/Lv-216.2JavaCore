package homework7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Spaces {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentence");
		String string = sc.nextLine();
		
		String pattern = "[a-zA-z0-9]+";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(string);
		
		while (m.find()) {
			System.out.print(string.substring(m.start(), m.end()) + " ");
		}
		sc.close();
	}

}
