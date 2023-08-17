/*
Author: Animesh Kumar
Date: 05/02/2023 (DD/MM/YYYY)
Purpose: Learning Java syntax and some conditional statements
Status: Completed successfully
Question: To calculate Fibonacci Series up to n numbers.
*/

package assignment;

import java.util.Scanner;

public class Question07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = 0;
        int b = 1;
        System.out.print("Input postion upto which to print the series: ");
        int n = input.nextInt();
        int count = 2;

        System.out.print("the series is: ");

        while (count <= n) {
            int sum;
            sum = a + b;
            a = b;
            b = sum;
            count++;
            System.out.print(sum + " ");

        }
        System.out.println("the " + n + "th fibonacci number is: " + b);

    }
}
// why does it not start from 0? it starts with 1. If you're reading this please
// help by creating a pull request. Thank you!
