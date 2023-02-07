/*
Author: Animesh Kumar
Date: 06/02/2023 (DD/MM/YYYY)
Purpose: Learning conditionals and loops
Status: Completed successfully
Question: Subtract the Product and Sum of Digits of an Integer
*/

package assignment02.basic;

import java.util.Scanner;

public class Question22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int n = input.nextInt();

        int sum = 0;
        int product = 1;

        while (n > 0) {
            int digit;
            digit = n % 10;
            sum = sum + digit;
            product = product * digit;
            n = n / 10;
        }

        int diff = product - sum;
        System.out.print("Difference: " + diff);
    }
}
