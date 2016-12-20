package Lesson4Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Maria Bzhezovska
 * Lesson 4 Task 2. 
 * Enter the number of the day of the week. Display the name in three languages.
 */
public class DayInThreeLanguages {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
	               new InputStreamReader(System.in));
		System.out.println("Enter number of the day of week: ");
		String dayOfWeek = br.readLine();
		switch (dayOfWeek){
		case "1":
			System.out.println("Sanday " + "Неділя " + "Воскресенье"); break;
		case "2":
			System.out.println("Monday " + "Понеділок " + "Понедельник"); break;
		case "3":
			System.out.println("Tuesday " + "Вівторок " + "Вторник"); break;
		case "4":
			System.out.println("Wednesday " + "Середа " + "Среда"); break;
		case "5":
			System.out.println("Thursday " + "Четвер " + "Четверг"); break;
		case "6":
			System.out.println("Friday " + "П'ятниця " + "Пятница"); break;
		case"7":
			System.out.println("Saturday " + "Субота " + "Суббота"); break;
		default:
			System.out.println("The number of week is Wrong!");
		}
	}

}
