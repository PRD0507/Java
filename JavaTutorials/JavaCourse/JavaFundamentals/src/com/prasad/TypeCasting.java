package com.prasad;

import java.util.Scanner;

public class TypeCasting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the float");
        float num = input.nextFloat();
        System.out.println(num);

        // Type Casting
        int intNumber = (int)(num);
        System.out.println(intNumber);
    }
}
