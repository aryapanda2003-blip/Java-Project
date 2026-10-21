package com.aryaQuestions;

import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number1");
        int number1 = input.nextInt();
        System.out.println("Enter number2");
        int number2 = input.nextInt();

        System.out.println("Enter operation (+, -, *, /)");
        char operation = input.next().trim().charAt(0);

        if (operation == '+') {
            System.out.println(number1 + " + " + number2  + " = " + (number1 + number2));
        }
        if (operation == '-') {
            System.out.println(number1 + " - " + number2  + " = " + (number1 - number2));
        }
        if (operation == '*') {
            System.out.println(number1 + " * " + number2  + " = " + (number1 * number2));
        }
        if (operation == '/') {
            if(number2 != 0) {
                System.out.println("Invalid operation!\nCan divide by zero");
            }else {
                System.out.println(number1 + " / " + number2  + " = " + (number1 / number2));
            }
        }
    }
}
