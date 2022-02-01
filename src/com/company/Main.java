package com.company;

public class Main {
    /*
     Note The CLASS HEADER above.
     Here Main is a class that is a container to hold the program.
     A Java program must have at least on class definition.
     A .java file can have many classes but only one public class.
     The class name must match the file name (before the .java).
     */

    public static void main(String[] args) {
	  /*
	   Every Java application must have a method named main.
	   Note the method header
	   The "static method" main can be thought of as a "function".
	   In Java, we use the language of "methods": static methods and "instance methods"
	   What does void mean?
	   What is String[] args?
	   We'd like to call other methods from inside main.
	   */

        //There is a newline character \n included with a println.
        System.out.println("hello World!");
        System.out.println("hello, World!");

        System.out.println(8/2);
        /* this will show the different types of floats indicated by decimals. Here are the different processes.
         * is going to get rid of the decimal.
         * This is integer division
         */
        System.out.println(7/2);
        // Make one or both numbers to do floating-point numbers
        System.out.println(7./2.);
        System.out.println(7./2);
        System.out.println(7/2.);

        System.out.println(40 * 14.25);
        /* Java is a strongly typed language.
         * Variables must be declared.
         */
        double hoursWorked = 40; // Inline initialization.
        double hourlyWage; // Declare Variables in Java!
        hourlyWage = 14.25; // Assign a value to a variable.
        System.out.println(hoursWorked * hourlyWage);
        boolean integerEntered;
        integerEntered = false;
        System.out.println(!integerEntered);
        System.out.println(true && false); // true && false = false (ex: my name is naomi, and I'm an english major)
        System.out.println(true || false); /* true || false = false (ex: my name is naomi, and I'm an english major
                                            or a comp sci major) */
        // The modulus operator(%) gives the remainder.
        System.out.println(8 % 2);
        System.out.println(13 % 12);

        // Call a method.
        isOdd(8);
        isOdd(7);

        System.out.println(isOdd2(7));
        String name = "Naomi";
        System.out.println(name);
        char initial = 'N';
        System.out.println(initial);

    }

    /** isOdd: A method to print whether a number is odd
     * @param number
     */
    public static void isOdd(int number) {
        // We can use + to concatenate (join together) two "strings".
        System.out.print("The number " + number + " is odd: " );
        System.out.println((number % 2) == 1);

    }
    public static boolean isOdd2(int number) {
        // We can use + to concatenate (join together) two "strings".
        return (number % 2) == 1;

    }
}
