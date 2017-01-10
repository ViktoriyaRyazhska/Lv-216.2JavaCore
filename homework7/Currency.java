package homework7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Currency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentence");
		String text = sc.nextLine();
		Pattern p = Pattern.compile("\\$(\\d*)(\\.\\d{2})");
		Matcher m = p.matcher(text);
		while (m.find()) {
			System.out.println(text.substring(m.start(), m.end()));
		}
		sc.close();
	}

}
