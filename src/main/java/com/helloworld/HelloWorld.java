package com.helloworld;

public class HelloWorld {
    public static void main(String[] args) {


        String name = (args.length > 0) ? args[0] : "World";
        System.out.println("Hello " + name + "!");

        if (args.length > 0) {
            System.out.println("Hello " + args[0] + "!");
        } else {
            System.out.println("Hello World");
        }


    }
}
