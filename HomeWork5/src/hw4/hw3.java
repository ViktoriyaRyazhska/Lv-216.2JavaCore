package hw4;

import java.util.Scanner;

public class hw3 {

	
		public static void main(String[] args) {

			int[] arr = new int[5];
			Scanner sc = new Scanner(System.in);
			
			for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter a number:");
			arr[i] = sc.nextInt();
			}
					
			int count = 0;
			int pos = 0;
					
			for(int i = 0; i < arr.length; i++){
				
				if (arr[i] > 0){
					pos = i;
					count++;
				if (count == 2){
					break;
				}
				}
			}
				sc.close();
				System.out.println(pos);
			}
				
			}
				