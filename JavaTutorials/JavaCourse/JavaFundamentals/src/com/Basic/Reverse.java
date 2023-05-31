package com.Basic;

public class Reverse {
    public static void main(String[] args) {
        int num = 123456;

        int ans = 0;
        while(num>0){
            int digit = num % 10;
            num = num / 10;
            ans = ans * 10 + digit;
        }
        System.out.println("Reverse Number "+ ans);
    }
}
