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
