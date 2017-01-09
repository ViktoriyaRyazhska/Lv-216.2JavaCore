package hwString;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class hw3String {

	public static void main(String[] args) {
		//$10.00 $33.22 $99.99 $10001.00
		Scanner sc = new Scanner(System.in);
		Pattern pt = Pattern.compile("([$]{1}[0-9]+[.]{1}[0-9]{2})+");
		System.out.println("Enter the several occurrences of US currency with no spaces: ");
		String output = sc.nextLine();
		Matcher mt = pt.matcher(output);
		boolean ft = mt.matches();
		if (ft == true)
			System.out.println("The number(s): " + output);
		else
			System.out.println("False");
		System.out.println(" ft " + ft);
		
		
		
		
		
		sc.close();
	}

}
