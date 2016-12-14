package homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.*;

public class PerimeterAndArea {
	public static void main(String [] args) throws IOException{
		
	BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
	
	 System.out.println("Enter radius: ");
	 double rad = Double.parseDouble(br.readLine());
	 
	 System.out.println("Perimeter: ");
	double perimeter = 2 * PI * rad;
	System.out.println(perimeter);
	
	System.out.println("Area: ");
	double area = PI * Math.pow(rad,2);
	System.out.println(area);
	
	}
}

