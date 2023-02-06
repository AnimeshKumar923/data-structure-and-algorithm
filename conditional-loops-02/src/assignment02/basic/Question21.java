/*
Author: Animesh Kumar
Date: 06/02/2023 (DD/MM/YYYY)
Purpose: Learning conditionals and loops
Status: Completed successfully (copy-paste previous program)
Question: Fibonacci Series In Java Programs
*/

package assignment02.basic;

import java.util.Scanner;

public class Question21 {
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
