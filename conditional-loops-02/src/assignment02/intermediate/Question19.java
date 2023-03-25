/*
Author: Animesh Kumar
Date: 25/03/2023 (DD/MM/YYYY)
Purpose: Learning conditionals and loops
Status: Completed successfully
Question: HCF Of Two Numbers Program
*/

package assignment02.intermediate;

import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter two number: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        boolean res = comparison(num1, num2);
        int rem = 1;

        // System.out.println("Result= " + res);

        rem = calcRem(num1, num2, res, rem);

        // System.out.println("R= " + rem);

        while (rem >= 0) {
            if (rem > 0) {
                num1 = rem;
                num2 = num1;
                rem = calcRem(num1, num2, res, rem);

            } else if (rem == 0) {
                boolean check = comparison(num1, num2);
                if (check == false) {
                    int hcf = num1;
                    System.out.println("HCF= " + hcf);
                } else {
                    int hcf = num2;
                    System.out.println("HCF= " + hcf);
                }
                // System.out.println("HCF= " + hcf);
                break;
            }
        }
    }

    // this function does comparison between the two input numbers

    static boolean comparison(int num1, int num2) {
        // if (num1 > num2) {
        // System.out.println(num1 + " is greater");
        // } else {
        // System.out.println(num2 + " is greater");
        // }

        return num1 > num2;
    }

    // this function calculates the remainder between the two numbers

    static int calcRem(int num1, int num2, boolean res, int rem) {
        if (res == true) {
            rem = num1 % num2;
        } else {
            rem = num2 % num1;
        }
        return rem;
    }

}
