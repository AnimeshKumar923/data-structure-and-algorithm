package assignment;

import java.util.Scanner;

public class Question05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Take 2 numbers as input and print the largest number

        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();

        int max = a;

        if (b > max) {
            max = b;
        }

        System.out.println(max);
    }
}