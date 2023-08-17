/*
Author: Animesh Kumar
Date: 25/03/2023 (DD/MM/YYYY)
Purpose: Learning conditionals and loops
Status: Completed successfully
Question: Future Investment Value
*/

package assignment02.intermediate;

import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter present value: ");
        double pv = in.nextDouble();

        System.out.print("Enter interest rate: ");
        double interest = in.nextDouble();

        System.out.print("Enter time period (in years): ");
        double years = in.nextDouble();

        double result = calc(pv, interest, years);
        System.out.println("Value is: " + result);

    }

    static double calc(double pv, double interest, double years) {
        double result = pv * (Math.pow((1 + (interest / 100)), years));
        return result;
    }
}
