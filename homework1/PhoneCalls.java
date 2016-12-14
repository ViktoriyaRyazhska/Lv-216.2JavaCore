package homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneCalls {
      public static void main(String [] args) throws IOException{
    		BufferedReader br = new BufferedReader(
    				new InputStreamReader(System.in));
    		System.out.println("Enter c1 ");
    		int c1 = Integer.parseInt(br.readLine());
    		System.out.println("Enter c2 ");
    		int c2 = Integer.parseInt(br.readLine());
    		System.out.println("Enter c3 ");
    		int c3 = Integer.parseInt(br.readLine());
    		
    		System.out.println("Enter t1 ");
    		int t1 = Integer.parseInt(br.readLine());
    		System.out.println("Enter t2 ");
    		int t2 = Integer.parseInt(br.readLine());
    		System.out.println("Enter t3 ");
    		int t3 = Integer.parseInt(br.readLine());
    		
    	       int count1 = c1*t1;
    	       int count2 = c2*t2;
    	       int count3 = c3*t3;
    	       int sum = count1 + count2 + count3;
    	       
    	       System.out.println("First: " + count1);
    	       System.out.println("Second: " + count2);
    	       System.out.println("Third: " + count3);
    	       System.out.println("Together " + sum);
      }
}
