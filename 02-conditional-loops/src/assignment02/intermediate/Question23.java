/*
Author: Animesh Kumar
Date: 29/03/2023 (DD/MM/YYYY)
Purpose: Learning conditionals and loops
Status: Completed successfully
Question: Check Leap year Or Not
*/

package assignment02.intermediate;

import java.util.Scanner;

public class Question23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter year: ");
        int year = in.nextInt();
        int check = leapCheck(year);
        if (check == 1) {
            System.out.println("LEAP");
        } else {
            System.out.println("NOT LEAP");
        }

    }

    static int leapCheck(int y) {
        if ((y % 400 == 0) || (y % 100 != 0) && (y % 4 == 0)) {
            return 1;
        } else {
            return 0;
        }
    }
}
