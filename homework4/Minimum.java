package homework4;

import java.util.Scanner;

public class Minimum {

	public static void main(String[] args) {
		System.out.println("Enter 5 numbers ");
		Scanner sc = new Scanner(System.in);

		int n[] = new int[5];

		for (int i = 0; i < n.length; i++) {
			n[i] = Integer.parseInt(sc.nextLine());
		}

		int min = n[0];
		int imin = 0;
		int i = 0;
		while (i < 5) {
			if (n[i] < min) {
				min = n[i];
				imin = i;
			}
			i++;
		}
		System.out.println("Minimum " + min);
		System.out.println("index of minimum " + imin);
		sc.close();
	}

}
