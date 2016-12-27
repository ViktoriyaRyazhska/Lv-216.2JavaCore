package homework4;

import java.util.Scanner;

public class NumberOfDays {

	public static void main(String[] args) {
		int month_days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String month_names[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		System.out.println("Enter the number of month:");
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < month_days.length; i++) {
			for (int j = 0; j < month_names.length; j++) {
				if (n == i + 1 && n == j + 1) {
					System.out.println(month_names[j] + " has a " + month_days[i] + " days");
				}
			}
		}
		sc.close();
	}

}
