package com.bridgelabz.logicalprogram;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        //Variable Declaration and Flag variable setup
        int n, temp=1;

        //Scanner Object Created for User Input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Any Number :");
        n = sc.nextInt();

        //if value of n is not 1 then check for the prime no because 1 is already prime
        if(n != 1) {
            for(int i = 2; i <= n-1; i++) {
                if(n % i == 0) {
                    temp = 0;
                    break;
                }
            }
        }

        //Checking for the Flag Variable Value is match or not
        if(temp == 1) {
            System.out.println(n+" is Prime Number");
        } else {
            System.out.println(n+" is Not Prime Number");
        }
    }
}
