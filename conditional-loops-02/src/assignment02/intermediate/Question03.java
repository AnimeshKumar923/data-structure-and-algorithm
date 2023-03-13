/*
Author: Animesh Kumar
Date: 13/03/2023 (DD/MM/YYYY)
Purpose: Learning conditionals and loops
Status: In progress...
Question: Calculate Average Of N Numbers
*/

package assignment02.intermediate;

import java.util.Scanner;

public class Question03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter total number to find average of: ");
        float total_num = in.nextFloat();
        float num, sum = 0;

        System.out.println("Enter the numbers: ");

        for (int i = 0; i < total_num; i++) {
            num = in.nextFloat();
            sum = sum + num;
        }
        float avg = sum / total_num;
        System.out.println("The average of the inputted numbers is= " + avg);

    }
}
