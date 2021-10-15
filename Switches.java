package com.company;

import java.util.Scanner;

public class Switches {
    public static void main(String[] args) {
        System.out.println("Enter your choice...");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        Scanner sc = new Scanner(System.in);
        int urchoice = sc.nextInt();
        switch(urchoice)
        {
            case 1:
                System.out.println("Enter first number:");
                int numone = sc.nextInt();
                System.out.println("Enter second number:");
                int numtwo = sc.nextInt();
                System.out.println("Sum of two numbers is " + (numone + numtwo));
                break;


            case 2:
                System.out.println("Enter first number:");
                int numthree = sc.nextInt();
                System.out.println("Enter second number:");
                int numfour = sc.nextInt();
                System.out.println("Difference of two numbers is " + (numthree - numfour));
                break;


            case 3:
                System.out.println("Enter first number:");
                int numfive = sc.nextInt();
                System.out.println("Enter second number:");
                int numsix = sc.nextInt();
                System.out.println("Product of two numbers is " + (numfive * numsix));
                break;


            case 4:
                System.out.println("Enter first number:");
                int numseven = sc.nextInt();
                System.out.println("Enter second number:");
                int numeight = sc.nextInt();
                System.out.println("Division of two numbers is " + (numseven / numeight));
                break;

            default:
                System.out.println("Something went wrong :(");
                System.out.println("Try again!");
        }
    }
}