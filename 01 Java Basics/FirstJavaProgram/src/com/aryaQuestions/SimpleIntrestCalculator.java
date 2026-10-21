package com.aryaQuestions;

import java.util.Scanner;

public class SimpleIntrestCalculator {
    public static void main(String[] args) {
        System.out.println("Enter principal, time, and rate");
        Scanner input = new Scanner(System.in);
        double principal = input.nextDouble();
        double time = input.nextDouble();
        double rate = input.nextDouble();

        System.out.println("Simple Intrest: " + (principal * time*rate)/100 );
    }
}
