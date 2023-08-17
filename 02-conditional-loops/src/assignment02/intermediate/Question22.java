/*
Author: Animesh Kumar
Date: 29/03/2023 (DD/MM/YYYY)
Purpose: Learning conditionals and loops
Status: Completed successfully
Question: Perfect Number In Java
*/

package assignment02.intermediate;

import java.util.Scanner;

public class Question22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num, sum = 0;
        System.out.print("Enter a number: ");
        num = in.nextInt();

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if (num == sum) {
            System.out.println(num + " is Perfect number");
        } else {
            System.out.println(num + " is NOT Perfect number");
        }

    }
}
