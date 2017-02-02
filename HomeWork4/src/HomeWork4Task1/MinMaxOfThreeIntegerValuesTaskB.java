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

	public static int maxOfThreeValues(int a1, int a2, int a3){
		int max = a1;
		if(max < a2){
			max = a2;
		}
		if(max < a3){
			max = a3;
		}
		return max;
	}
	
	public static int minOfThreeValues(int a1, int a2, int a3){
		int min = a1;
		if(min > a2){
			min = a2;
		}
		if(min > a3){
			min = a3;
		}
		return min;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println ("Input three integer values to compute Max and Min of them: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a1 = Integer.parseInt(br.readLine());
		int a2 = Integer.parseInt(br.readLine());
		int a3 = Integer.parseInt(br.readLine());
		System.out.println (a1 + " " + a2 + " " + a3 + " ");
		System.out.println("max = " + maxOfThreeValues(a1, a2, a3));
		System.out.println("min = " + minOfThreeValues(a1, a2, a3));
	}

}
