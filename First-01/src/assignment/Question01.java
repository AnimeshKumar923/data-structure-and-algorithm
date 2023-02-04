/*
Author: Animesh Kumar
Date: 03/02/2023 (DD/MM/YYYY)
Purpose: Learning Java syntax and some conditional statements
Status: Done the first assignment
Question: Write a program to print whether a number is even or odd, also take input from the user.
*/

package assignment;

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int num = input.nextInt();

        if (num>=0){
            if (num%2==0){
                System.out.println("input number is: " + num);
                System.out.println("the number is even");
            }
            else {
                System.out.println("input number is: " + num);
                System.out.println("the number is odd");
            }
        }
        else {
            System.out.println("please enter a positive integer");
        }

    }
}
//trying to understand the folder system also