package com.aryaQuestions;

import java.util.Scanner;

public class PrintGreetings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Hello " + name);
    }
}
