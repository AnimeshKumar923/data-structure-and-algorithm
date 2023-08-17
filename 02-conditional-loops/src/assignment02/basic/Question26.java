/*
Author: Animesh Kumar
Date: 09/02/2023 (DD/MM/YYYY)
Purpose: Learning conditionals and loops
Status: Completed Succesfully
Question: Addition Of Two Numbers
*/

package assignment02.basic;

import java.util.Scanner;

public class Question26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int a = in.nextInt();

        System.out.print("Enter 2nd number: ");
        int b = in.nextInt();

        int sum = a + b;

        System.out.print("Sum = " + sum);
    }
}
