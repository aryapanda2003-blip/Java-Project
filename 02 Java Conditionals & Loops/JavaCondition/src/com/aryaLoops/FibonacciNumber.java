package com.aryaLoops;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int temp = a;
            a = b;
            b = temp + b;
        }

        System.out.println("Fibonacci number at "+ n + "th place is " + a);
    }

}
