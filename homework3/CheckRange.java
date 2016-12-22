package homework3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckRange {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a: ");
		float a = Float.parseFloat(br.readLine());

		System.out.println("Enter b: ");
		float b = Float.parseFloat(br.readLine());

		System.out.println("Enter c: ");
		float c = Float.parseFloat(br.readLine());

		if (a > -5) {
			if (a < 5) {
				System.out.println("a belong to the range");
			} else
				System.out.println("a don't belong to the range");
		} else
			System.out.println("a don't belong to the range");
		if (b > -5) {
			if (b < 5) {
				System.out.println("b belong to the range");
			} else
				System.out.println("b don't belong to the range");
		} else
			System.out.println("b don't belong to the range");
		if (c > -5) {
			if (c < 5) {
				System.out.println("c belong to the range");
			} else
				System.out.println("c don't belong to the range");

		} else
			System.out.println("c don't belong to the range");

		if (a > -5) {
			if (a < 5) {
				if (b > -5) {
					if (b < 5) {
						if (c > -5) {
							if (c < 5) {
								System.out.println("all numbers belong to the range");
							}
						}
					}
				}
			}
		} else
			System.out.println("all numbers don't belong to the range");

	}
}
