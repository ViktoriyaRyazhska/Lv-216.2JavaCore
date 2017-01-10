package homework8;

import java.util.Arrays;
import java.util.Scanner;

public class NumbersRange {

	public static int readNumber(int start, int end) throws NewException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  number");
		try {
			int n = Integer.parseInt(sc.nextLine());
			if (n > start && n < end) {
				return n;
			}
		} catch (NumberFormatException e1) {
			System.err.println("Enter integer number");
		}
		throw new NewException("This number out of range");

	}

	public static void main(String[] args) {
		int a[] = new int[10];
		try {
			for (int i = 0; i < a.length; i++) {
				a[i] =readNumber(1, 100);
			}
			Arrays.sort(a);
			for(int j : a){
				System.out.println(j);
			}
		} catch (NewException e) {
			System.err.println(e.getMessage());
		}
	}

}
