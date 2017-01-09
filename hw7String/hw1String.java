package hwString;

import java.util.Scanner;

public class hw1String {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentence of five words : ");
		String s = sc.nextLine();
		String[] arr = s.split(" ");
		StringBuilder input = new StringBuilder();	//using StringBuilder
		input.append(arr[1]);	//using StringBuilder
		input = input.reverse();	//using StringBuilder
		int longest = arr[0].length();
		int ind = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > longest) {
				longest = arr[i].length();
				ind = i;
			}

		}
	
		System.out.println("The longest word is : " + arr[ind]);
		System.out.println("The length of it is : " + longest);
		for (int i = 0; i < input.length(); i++) //using StringBuilder
			System.out.print(input.charAt(i));	//using StringBuilder
		sc.close();
	}

}
