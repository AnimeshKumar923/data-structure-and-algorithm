/*
Author: Animesh Kumar
Date: 31/03/2023 (DD/MM/YYYY)
Purpose: Learning conditionals and loops
Status: Completed successfully
Question: Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August
*/

package assignment02.intermediate;

import java.util.Scanner;

public class Question25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int august = 31;
        checkEven(august);

    }

    static void checkEven(int august) {
        System.out.print("day = ");
        for (int i = 1; i <= august; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            // else {

            // }

        }
    }
}
