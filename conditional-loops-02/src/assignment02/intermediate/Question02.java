/*
Author: Animesh Kumar
Date: 13/03/2023 (DD/MM/YYYY)
Purpose: Learning conditionals and loops
Status: In progress...
Question: Calculate Electricity Bill
*/

package assignment02.intermediate;

import java.util.Arrays;
import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter total number of appliances: ");
        int appliances = in.nextInt();
        String name;
        int time, watt;
        int month = 30;
        float unit = 0;
        float total_unit = 0;
        float arr[] = new float[appliances];

        for (int i = 0; i < appliances; i++) {
            // System.out.println("Enter name of appliance: ");
            // name = in.next();
            System.out.println("Enter wattage of: ");
            watt = in.nextInt();
            System.out.println("Enter total time the appliance is used (in hrs): ");
            time = in.nextInt();
            System.out.println("days in a month is assumed to be 30");

            unit = (watt * time * month) / 1000;
            arr[i] = unit;

        }
        for (int i = 0; i < appliances - 1; i++) {
            total_unit = arr[i] + arr[i + 1];
            System.out.println("Total unit= " + total_unit);

        } // this block needs work...

        System.out.println("Enter rate of one unit: ");
        float per_unit = in.nextInt();
        float total_bill = total_unit * per_unit;
        System.out.println("Total bill= " + total_bill);

    }
}
