package com.bridgelabz.logicalprogram;

import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args)
    {
        //Variable Declration
        long start = 0, stop = 0;

        //Scanner object for user input
        Scanner sc = new Scanner(System.in);

        //Showing Stopwatch options to user
        while(true) {
            System.out.println("1. Start StopWatch \n2. Stop StopWatch \n3. Exit");

            System.out.println("Enter your Choice :");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    //Getting the Starting Time of Stopwatch from system in nanoseconds
                    start = System.nanoTime();
                    System.out.println("Start Time :" + start);
                    break;
                case 2:
                    //Calculating the Seconds to be lapsed by starting and ending time
                    stop = System.nanoTime();
                    long sec = ((stop - start) / 1000000000);
                    System.out.println("edn Time :" + stop);
                    int min = (int) sec / 60;
                    int hr = min / 60;
                    System.out.println("Elapsed Time is " + hr + ":" + min + ":" + sec);
                    break;
            }

            if(choice >= 3) {
                System.out.println("Closing the Stopwatch.");
                break;
            }
        }
    }
}
