package com.aryaConditionals;

import java.util.Scanner;

public class AlphabetCaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);

        if(ch >= 65 && ch <= 90){
            System.out.println("uppercase letter");
        }else if (ch >= 97 && ch <= 122){
            System.out.println("lowercase letter");
        }else {
            System.out.println("invalid letter");
        }
    }
}
