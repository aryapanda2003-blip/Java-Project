package com.aryaQuestions;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("Enter another number: ");
        int number2 = input.nextInt();

        System.out.println("Largest number is: " + Math.max(number,number2));
    }
}
