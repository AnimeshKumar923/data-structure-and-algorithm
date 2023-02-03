/*
Author: Animesh Kumar
Date: 03/02/2023 (DD/MM/YYYY)
Purpose: Learning Java syntax and some conditional statements
Status: Stuck in the question.
Question: Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
*/

package assignment;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter first number: ");
        float num1 = input.nextFloat();

        System.out.print("enter second number: ");
        float num2 = input.nextFloat();

        float ans = 0;

        System.out.print("Enter the operation you want to perform: ");
        char operand = input.next().charAt(0);

        if (operand == '+'){
            ans = num1 + num2;
        }
        else if (operand == '-') {
            ans=num1-num2;
        }
        else if (operand == '*') {
            ans=num1*num2;
        }
        else if (operand == '/') {
            ans=num1/num2;
        }

        System.out.print("Result is: " + ans);
    }
}
