/*
Author: Animesh Kumar
Date: 16/03/2023 (DD/MM/YYYY)
Purpose: Learning conditionals and loops
Status: Completed Successfully
Question: Calculate CGPA Java Program
*/

package assignment02.intermediate;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // CGPA = (Grades in all Subjects) / (Total Number of Subjects)
        // CGPA= 9.5 × CGPA

        float total_sub_cgpa = 0, sub_cgpa;

        System.out.println("Enter total number of subjects: ");
        int subjects = in.nextInt();

        for (int i = 1; i < subjects + 1; i++) {
            System.out.println("Enter grade in subject " + i + ": ");
            sub_cgpa = in.nextFloat();
            total_sub_cgpa = total_sub_cgpa + sub_cgpa;

        }
        float cgpa = total_sub_cgpa / subjects;
        float final_cgpa = (float) (cgpa * 9.5);

        System.out.println("Your CGPA percentage is: " + final_cgpa);
    }
}
