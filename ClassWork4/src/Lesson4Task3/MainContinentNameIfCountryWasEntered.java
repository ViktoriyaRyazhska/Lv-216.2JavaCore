package Lesson4Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author MariaBzhezovska
 * Lesson 4 Task 3.
 * Enter the name of the country. Print the name of the continent. 
 * (Declare enum with names of continents)
 */

public class MainContinentNameIfCountryWasEntered {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
	               new InputStreamReader(System.in));
		System.out.println("Enter the name of the country: ");
		String country = br.readLine();
		switch(country){
		case "Egypt": case "Giunea": case "Mali":
			System.out.println("The continent is " + Continent.AFRICA + "."); break;
		case "India": case "China": case "Laos":
			System.out.println("The continent is " + Continent.ASIA + "."); break;
		case "Croatia": case "Ukraine": case "Poland":
			System.out.println("The continent is " + Continent.EUROPE + "."); break;
		case "Canada": case "Cuba": case "Jamaica":
			System.out.println("The continent is " + Continent.NORTH_AMERICA + "."); break;
		case "Australia": case "Kiribati": case "Tuvalu":
			System.out.println("The continent is " + Continent.OCEANIA + "."); break;
		case "Argentina": case "Bolivia": case "Brazil":
			System.out.println("The continent is " + Continent.SOUTH_AMERICA + "."); break;
		default: System.out.println("Wrong country!"); break;
		}
	}

}
