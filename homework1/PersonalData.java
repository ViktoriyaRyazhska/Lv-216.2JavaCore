package homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PersonalData {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.println("What is your name? ");
		String name = br.readLine();
		
		System.out.println("How old are you? ");
		int age = Integer.parseInt(br.readLine());
      
		System.out.println("Where are you live, " + name); 
		String adress = br.readLine();
		
		System.out.println("Your name is " + name);
		System.out.println("Your age is " + age);
		System.out.println("You live  " + adress);
		
	}

}
