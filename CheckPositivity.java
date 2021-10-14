package com.company;

import java.util.Scanner;

public class CheckPositivity {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("The entered number " + num + " is positive.");
        } else {
            System.out.println("The entered number " + num + " is negative.");
        }
    }
}