import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * 
 * @author Masha
 * Implement a pattern for US currency: the first symbol "$", then any number of 
 * digits, dot and two digits after the dot. Enter the text from the console that 
 * contains several occurrences of US currency. Display all occurrences on the screen.
 */

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input 3 values of US currency: ");
		String[] currency = new String[3];
		for(int i = 0; i< 3; i++){
			currency[i] = sc.nextLine();
		}
		for(int i = 0; i< 3; i++){
			Pattern p = Pattern.compile("^\\$\\d*\\.\\d{2}$");
			Matcher m = p.matcher(currency[i]);
			System.out.println(currency[i] + " " + m.matches());
		}
		sc.close();
	}

}
