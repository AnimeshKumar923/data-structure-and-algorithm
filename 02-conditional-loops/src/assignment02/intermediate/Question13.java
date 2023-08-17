/*
Author: Animesh Kumar
Date: 22/03/2023 (DD/MM/YYYY)
Purpose: Learning conditionals and loops
Status: Completed Successfully
Question: Sum Of N Numbers
*/

package assignment02.intermediate;

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter total number to enter: ");
        int numbers = in.nextInt();
        int sum = 0;

        System.out.println("Enter numbers: ");

        for (int i = 0; i < numbers; i++) {
            int num = in.nextInt();
            sum = sum + num;
        }

        System.out.println("Total sum= " + sum);

    }
}
