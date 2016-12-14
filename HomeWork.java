import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class HomeWork {
	
	//Task 0.2//
	/*
	public static final double MOE_PI = 3.14;
	*/

	public static void main(String[] args)throws IOException{
		
		// Task 0.0//
		/*
		BufferedReader bdr = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("Please enter the radius of the circle:");
		int r = Integer.parseInt(bdr.readLine());
		double pi = 3.14;
		double area = pi * (r * r);
		double per = 2 * pi * r;
		System.out.println("The area of circle is :" + area);
		System.out.println("The perimeter of circle is :" + per);
		*/
		
		//Task 0.1//
		/*	
		BufferedReader bdr = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("Please enter the radius of the circle:");
		double r = Double.parseDouble(bdr.readLine());
		double area = Math.PI * (Math.pow(r, 2));
		double per = 2*Math.PI * r;
		System.out.println("The area of circle is :" + area);
		System.out.println("The perimeter of circle is :" + per);
		*/
		
		//Task 0.2//
		/*
		BufferedReader bdr = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("Please enter the radius of the circle:");
		double r = Double.parseDouble(bdr.readLine());
		double area = MOE_PI * (Math.pow(r, 2));
		double per = 2*MOE_PI * r;
		System.out.println("The area of circle is :" + area);
		System.out.println("The perimeter of circle is :" + per);
		*/
		
		//Task 1.0//
		/*
		BufferedReader buf = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("What is your name?");
		String Name = buf.readLine();
		System.out.println("How old are you " + Name  + ":");
		int age = Integer.parseInt(buf.readLine());
		System.out.println("Where are you live " + " " + Name + " " + age);
		String address = buf.readLine();
		System.out.println("Your name is " + " " + Name  + " Your age: " + " " + age + " You live in " + " " + address );
		*/
		
		//Task 2.0//
		/*
		BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
		System.out.println("Enter name of the  country: ");
		String number1 = br.readLine();
		System.out.println("Enter name of the country: ");
		String number2 = br.readLine();
		System.out.println("Enter name of the country: ");
		String number3 = br.readLine();
		
		System.out.println("Countries are: " + number1 + "  " + number2 + "  " + number3 + ".");
		
		System.out.println("Enter a price for a call in Country($) " + number1);
		double c1p1 = Double.parseDouble(br.readLine());
		System.out.println("Enter a price for a call in Country ($) " + number2);
		double c2p2 = Double.parseDouble(br.readLine());
		System.out.println("Enter a price for a call in Country ($) " + number3);
		double c3p3 = Double.parseDouble(br.readLine());
		System.out.println(" Price: Country " + number1 + "- " + c1p1 + "$," + " Country " + number2 + "- " + c2p2 + "$,"+ " Country " + number3 + "- " + c3p3 + "$." );
		
		System.out.println(" Enter the time of calling in: " + number1);
		double t1 = Double.parseDouble(br.readLine());
		System.out.println(" Enter the time of calling in: " + number2);
		double t2 = Double.parseDouble(br.readLine());
		System.out.println(" Enter the time of calling in: " + number3);
		double t3 = Double.parseDouble(br.readLine());
		System.out.println(" Time of talking: Country " + number1 + "-" + t1 + "min," + " Country " + number2 + "-" + t2 + "min," + " Country " + number3 + "-" + t3 + "min," );
		
		double sum1 = c1p1 * t1;
		double sum2 = c2p2 * t2;
		double sum3 = c3p3 * t3;
		double sum4 = sum1 + sum2 +sum3;
		
		System.out.println("separetely " + number1 + " " + sum1 + " " + number2 + " " + sum2 + " " + number3 + " " + sum3 );
		System.out.println("Total: " + sum4 );
		*/		
		
	}
		
}
