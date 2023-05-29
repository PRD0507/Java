package com.prasad;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("Enter the Roll No");
        Scanner input = new Scanner(System.in);
        int rollNo = input.nextInt();
        System.out.println("Your Roll No is " + rollNo);

    }
}