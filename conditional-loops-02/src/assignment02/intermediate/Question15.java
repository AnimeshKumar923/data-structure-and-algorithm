/*
Author: Animesh Kumar
Date: 23/03/2023 (DD/MM/YYYY)
Purpose: Learning conditionals and loops
Status: Completed Successfully
Question: Find Ncr & Npr
*/

package assignment02.intermediate;

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter n: ");
        int nNumber = in.nextInt();

        System.out.print("Enter r: ");
        int rNumber = in.nextInt();

        int nFactResult = nFact(nNumber);
        System.out.println(nFactResult);

        int rFactResult = rFact(rNumber);
        System.out.println(rFactResult);

        int difference = nNumber - rNumber;
        int differenceResult = nFact(difference);
        System.out.println("difference= " + differenceResult);

        int nPr, nCr;

        System.out.println("Enter 1 to calculate nCr\nEnter 2 to calculate nPr\nEnter 3 to calculate both at once: ");

        int op = in.nextInt();

        switch (op) {
            case 1:

            {
                nCr = nFactResult / (differenceResult * rFactResult);
                System.out.println("nCr =" + nCr);
                break;
            }

            case 2:

            {
                nPr = nFactResult / differenceResult;
                System.out.println("nPr =" + nPr);
                break;
            }

            case 3:

            {
                nPr = nFactResult / differenceResult;
                System.out.println("nPr =" + nPr);
                nCr = nFactResult / (differenceResult * rFactResult);
                System.out.println("nCr =" + nCr);
                break;
            }

            default:
                break;
        }

    }

    static int nFact(int num) {
        // Scanner in = new Scanner(System.in);

        // System.out.print("Enter n: ");
        // int num = in.nextInt();
        int fact = 1;
        int i = 1;

        while (i <= num) {
            fact = fact * i;
            i++;
        }

        return fact;
    }

    static int rFact(int num) {
        // Scanner in = new Scanner(System.in);

        // System.out.print("Enter r: ");
        // int num = in.nextInt();
        int fact = 1;
        int i = 1;

        while (i <= num) {
            fact = fact * i;
            i++;
        }

        return fact;

    }
}
