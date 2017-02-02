package Lesson4Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Maria Bzhezovska
 * Lesson_4 Task 1. 
 * Enter three numbers. Find out how many of them are odd.
 */
public class OddOfThreeEnteredNumbers {
	
	private static boolean isOdd(int number){
		if((number%2) == 0){
			return false;
		}else return true;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
	               new InputStreamReader(System.in));
		System.out.println("Enter three numbers");
		
		int [] arrayOfNumber = new int [3];
		for(int i = 0; i< arrayOfNumber.length; i++){
			arrayOfNumber[i] = Integer.parseInt(br.readLine());
		}
		int oddCounter = 0;
		for(int i = 0; i< arrayOfNumber.length; i++){
			if(isOdd(arrayOfNumber[i]) == true){
				oddCounter++;
			}
		}
		if(oddCounter == 0){
			System.out.println("There is no entered Odd numbers!");
		}else System.out.println("Odd numbers count = " + oddCounter);
	}
}
