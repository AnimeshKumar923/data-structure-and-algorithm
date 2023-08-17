/*
Author: Animesh Kumar
Date: 22/03/2023 (DD/MM/YYYY)
Purpose: Learning conditionals and loops
Status: Completed Successfully
Question: Armstrong Number In Java
*/

package assignment02.intermediate;

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int num = in.nextInt();

        int check = num, rem = 0;
        double sum = 0;

        while (check != 0) {
            rem = check % 10;
            // sum = sum + (Math.pow(rem, 3));
            sum = sum + (rem * rem * rem);
            check = check / 10;
        }

        if (sum == num) {
            System.out.println(num + " is armstrong");
        } else {
            System.out.println(num + " is NOT armstrong");
        }
    }
}
