package HW1;

import java.util.Scanner;
/**
 * Created by Masha on 11.12.2016.
 */
public class WhatIsYourName {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("Where are you live, " + name + "? ");
        String addr = sc.nextLine();
        System.out.println("Your name is " + name + ". Your address is " + addr);
    }
}
