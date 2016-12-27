package homework4;

import java.util.Arrays;
import java.util.Scanner;

public class PositionInArray {

	public static void main(String[] args) {
		System.out.println("Enter 5 numbers ");
		Scanner sc = new Scanner(System.in);

		int n[] = new int[5];

		for (int i = 0; i < n.length; i++) {
			n[i] = Integer.parseInt(sc.nextLine());
		}
		int pos = 0;
		int pos2 = 0;
		for (int i = 0; i < n.length; i++) {
			for (int j = i+1; j < n.length; j++) {
				if (n[i] < 0) {
					pos = i;
					i = pos - pos2;
					pos = i++;
					break;
				} else if (n[i] < 0) {
					pos2 = j;
				}
			}
		}
		System.out.println("Position " + (pos));

		// Minimum
		int min = n[0];
		int imin = 0;
		int i = 1;
		while (i < n.length) {
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
