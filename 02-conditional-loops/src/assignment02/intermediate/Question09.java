/*
Author: Animesh Kumar
Date: 16/03/2023 (DD/MM/YYYY)
Purpose: Learning conditionals and loops
Status: Completed Successfully
Question: Calculate Batting Average
*/

package assignment02.intermediate;

import java.util.Scanner;

public class Question09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float total_run, batting_avg, outs;

        System.out.print("Enter total run scored: ");
        total_run = in.nextFloat();

        System.out.print("Enter number of times they have been out: ");
        outs = in.nextFloat();

        batting_avg = total_run / outs;
        System.out.println("Batting average= " + batting_avg);
    }
}
