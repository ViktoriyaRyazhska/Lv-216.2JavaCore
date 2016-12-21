package HomeWork4Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Masha
 * HomeWork 4 Task B.
 * Read 3 integer numbers and write max and min of them.
 */
public class MinMaxOfThreeIntegerValuesTaskB {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println ("Input three integer values to compute Max and Min of them: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a1 = Integer.parseInt(br.readLine());
		int a2 = Integer.parseInt(br.readLine());
		int a3 = Integer.parseInt(br.readLine());
		for(int i = 1; i <= 3; i++){
			if(a1 < a2){
				int tmp = a1;
				a1 = a2;
				a2 = a3;
				a3 = tmp;
			}
			if (a2 < a3){
				int tmp1 = a2;
				a2 = a3;
				a3 = tmp1;
			}
		}
		System.out.println (a1 + " " + a2 + " " + a3 + " ");
		System.out.println("The Max value of them is: " + a1);
		System.out.println("The Min value of them is: " + a3);
	}

}
