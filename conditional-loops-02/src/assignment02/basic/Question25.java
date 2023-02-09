/*
Author: Animesh Kumar
Date: 09/02/2023 (DD/MM/YYYY)
Purpose: Learning conditionals and loops
Status: Completed Succesfully
Question: Take integer inputs till the user enters 0 and print the largest number from all.
*/

package assignment02.basic;

import java.util.Scanner;

public class Question25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = 0;

        while (true) {

            System.out.println("Enter number or press 0 to exit: ");
            int n = in.nextInt();

            if (n == 0) {
                break;
            }

            if (n > a) {
                a = n;
            } else {
                continue;
            }

        }
        System.out.print("Largest number: " + a);
    }
}
