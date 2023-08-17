/*
Author: Animesh Kumar
Date: 15/03/2023 (DD/MM/YYYY)
Purpose: Learning conditionals and loops
Status: Completed Successfully
Question: Calculate Distance Between Two Points
*/

package assignment02.intermediate;

import java.util.Scanner;

public class Question05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter x-coordinate of first point: ");
        float x1 = in.nextFloat();
        System.out.print("Enter y-coordinate of first point: ");
        float y1 = in.nextFloat();

        System.out.print("Enter x-coordinate of second point: ");
        float x2 = in.nextFloat();
        System.out.print("Enter y-coordinate of second point: ");
        float y2 = in.nextFloat();

        float sum = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));
        System.out.println(Math.sqrt(sum));
    }
}
