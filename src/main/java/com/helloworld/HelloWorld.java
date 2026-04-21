

package com.helloworld;

public class HelloWorld {
    public static void main(String[] args) {


        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {

            StringBuilder result = new StringBuilder();

            for (String name : args) {
                result.append("Hello ").append(name).append("! ");
            }


            String output = result.toString().trim();
            output = output.substring(0, output.length());

            System.out.println(output);
        }
    }


        if (args.length == 0) {
            System.out.println("Hello, World!");


        if (args.length == 0) {
            System.out.println("Hello World!");

        } else {
            for (String name : args) {
                System.out.println("Hello " + name + "!");
            }
        }

    }
}


        String name = (args.length > 0) ? args[0] : "World";
        System.out.println("Hello " + name + "!");

        if (args.length > 0) {
            System.out.println("Hello " + args[0] + "!");
        } else {
            System.out.println("Hello World");
        }


    }

}
