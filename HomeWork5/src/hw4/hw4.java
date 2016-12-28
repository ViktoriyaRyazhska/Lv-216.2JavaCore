package hw4;

import java.util.Scanner;

public class hw4 {

	public static void main(String[] args) {
		
		
				Scanner sc = new Scanner(System.in);
				int n = 0;
				int product = 1;
				for (int i = 0; i < 5; i++) {
					System.out.println("Input number");
					n = Integer.parseInt(sc.nextLine());
					if (n < 0){
						n = i;
						break;
					}
					product *= n;
				}
				System.out.println(product);
				sc.close();
		
		
		
	}

}
