/*
Author: Animesh Kumar
Date: 08/02/2023 (DD/MM/YYYY)
Purpose: Learning conditionals and loops
Status: Completed Successfully
Question: Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
*/

package assignment02.basic;

import java.util.Scanner;

public class Question24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum = 0;

        while (true) {

            System.out.println("Enter number or press 0 to exit: ");
            int n = in.nextInt();

            if (n > 0 || n < 0) {
                sum = sum + n;
            } else if (n == 0) {
                break;
            }
        }
        System.out.println("Sum: " + sum);
    }
}
