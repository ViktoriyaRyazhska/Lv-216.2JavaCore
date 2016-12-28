package hw4;


import java.util.Scanner;

public class hw2 {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int product = 1;
		for(int i = 0; i < 10; i++)	{
			System.out.println(" Enter the digit:");
			arr[i] = sc.nextInt();
			if(i < 5 && arr[i] > 0){
				sum += arr[i];
			}	
			else
			{ for(int k = 10 ; k > 5 / 2; k--);
			product *= arr[k];
			}
			}
		System.out.println(sum);
		System.out.println(product);
		
		sc.close();
		}
		
		
		
}
		
		
	


