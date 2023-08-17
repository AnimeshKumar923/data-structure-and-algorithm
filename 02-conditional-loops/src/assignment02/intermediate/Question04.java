/*
Author: Animesh Kumar
Date: 15/03/2023 (DD/MM/YYYY)
Purpose: Learning conditionals and loops
Status: Completed Successfully
Question: Calculate Discount Of Product
*/

package assignment02.intermediate;

import java.util.Scanner;

public class Question04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float price, discount;
        System.out.print("Enter product price: ");
        price = in.nextFloat();

        System.out.print("Enter discount in percentage: ");
        discount = in.nextFloat();

        float discount_price = price - ((discount / 100) * price);
        System.out.println("Discounted price= " + discount_price);
    }
}
