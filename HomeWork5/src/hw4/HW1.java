package hw4;

import java.util.Scanner;

public class HW1 {
	


public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int [] monthsDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	int month = 0;	
	do {
	System.out.println("Enter the number of month: ");
	month = sc.nextInt();
	}
	while (month <= 1 && month >= 12);
	System.out.println("The " + month + " month has " + monthsDays[month -1] + " days!");
	
	sc.close();
}
}

