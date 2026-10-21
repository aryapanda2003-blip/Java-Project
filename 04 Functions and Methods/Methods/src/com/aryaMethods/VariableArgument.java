package com.aryaMethods;

public class VariableArgument {
    static void main(String[] args) {
        int sum = sum(3,2,4,5,6,7);
        System.out.println(sum);
    }

    private static int sum(int ...v) {
        // int ....v creates an array of int data type for all the arguments pass through function
        int sum = 0;
        for (int i : v) {
            sum += i;
        }
        return sum;
    }
}
