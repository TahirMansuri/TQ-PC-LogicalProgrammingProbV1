package com.bridgelabz.logicalprogram;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        //Variable Declaration
        int a=0, b=1, c=0;

        //Scanner Object to take Input from User
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Level Number for Fibonacci Series :");
        int level = sc.nextByte();

        //Display the initial a and b values for series
        System.out.println(a +"\n"+ b);

        //Repeat the loop till the Level not reached
        for(int i=1; i <= level; i++) {
            //generate the next number for series by adding last 2 numbers
            c = a + b;
            System.out.println(c);
            //swp the numbers for generating next series number
            a = b;
            b = c;
        }
    }
}
