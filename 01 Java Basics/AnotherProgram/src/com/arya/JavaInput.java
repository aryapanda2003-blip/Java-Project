package com.arya;

import java.util.Scanner;

public class JavaInput {
    static void main(String[] args) {
        System.out.println("Enter your rollnumber");
        Scanner sc = new Scanner(System.in);
        int rollno = sc.nextInt();
        System.out.println("Your rollnumber: " + rollno);


        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println("Your name is: " + name);

        System.out.println("Enter your marks");
        float marks = sc.nextFloat();
        System.out.println("Your marks is: " + marks);


    }
}
