/*
Author: Animesh Kumar
Date: 29/03/2023 (DD/MM/YYYY)
Purpose: Learning conditionals and loops
Status: Completed successfully
Question: Java Program Vowel Or Consonant
*/

package assignment02.intermediate;

import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char letter = in.next().charAt(0);
        boolean caseSense;

        caseSense = (letter == 'A' || letter == 'a' || letter == 'E' || letter == 'e' || letter == 'I' || letter == 'i'
                || letter == 'O' || letter == 'o' || letter == 'U' || letter == 'u');

        if (caseSense) {
            System.out.println(letter + " is vowel");
        } else {
            System.out.println(letter + " is consonant");
        }

    }
}
