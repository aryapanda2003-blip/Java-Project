package com.aryaMethods;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Your number is " + n);

        System.out.println(isPrime(n) ? "Your number is Prime" : "Your number is not Prime");
    }

    private static boolean isPrime(int n) {
        if (n == 1) return false;
        int count = 2;
        while(count*count < n){
            if (n%count == 0) return false;
            count++;
        }
        return true;
    }
}
