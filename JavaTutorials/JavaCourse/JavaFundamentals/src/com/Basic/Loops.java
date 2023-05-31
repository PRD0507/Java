package com.Basic;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the loop");
        int n = input.nextInt();

        for(int i=0; i<n; i++){
            System.out.println("i = "+ i);
        }
    }
}
