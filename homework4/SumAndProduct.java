package homework4;

import java.util.Scanner;

public class SumAndProduct {

	public static void main(String[] args) {
		System.out.println("Enter 10 numbers ");
		Scanner sc = new Scanner(System.in);
		int n[] = new int[10];

		int sum = 0;
		int product = 1;

		for (int i = 0; i < 10;i++) {
			n[i] = Integer.parseInt(sc.nextLine());
			if(n[i]>0 && i<5){
				sum+=n[i];
			
			}else if(n[i]<0 && i>5){
				product = product*n[i];
				break;
			}
		}
		
		
		System.out.println(sum);
		System.out.println(product);
				sc.close();
		
	}
}