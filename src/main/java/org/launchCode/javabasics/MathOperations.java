package org.launchCode.javabasics;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        /*
         * Write a Java program to print the result of the following operations.
         */

        System.out.println(-5 + 8 * 6);
        System.out.println((55 + 9 % 9));
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int a = sc.nextInt();
        System.out.println("Again enter any number5");
        int b = sc.nextInt();
        int product = a * b;
        int sum = a + b;
        int substract = a - b;
        int division = a / b;
        int mod = a % b;

        System.out.println("Product of two number:: " + product);
        System.out.println("Sum of two number:: " + sum);
        System.out.println("Subtraction of two number:: " + substract);
        System.out.println("Division of two number:: " + division);
        System.out.println("Modulo of two number:: " + mod);

        //Multiplication table
        System.out.println("Enter any number to obtain multiplication table up to 10");
        int number = sc.nextInt();
        System.out.println(number+" tables up to 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number +" x "+i+" = "+number*i);
        }

    }
}
