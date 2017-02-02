package HomeWork5;

import java.util.Scanner;

/**
 * @author Masha
 * Ask user to enter the number of month. Read the value and write the 
 * amount of days in this month (create array with amount days of each month).
 */
public class AmountDaysOfEachMonthsHW5T1 {

	public static void main(String[] args) {
		int[] days_amount = {31,28,31,30,31,30,31,31,30,31,30,31}; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of month if you want to know how many days it has: ");
		int month_number = Integer.parseInt(sc.nextLine());
		if((month_number >= 1)&&(month_number <= 12)){
			System.out.println("Amount of days in this month: " + days_amount[month_number-1]);
		}else System.out.println("Wrong the number of month was entered!");
		
		sc.close();
	}

}
