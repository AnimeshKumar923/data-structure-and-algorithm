/*
Author: Animesh Kumar
Date: 31/03/2023 (DD/MM/YYYY)
Purpose: Learning conditionals and loops
Status: Completed successfully
Question: Sum Of A Digits Of Number
*/

package assignment02.intermediate;

import java.util.Scanner;

public class Question24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = in.nextInt();
        int temp = num1;
        int sum = 0;
        int res;

        while (temp > 0) {
            res = temp % 10;
            sum = sum + res;
            temp = temp / 10;
        }
        System.out.println("Sum = " + sum);

    }
}
