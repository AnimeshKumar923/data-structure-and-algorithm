/*
Author: Animesh Kumar
Date: 06/02/2023 (DD/MM/YYYY)
Purpose: Learning conditionals and loops
Status: Completed successfully
Question: Area Of Triangle
*/

package assignment02.basic;

import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double area;

        System.out.print("Enter base of triangle: ");
        double b = input.nextFloat();

        System.out.print("Enter height of triangle: ");
        double h = input.nextFloat();

        area = (b * h) / 2;

        System.out.println("Area: " + area);
    }
}
