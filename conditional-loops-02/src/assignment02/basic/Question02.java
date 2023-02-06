/*
Author: Animesh Kumar
Date: 06/02/2023 (DD/MM/YYYY)
Purpose: Learning conditionals and loops
Status: Stuck. Answer is always zero.
Question: Area Of Triangle
*/

package assignment02.basic;

import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base of triangle: ");
        double b = input.nextFloat();

        System.out.print("Enter height of triangle: ");
        double h = input.nextFloat();

        double area = 0;

        area = (b * h * (1 / 2));

        System.out.println("Area: " + area);
    }
}
