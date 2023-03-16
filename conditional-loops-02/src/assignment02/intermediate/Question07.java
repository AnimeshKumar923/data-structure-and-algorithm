/*
Author: Animesh Kumar
Date: 15/03/2023 (DD/MM/YYYY)
Purpose: Learning conditionals and loops
Status: Completed Successfully
Question: Power In Java
*/

package assignment02.intermediate;

import java.util.Scanner;

public class Question07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number to find the power of: ");
        double num = in.nextDouble();

        System.out.print("Enter the power to be raised: ");
        double power = in.nextDouble();
        double sum = 1, result = 1;

        for (int i = 0; i < power; i++) {
            if (power == 0) {
                sum = 1;
                System.out.println("Ans= " + sum);
                break;
            }

            if (power == 1) {
                sum = num * sum;
                System.out.println("Ans= " + sum);
                break;
            }

            result = result * num;
        }
        if (power != 1) {
            System.out.println("Ans= " + result);
        }

    }
}
