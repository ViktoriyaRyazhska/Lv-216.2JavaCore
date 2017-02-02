import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * @author Masha
 * The user name can be 3 to 15 characters of the Latin alphabet, 
 * numbers, and underscores. Using regular expressions implement 
 * checking the user name for validity. Input five names 
 * in the main method . Output a message to the console of the 
 * validation of each of the entered names.
 */

public class Task3 {
	
	public static boolean checkWithRegExp(String userNameString){
		Pattern p = Pattern.compile("^[a-z0-9_-]{3,15}$");
		Matcher m = p.matcher(userNameString);
		return m.matches();
	}
	
	public static void main(String[] args) {
		String[] names = new String[5];
		System.out.println("Input 5 user names: ");
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < names.length; i++){
			names[i] = sc.nextLine();
		}
		for(int i = 0; i < names.length; i++){
			if(checkWithRegExp(names[i])){
				System.out.println(names[i] + " is OK");
			}else {
				System.out.println(names[i] + " is WRONG");
			}
		}
		
		sc.close();
		
	}

}
