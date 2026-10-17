package com.aryaLoops;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
//        for loop syntax
        /*
        for (initialisation; condition; incremenet/decrement) {
            //body
        }
         */

//        print number from 1 to 5
//        for (int num = 1; num <=5; num +=1){
//            System.out.println(num);

//        print number from 1 to n
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println(i);
        }
    }
}
