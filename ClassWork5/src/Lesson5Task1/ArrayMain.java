package Lesson5Task1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMain {

	public static void main(String[] args) {
		int[] arr1 = new int[10];
		System.out.println("Input element of array (integer value)");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			arr1[i] = Integer.parseInt(sc.nextLine());
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println("############################");
		ArrayL5T1 array1 = new ArrayL5T1(arr1);
		//ArrayL5T1 array1 = new ArrayL5T1();
		System.out.println("The Max element of Array " + array1.maxElementOfArray());
		System.out.println("The sum of positive numbers in the array: " 
				+ array1.sumPositiveElementsOfArray());
		System.out.println("The amount of negative numbers in the array: " 
				+ array1.amountOfNegativeElementsOfArray());
		System.out.println("Is more " + array1.morePositiveElementsOrNegative()+ " elements.");
		sc.close();
	}

}
