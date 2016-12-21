package HomeWork4Task1;

import java.util.Scanner;

/**
 * @author Maria Bzhezovska
 * HomeWork 4 Task 1A.
 * Read 3 float numbers and check: are they all belong to the range [-5,5].
 */
public class BelongToRangeTaskA {
	
	static void belongToRange(float num){
		if((num >= -5)&&(num <= 5)){
			System.out.println(num + " belongs [-5;5] range.");
		}else System.out.println(num + " not belongs [-5;5] range.");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three float numbers to check:");
		float num1 = Float.parseFloat(sc.nextLine());
		float num2 = Float.parseFloat(sc.nextLine());
		float num3 = Float.parseFloat(sc.nextLine());
		belongToRange(num1);
		belongToRange(num2);
		belongToRange(num3);
		sc.close();
	}

}
