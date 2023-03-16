/*
Author: Animesh Kumar
Date: 16/03/2023 (DD/MM/YYYY)
Purpose: Learning conditionals and loops
Status: In progress...
Question: Compound Interest Java Program
*/

package assignment02.intermediate;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float principle_amt, rate, time, final_amt = 0;

        System.out.println("Enter principle amount: ");
        principle_amt = input.nextFloat();

        System.out.println("Enter rate: ");
        rate = input.nextFloat();

        System.out.println("Enter time: ");
        time = input.nextFloat();

        final_amt = (float) (principle_amt * (Math.pow((1 + rate / 100), time)));

        System.out.println("Final amount= " + final_amt);
    }
}
