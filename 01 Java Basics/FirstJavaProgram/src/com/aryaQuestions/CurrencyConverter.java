package com.aryaQuestions;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ammount in rupee");
        double ammount = input.nextDouble();

        System.out.println("Amount in dollar is " + ammount/94.79);
    }
}
