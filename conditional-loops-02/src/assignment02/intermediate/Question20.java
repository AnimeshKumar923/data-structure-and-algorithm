/*
Author: Animesh Kumar
Date: 29/03/2023 (DD/MM/YYYY)
Purpose: Learning conditionals and loops
Status: Completed successfully
Question: LCM Of Two Numbers
*/

/*
                                Algorithm

To find the LCM of two numbers in C, we will assume the two numbers are num1 and num2 and that they are positive integers. We will use the following approach:

START

Step 1: Initialize two variables for num1(7) and num2(35).

Step 2: Find and store the maximum of num1 and num2 to a separate variable, ‘max’(35).

Step 3: If max is divisible by num1(35 % 7 == 0?) and num2(35 % 35 == 0?), max is the LCM(35), hence print it.

Step 4: If not divisible, then increment max by 1, and go to step 3 until a number has been printed. Repeat the process of 3->4->3 until a max value is found that satisfies the constraints.

STOP

 */

package assignment02.intermediate;

import java.util.Scanner;

public class Question20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1, num2, max, lcm;
        System.out.print("Enter number 1: ");
        num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        num2 = in.nextInt();

        if (num1 > num2) {
            max = num1;
        } else {
            max = num2;
        }

        while (true) {
            if (max % num1 == 0 && max % num2 == 0) {
                lcm = max;
                break;
            } else {
                max++;
            }
        }
        System.out.println("LCM = " + lcm);
    }
}
