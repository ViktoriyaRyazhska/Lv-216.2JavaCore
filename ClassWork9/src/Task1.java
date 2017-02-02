import java.util.Scanner;

/**
 * 
 * @author Masha
 * Create a method for calculating the area of a rectangle int squareRectangle 
 * (int a, int b), which should throw an exception if the user enters negative 
 * value. Input values a and b from console. Check the squareRectangle method 
 * in the method main. Check to input nonnumeric value.
 * 
 */
public class Task1 {
	
	public static int squareRactangle(int a, int b) throws MyException1{
		int rez = 0;
		if((a > 0)&&(b > 0)){
			rez = a *b;
		}else {
			throw new MyException1("Some of input values is below zero!");
		}
		
		return rez;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input integer a and b: ");
		int a = 0;
		int b = 0;
		a = Integer.parseInt(sc.nextLine());
		b = Integer.parseInt(sc.nextLine());
		
		try{
			System.out.println(squareRactangle(a, b));
		}catch (MyException1 e1){
			//System.err.print(e1.getMessage()+ "\n");
			//System.err.print(e1 + "\n");
			e1.printStackTrace();
		}
		sc.close();
	}
	
}
