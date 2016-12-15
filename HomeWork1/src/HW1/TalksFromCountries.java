package HW1;

import java.util.Scanner;
/**
 * Created by Masha on 11.12.2016.
 */
public class TalksFromCountries {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int [] callUnits = new int [3];
        int [] time = new int [3];
        int [] prise = new int [3];

        System.out.println("Enter Units for three Country: ");
        for(int i = 0; i < callUnits.length; i++){
            callUnits[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.println("Enter Talk's durations: ");
        for(int i = 0; i < time.length; i++){
            time[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.println("Prises: ");
        int sum = 0;
        for(int j = 0; j < prise.length; j++){
            prise[j] = callUnits[j] * time[j];
            System.out.print(prise[j] + " ");
            sum = sum + prise[j];
        }
        System.out.println("\n" + "The Sum of all Prises = " + sum);
    }
}
