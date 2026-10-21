package com.aryaMethods;

public class ArmstrongNumber {
    static void main(String[] args) {
        printArmstrongNumber();
    }

    private static void printArmstrongNumber() {
        for(int i=100;i<1000;i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean isArmstrong(int i) {
        int sum = 0;
        int num = i;
        while(i!=0){
            int rem = i%10;
            i = i/10;
            sum = sum + (rem*rem*rem);
        }
        return sum==num;
    }
}
