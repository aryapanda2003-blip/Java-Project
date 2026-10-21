package com.aryaQuestions;
import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = input.nextLine();

        String reverse = new StringBuilder(str).reverse().toString();

        System.out.println(str.equals(reverse) );
    }
}
