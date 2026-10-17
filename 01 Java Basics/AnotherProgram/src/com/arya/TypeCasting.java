package com.arya;

import java.util.Scanner;

public class TypeCasting {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        implicit type casting
        System.out.println("Enter the number you want to cast");
        int num = sc.nextInt();
        System.out.println("Number is: " + num);

        float floatnum = num;
        System.out.println("Float is: " + floatnum);

        //Explicit type casting
        int intnum = (int)floatnum;
        System.out.println("Int is: " + intnum);
    }
}
