/*
Author: Animesh Kumar
Date: 16/03/2023 (DD/MM/YYYY)
Purpose: Learning conditionals and loops
Status: Completed Successfully
Question: Compound Interest Java Program
*/

package assignment02.intermediate;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float principle_amt, rate, time, final_amt = 0;

        while (true) {

            System.out.println("Enter principle amount: ");
            principle_amt = input.nextFloat();

            System.out.println("Enter rate: ");
            rate = input.nextFloat();

            System.out.println("Enter time: ");
            time = input.nextFloat();

            System.out.println(
                    "Enter 1 to calculate interest annually\nEnter 2 to calculate interest semi-annually\nEnter 3 to calculate interest quarterly\nEnter 4 to calculate interest monthly\nEnter 5 to calculate interest weekly\nEnter 6 to calculate interest daily\nor press x/X to exit: ");

            char op = input.next().trim().charAt(0);

            if (op == '1' || op == '2' || op == '3' || op == '4' || op == '5' || op == '6') {

                if (op == '1') {
                    final_amt = (float) (principle_amt * (Math.pow((1 + (rate / 100)), time)));
                } else if (op == '2') {
                    final_amt = (float) (principle_amt * (Math.pow((1 + (rate / 200)), 2 * time)));
                } else if (op == '3') {
                    final_amt = (float) (principle_amt * (Math.pow((1 + (rate / 400)), 4 * time)));
                } else if (op == '4') {
                    final_amt = (float) (principle_amt * (Math.pow((1 + (rate / 1200)), 12 * time)));
                } else if (op == '5') {
                    final_amt = (float) (principle_amt * (Math.pow((1 + (rate / 5200)), 52 * time)));
                } else if (op == '6') {
                    final_amt = (float) (principle_amt * (Math.pow((1 + (rate / 36500)), 365 * time)));
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid Operation!!\nEnter a valid operator");
            }
            System.out.println("Final amount= " + final_amt);
        }

    }
}
