package com.aryaConditionals;

public class Main {
    public static void main(String[] args){
        // Structure of condition statement
        /*
        if (condition){
            do this if condition = true
         } else {
            do this if condition is false
         }
         */

        int salary = 25_400;
//
//        if(salary >10_000){
//            salary += 2000; // similar to salary = salary + 2000
//        }else {
//            salary += 1000;
//        }
//
//        System.out.println(salary);

//        multiple if-else
        if(salary > 20_000){
            salary += 3000;
        }else if (salary > 10_000){
            salary += 2000;
        }else {
            salary += 1000;
        }
        System.out.println(salary);

    }
}
