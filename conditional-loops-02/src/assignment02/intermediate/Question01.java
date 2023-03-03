/*
Author: Animesh Kumar
Date: 03/03/2023 (DD/MM/YYYY)
Purpose: Learning conditionals and loops
Status: Completed successfully
Question: Factorial program in Java
*/

package assignment02.intermediate;

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number to find factorial: ");
        int num = in.nextInt();
        int res = fact(num);
        System.out.println(res);
    }

    static int fact(int num) {
        int f = 1;
        if (num == 0) {
            System.out.println(1);
        } else {
            for (int i = 1; i <= num; i++) {
                f = f * i;
            }
        }
        return f;
    }
}
