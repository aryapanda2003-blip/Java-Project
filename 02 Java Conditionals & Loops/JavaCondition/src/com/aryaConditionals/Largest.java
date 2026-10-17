package com.aryaConditionals;

import java.util.Scanner;

public class Largest {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int largest = a;

        if(largest<b){
            largest = b;
        }

        if(largest<c){
            largest = c;
        }

        System.out.println(largest);
    }
}
