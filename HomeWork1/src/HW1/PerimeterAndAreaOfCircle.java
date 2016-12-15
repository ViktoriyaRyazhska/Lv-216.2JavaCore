package HW1;

import java.util.Scanner;
/**
 * Created by Masha on 10.12.2016.
 */
public class PerimeterAndAreaOfCircle {

    public static void main(String[] args) {
    	System.out.println("Enter radius of Flower bed: ");
        Scanner sc = new Scanner(System.in);
        double r = Double.parseDouble(sc.nextLine());

        System.out.println("Perimeter = " + (2*r*Math.PI));
        //Math.pow(n, b) — returns the value of the power function n of degree b,
        // Base and exponent may be real.
        System.out.println("Area = " + (Math.PI*Math.pow(r,2)));
    }
}
