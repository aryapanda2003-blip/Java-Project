package com.aryaMethods;

import java.util.Scanner;

public class Sum {
    static void main(String[] args) {
        sum();

        System.out.println(sum3(10,20));
    }

    static void sum(){
        Scanner input = new Scanner(System.in);

        System.out.println("enter a number");
        int num1 = input.nextInt();

        System.out.println("enter another number");
        int num2 = input.nextInt();

        System.out.println("Sum is: " + (num1 + num2));

    }

    static int sum3(int a, int b){
        return a+b;
    }

    static int sum2(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int num1 = input.nextInt();
        System.out.println("enter another number");
        int num2 = input.nextInt();

        return num1 + num2;
    }
}
