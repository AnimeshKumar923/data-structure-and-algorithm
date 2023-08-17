/*
Author: Animesh Kumar
Date: 05/02/2023 (DD/MM/YYYY)
Purpose: Learning Java syntax and some conditional statements
Status: Completed successfully
Question: Input currency in rupees and output in USD
*/

package assignment;

import java.util.Scanner;

public class Question06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter money in Rupees: ");
        double inr = input.nextFloat();

        double usd = inr * 0.012122586; // usd rate as of 5th Feb, 2023
        System.out.print("USD " + usd);

    }
}
