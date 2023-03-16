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

        float principle_amt, rate, time, final_amt;

        System.out.println("Enter principle amount: ");
        principle_amt = input.nextFloat();

        System.out.println("Enter rate: ");
        rate = input.nextFloat();

        System.out.println("Enter time (in years): ");
        time = input.nextFloat();

        while (true) {
            // take operator as input
            System.out.println(
                    "Enter 1 to calculate interest annually\nEnter 2 to calculate interest semi-annually\nEnter 3 to calculate interest annually\nEnter 4 to calculate interest annually\nEnter 5 to calculate interest annually\nEnter 6 to calculate interest annually\nor press x/X to exit: ");
            char op = input.next().trim().charAt(0);

            if (op == '1' || op == '2' || op == '3' || op == '4' || op == '5' || op == '6') {

                if (op == '1') {

                } else if (op == '2') {

                } else if (op == '3') {

                } else if (op == '4') {

                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid Operation!!\nEnter a valid operator");
            }

            System.out.println("Final amount is: " + final_amt);
        }
    }
}
