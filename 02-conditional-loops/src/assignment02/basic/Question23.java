/*
Author: Animesh Kumar
Date: 08/02/2023 (DD/MM/YYYY)
Purpose: Learning conditionals and loops
Status: Completed successfully
Question: Input a number and print all the factors of that number (use loops).
*/
// struggle with the algorithm part, how to build the factor logic but did it at last...:)

package assignment02.basic;

import java.util.Scanner;

public class Question23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        int count = 0;
        int divisor = 1;

        while (divisor <= n) {

            int factor = n % divisor;

            if (factor == 0) {
                System.out.print(divisor + " ");
                count++;
                divisor++;
            } else {
                divisor++;
            }
        }
    }
}
