package com.aryaLoops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
//        While Loop Syntax
        /*
        initilaization;
        while (condtion){
            //body
            updation;
        }
         */

//        print number from 1 to 5
        int num = 1;

//        while (num <= 5) {
//            System.out.println(num);
//            num++;
//        }

//        print number 1 to n
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            while(num<=n){
                System.out.println(num);
                num++;
            }
    }
}
