package com.bridgelabz.logicalprogram;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        //Variable Declaration
        int n, sum=0;

        //Scanner object for user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Any Number :");
        n = sc.nextInt();

        //Repeat the loop till the number is reached
        for(int i = 1; i < n; i++) {
            //Checking for the Devisor of n
            if(n % i == 0) {
                sum = sum + i;
                System.out.println(i+" is Devisor and Sum : "+sum);
            }
        }

        //Checking for Sum of all devisor are same as given Number
        if(sum == n) {
            System.out.println(n+" is Perfect Number");
        } else {
            System.out.println(n+" is Not Perfect Number");
        }
    }
}
