package com.aryaLoops;

import java.util.Scanner;

public class CountingOccurence {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        System.out.println("Enter the number to find its occurrence:");
        int occurrenceNum = sc.nextInt();

        int count =0;

        while(num > 0){
           int  digit = num %10;
           if(digit == occurrenceNum){
               count++;
           }

           num = num/10;
        }

        System.out.println("The count of occurrence is "+count);
    }
}
