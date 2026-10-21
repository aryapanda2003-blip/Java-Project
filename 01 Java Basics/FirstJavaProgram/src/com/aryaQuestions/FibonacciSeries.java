package com.aryaQuestions;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = input.nextInt();

        int a =0,b=1;

        if (number==0){
            System.out.println(a);
        }else {
            System.out.print(a + " " + b + " ");

            while (number >1) {
                System.out.print(a + b + " ");
                int temp = b;
                b = a + b;
                a = temp;
                number--;
            }
        }
    }
}
