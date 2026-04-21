

package com.helloworld;

public class HelloWorld {
    public static void main(String[] args) {


        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {

            String names = String.join(", ", args);
            System.out.println("Hello " + names + "!");
        }

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

