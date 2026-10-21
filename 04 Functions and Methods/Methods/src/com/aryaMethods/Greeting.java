package com.aryaMethods;

public class Greeting {
    static void main(String[] args) {
        System.out.println(printPersonalizeGreeting("arya"));
        System.out.println(printGreeting());


    }

    static String printPersonalizeGreeting(String name){
        return "Hello, " + name + "!";
    }

    static String printGreeting() {
        String greeting = "how  are you?";
        return greeting;
    }
}
