/*
Author: Animesh Kumar
Date: 15/03/2023 (DD/MM/YYYY)
Purpose: Learning conditionals and loops
Status: Completed Successfully
Question: Calculate Commission Percentage
*/

package assignment02.intermediate;

import java.util.Scanner;

public class Question06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter amount: ");
        float amount = in.nextFloat();

        System.out.print("Enter commission percentage: ");
        float commissionPercentage = in.nextFloat();

        float commission = (commissionPercentage / 100) * amount;

        System.out.println("Commission amount= " + commission);
    }
}
