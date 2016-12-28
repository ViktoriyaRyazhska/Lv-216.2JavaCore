package hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		Car []car = new Car[4];
		Scanner input = new Scanner(System.in);
		
		car[0] = new Car("Ford",1995,2.0 );
		car[1] = new Car("Lanos",2016,1.5 );
		car[2] = new Car("BMW",2010,3.0 );
		car[3] = new Car("Mercedes",2012,2.5 );
		
		modelSearchByYear(car, input);
		sort(car);
	}

	private static void sort(Car[] car) {
		Car tmp;
		for(int i = 0; i < car.length-1;i++){					
			for(int j = i + 1; j < car.length;j++){			
				if(car[i].getYear() < car[j].getYear()){
					tmp = car[i];
					car[i] = car[j];
					car[j] = tmp;
				}
			}
		}
		System.out.println("Sort : " + Arrays.toString(car));
		
	}

	private static void modelSearchByYear(Car[] car, Scanner scn) {
		System.out.println("Input year");
		int year = Integer.parseInt(scn.nextLine());
		
		for(int i = 0;i<car.length;i++){
			if(car[i].getYear()==year){
				System.out.println(car[i]);
			}
		}

	}

}
