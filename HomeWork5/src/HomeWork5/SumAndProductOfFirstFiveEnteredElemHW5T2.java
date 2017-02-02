package HomeWork5;

import java.util.Scanner;

/**
 * @author Masha
 * HomeWork 5 Task 2.
 * Enter 10 integer numbers. Calculate the sum of first 5 elements 
 * if they are positive or product of last 5 element in the other case.
 */
public class SumAndProductOfFirstFiveEnteredElemHW5T2 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		int sum_five_elements = 0;
		int product_Last_five_elements = 1;
		int[] array = new int[10];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input 10 integer numbers: ");
		
		for (int i = 0; i < 10; i++) {
			array[i] = Integer.parseInt(sc.nextLine());
			if(i <= 5){
				sum = sum + array[i];
			}
		}
		if(sum >= 0){
			for(int i = 0; i <= 4; i++){
				sum_five_elements = sum_five_elements + array[i];
			}
			System.out.println("The sum of of first 5 elements: " + sum_five_elements);
		}else if(sum < 0) {
			for(int i = 5; i < 10; i++){
				product_Last_five_elements = product_Last_five_elements*array[i];
			}
			System.out.println("The product of last 5 element: " + product_Last_five_elements);
		}
		
		sc.close();
	}
}
