package HomeWork5;

import java.util.Scanner;

/**
 * @author Masha
 * HomeWork 5 Task 3.
 * Enter 5 integer numbers. Find position of second positive number 
 * and find minimum and its position in the array.
 */

public class PositionSecondNumberInArrayHW5T3 {

	public static void main(String[] args) {
		
		int[] array = new int[5];
		int count = 0;
		int position = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input 5 integer numbers: ");
		
		for (int i = 0; i < 5; i++) {
			array[i] = Integer.parseInt(sc.nextLine());
			if((array[i] >= 0)&&(count < 2)){
				count++;
			}
			if(count == 2){
				count ++;
				position = i+1;
			}
		}
		if(count<2){
			System.out.println("There is no 2 positive elements in array!");
		}else System.out.println("Position of second positive number: " + position);
		
		int min = array[0];
		for (int i = 0; i < array.length; i++){
			if(min > array[i]){
				min = array[i];
				position = i + 1;
			}
		}
		System.out.println("Minimum element of array: " + min);
		System.out.println("It's position in array is: " + position);
		
		sc.close();
	}
}
