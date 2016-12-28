package hw4;

import java.util.Scanner;

public class hw3_2 {
	
	public static void main(String[] args) {


//		int[] arr = {2, -5, 7, -4, 8};
//		int min = arr[0];
//		int imin = 0;
//		int i = 0;
//		while (i < arr.length) {
//			if (arr[i] < min) {
//				min = arr[i];
//				imin = i;
//			}
//			i++;
//		}
//		System.out.print("Minimum = " + min);
//		System.out.println(" is in " + (imin + 1) + " place");


			
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		
		int min = arr[0];
		int imin = 0;
		for (int i = 0; i < arr.length; i++) {
		System.out.println("Enter a number:");
		arr[i] = sc.nextInt();
			if (arr[i] < min) {
			min = arr[i];
			imin = i;
		}
		}
		System.out.print("Minimum = " + min);
		System.out.println(" is in " + (imin + 1) + " place");
		
		sc.close();
		}
		
	}


