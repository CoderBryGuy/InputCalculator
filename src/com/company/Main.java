package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        inputThenPrintSumAndAverage();
    }

    static public void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);

        boolean hasNextInt = scanner.hasNextInt();
        int count = 0;
        int sum = 0;
        long avg = 0;

        while(true) {
            if (hasNextInt) {
                sum += scanner.nextInt();
                scanner.nextLine();
                count++;
            } else {

                break;
            }

            hasNextInt = scanner.hasNextInt();
        }

        avg = Math.round(((double) sum / count));
        System.out.println("SUM = " + sum + " AVG = " + avg);

        scanner.close();
    }
}
