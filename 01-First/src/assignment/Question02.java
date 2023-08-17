/*
Author: Animesh Kumar
Date: 03/02/2023 (DD/MM/YYYY)
Purpose: Learning Java syntax and some conditional statements
Status: Done the second question.
Question: Take name as input and print a greeting message for that particular name.
*/

package assignment;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Namaste " + name + "!");

    }
}
