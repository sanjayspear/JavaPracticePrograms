package org.launchCode.javaStrings;

public class StringPrograms {
    public static void main(String[] args) {
        /* Write a Java program to get the character at the given index within the String.
        *
        * Sample Output:
        *
        * Original String = Java Exercises!
          The character at position 0 is J
          The character at position 10 is i
        * */

        //Approach 1
        String str = "Java Exercises!";
        char[] charArr = str.toCharArray();
        char x = charArr[0];
        char y = charArr[10];

        System.out.println("The character at position 0 is " + x);
        System.out.println("The character at position 10 is " + y);
        System.out.println("The character at position 10 is " + y);
        System.out.println("The character at position 10 is " + y);

        //Approach 2
        char a = str.charAt(0);
        char b = str.charAt(10);

        System.out.println("The character at position 0 is " + a);
        System.out.println("The character at position 0 is " + b);
    }
}
