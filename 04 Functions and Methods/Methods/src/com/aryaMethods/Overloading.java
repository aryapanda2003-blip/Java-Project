package com.aryaMethods;

public class Overloading {
    static void main(String[] args) {
        fun(27);
        fun("hello");
    }

    static void fun(int n) {
        System.out.println("this is the First Method");
        System.out.println(n);
    }

    static void fun(String hello) {
        System.out.println("this is the Second Method");
        System.out.println(hello);
    }
}
