package com.aryaQuestions;

import java.util.Scanner;

public class ArmStrongNumber {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = input.nextInt();

        System.out.println("Enter another number: ");
        int y = input.nextInt();


        for(int i = x; i <= y; i++){
            int sum =0;
            int temp =i;
            while(temp != 0){
                int rem = temp%10;
                sum += rem*rem*rem;
                temp=temp/10;
            }
            if(i == sum){
                System.out.println(i);
            }
        }
    }
}
