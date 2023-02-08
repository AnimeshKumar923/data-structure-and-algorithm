/*
Author: Animesh Kumar
Date: 08/02/2023 (DD/MM/YYYY)
Purpose: Learning conditionals and loops
Status: In progress
Question: Input a number and print all the factors of that number (use loops).
*/

package assignment02.basic;

import java.util.Scanner;

public class Question22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num=input.nextInt();

        while(n>0){
            int count=0;
            int divisor=1;

            int factor=n%divisor;
            divisor++;
            if(factor==0){
                System.out.print(divisor+" ");
                count++;
            }
        }
    }
}