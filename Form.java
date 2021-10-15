package com.company;

import java.util.Scanner;

public class Form {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email:");
        String email = sc.nextLine();
        System.out.println("Enter your password:");
        String password = sc.nextLine();
        System.out.println("email: " + email + ", ");
        System.out.println("password: " + password);
    }
}