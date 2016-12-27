package homework4;

import java.util.Scanner;

public class UntilFirstNegative {

	public static void main(String[] args) {
		System.out.println("Enter number ");
		Scanner sc = new Scanner(System.in);

		int product = 1;
		for (int i = 0; i < 2147483647; i++) {
			int n = Integer.parseInt(sc.nextLine());
			if (n < 0) {
				product = product*n;
				break;
			} else {
				product = product * n;
			}
			
		}
		System.out.println(product);
		sc.close();
	}

}
