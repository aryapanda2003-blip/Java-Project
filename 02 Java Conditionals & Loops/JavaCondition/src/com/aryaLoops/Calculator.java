package com.aryaLoops;

import java.util.Scanner;

public class Calculator {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the operator you want to perform (+,-,*,/,%)");
        System.out.println("Enter x to exit");

        char op = input.next().trim().charAt(0);

        while(op != 'x'){
            System.out.println("Enter the first number");
            int num1 = input.nextInt();
            System.out.println("Enter the second number");
            int num2 = input.nextInt();
            int result = 0;

            switch(op){
                case '+':
                    result =num1 + num2;
                    break;
                case '-':
                    result =num1 - num2;
                    break;

                case '*':
                    result =num1 * num2;
                    break;

                case '/':
                    if(num2 != 0){
                        result =num1 / num2;
                    } else {
                        System.out.println("Cannot divide by zero");
                    }

                    break;
                case '%':
                    result =num1 % num2;
                    break;
                default:
                    System.out.println("Invalid input");
            }
            System.out.println(num1 + " "+ op +" "+ num2 + " =  " + result);

            System.out.println();

            System.out.println("Enter the operator you want to perform (+,-,*,/,%)");
            System.out.println("Enter x to exit");
            op = input.next().trim().charAt(0);


        }
    }
}
