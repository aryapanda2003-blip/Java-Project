package com.aryaLoops;

import java.util.Scanner;

public class ReverseNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println("You entered: " + num);

        int reverse = 0;

        while(num != 0){
            reverse = reverse * 10 + (num%10);
            num = num/10;
        }

        System.out.println("Reversed number: " + reverse);
    }
}
