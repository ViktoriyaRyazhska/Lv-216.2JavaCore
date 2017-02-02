package Task2_HW9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import Task1_HW9.MyDivException;

/**
 * @author Masha
 * Write a method readNumber(int start, int end), that read from console 
 * integer number and return it, if it is in the range [start...end]. 
 * If an invalid number or non-number text is read, the method should throw an exception. 
 * Using this method write a method main(), that has to enter 10 numbers:
 * a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100
 * 
 */
public class ReadNumberMain {
	
	public static int readNumber(int start, int end)throws InvalidNumberMyException, NumberFormatException, IOException {
		System.out.println("Input integer value from range ["+ start + ", " + end + "]: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rez;
		try{
			rez = Integer.parseInt(br.readLine());
		}catch(NumberFormatException e){
			throw e;
		}catch(IOException e){
			throw e;
		}
		if(rez < start || rez > end){
			throw new InvalidNumberMyException("Value isn't in range!");
		}
		
		return rez;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException, InvalidNumberMyException{	
		int [] array = new int[10];
		for (int i = 0; i < 10; i++){
			array[i] = readNumber(1, 100);
		}
		Arrays.sort(array);
		for(int el: array){
			System.out.println(el);
		}
	}

}
