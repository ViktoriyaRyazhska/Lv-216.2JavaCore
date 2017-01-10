package homework8;

import java.util.Scanner;

public class DivideTwoNumbers {

	public static double div(double a, double b) {
		if (b == 0) {
			throw new ArithmeticException("You can't divide on zero, enter double number");
		} else {
			return a / b;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a and b");
		try {
			double a = Double.parseDouble(sc.nextLine());
			double b = Double.parseDouble(sc.nextLine());
			System.out.println(div(a, b));
		} catch (NumberFormatException e1) {
			System.err.println("Enter double numbers ");
		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());
		}
		sc.close();
	}

}
