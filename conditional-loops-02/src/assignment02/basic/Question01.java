/*
Author: Animesh Kumar
Date: 06/02/2023 (DD/MM/YYYY)
Purpose: Learning conditionals and loops
Status: Completed successfully
Question: Area Of Circle
*/

package assignment02.basic;

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius of circle (dimension in which you want the answer): ");
        double r = input.nextFloat();

        double area = 0;

        System.out.println("enter 1 to take value of pi as 3.14\nenter 2 to take value of pi as 22/7: ");
        int option = input.nextInt();

        if (option == 1) {
            area = (22 / 7) * r * r;
        } else if (option == 2) {
            area = (3.14) * r * r;
        } else {
            System.out.println("Please enter a valid option!");
        }
        System.out.println("Area: " + area);

    }
}
