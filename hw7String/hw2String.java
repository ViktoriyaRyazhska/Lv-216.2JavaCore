package hwString;

import java.util.Scanner;

public class hw2String {
	//I    am      learning     Java   Core

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentence with more then one Spaces: ");
		String s = sc.nextLine().replaceAll("[\\s]{2,}"," ");
		System.out.println(s);
		
		sc.close();
	}

}
