package com.aryaSwitch;

import java.util.Scanner;

public class WeekendFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of days to find it is an weekday or weekend");
        int days = input.nextInt();

        switch (days){
            case 1, 2,3, 4, 5 -> System.out.println("Week Days");
            case 6,7 -> System.out.println("Weekend Days");
            default -> System.out.println("Invalid Input");
        }
    }
}
