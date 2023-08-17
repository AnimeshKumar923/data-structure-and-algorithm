/*
Author: Animesh Kumar
Date: 16/03/2023 (DD/MM/YYYY)
Purpose: Learning conditionals and loops
Status: Completed Successfully
Question: Calculate Average Marks
*/

package assignment02.intermediate;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float sub_marks,subjects,avg_marks,sum=0;

        System.out.print("Enter total number of subjects: ");
        subjects=in.nextFloat();

        for(int i=1;i<subjects+1;i++){
            System.out.print("Enter marks of subjects "+i+": ");
            sub_marks=in.nextFloat();
            sum=sum+sub_marks;
        }

        avg_marks=(sum/subjects);
        System.out.print("Average marks= "+avg_marks);
    }
}