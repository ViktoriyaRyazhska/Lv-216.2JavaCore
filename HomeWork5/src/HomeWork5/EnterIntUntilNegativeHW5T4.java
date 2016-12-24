package HomeWork5;

/**
 * @author Masha
 * HomeWork 5 Task 4.
 * Organize entering integers until the first negative number. 
 * Count the product of all entered even numbers.
 */

import java.util.Scanner;

public class EnterIntUntilNegativeHW5T4 {

	public static void main(String[] args) {
		
		int product = 1;
		int count = 0;
		int even = 0;
		int number = 0;;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input integer numbers: ");
	m1:	for(int i = 1; i <= Integer.MAX_VALUE; i++){
			number = Integer.parseInt(sc.nextLine());
			even++;
			if((number >= 0)&&(even%2 == 0)){
				product = product*number;
				//even ++;
				continue m1;
			}else if(number < 0) {
				break m1;
			}
			count++;
		}
		if(count != 0){
			System.out.println("The product of even entered values = " + product);
		}else System.out.println("The product of even entered values = 0");
		
		sc.close();
	}

}
