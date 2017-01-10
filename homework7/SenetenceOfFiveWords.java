package homework7;

import java.util.Scanner;

public class SenetenceOfFiveWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentence");
		String string = sc.nextLine();
		String[] arr = string.split(" ");
		for (String s : arr) {
			// System.out.println(s);
		}
		int max = arr[0].length();
		int imax = 0;
		int i = 0;
		while (i < arr.length) {
			if (arr[i].length() > max) {
				max = arr[i].length();
				imax = i;
			}
			i++;
		}
		System.out.println("Longest word in sentence " + arr[imax]);
		System.out.println("Quantity of letters " + max);

		System.out.println();
		StringBuilder sb1 = new StringBuilder(arr[1]);
		System.out.println("Second word in reverse order " + sb1.reverse());

		sc.close();
	}
}
