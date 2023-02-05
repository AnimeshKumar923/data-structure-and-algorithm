/*
Author: Animesh Kumar
Date: 03/02/2023 (DD/MM/YYYY)
Purpose: Learning Java syntax and some conditional statements
Status: Done the third question.
Question: Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
*/

package assignment;

import java.util.Scanner;

public class Question03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter principle: ");
        float principle = input.nextFloat();

        System.out.print("Enter rate: ");
        float rate = input.nextFloat();

        System.out.print("Enter time (in years): ");
        float time = input.nextFloat();

        float si = (principle * rate * time) / 100;

        System.out.println("The simple interest calculated is: " + si);
    }
}
