package homework3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinMax {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a: ");
		int a = Integer.parseInt(br.readLine());

		System.out.println("Enter b: ");
		int b = Integer.parseInt(br.readLine());

		System.out.println("Enter c: ");
		int c = Integer.parseInt(br.readLine());

		if (a > b)
			if (a > c) {
				System.out.println("a  max number");
			}
		if (b > a)
			if (b > c) {
				System.out.println("b max number");
			}
		if (c > a)
			if (c > b) {
				System.out.println("c max number");
			}
		if (a < b)
			if (a < c) {
				System.out.println("a  min number");
			}
		if (b < a)
			if (b < c) {
				System.out.println("b  min number");
			}
		if (c < a)
			if (c < b) {
				System.out.println("c  min number");
			}

	}

}
