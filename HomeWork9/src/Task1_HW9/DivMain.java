package Task1_HW9;

import java.util.Scanner;

/**
 * @author Masha
 *Task_2_HomeWork_9: Create method div(), which calculates the dividing of two double numbers. 
 *In main method input 2 double numbers and call this method. Catch all exceptions.
 * 
 */

public class DivMain {
	
	public static double divMethod(double a, double b) throws MyDivException{
		double rez = 0;
		if (b != 0){
			rez = a/b;
		}else {
			throw new MyDivException("B value shouldn't be zero!!!");
		}
		return rez;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input double a and b: ");
		int a = 0;
		int b = 0;
		a = Integer.parseInt(sc.nextLine());
		b = Integer.parseInt(sc.nextLine());
		try{
			System.out.println(a + "/ " + b + " = " + divMethod(a, b));
		}catch (MyDivException e){
			//System.err.print(e.getMessage()+ "\n");
			//System.err.print(e + "\n");
			e.printStackTrace();
		}
		
		sc.close();
	}

}
