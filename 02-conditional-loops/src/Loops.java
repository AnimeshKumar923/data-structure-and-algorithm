import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        loops are used to do a particular task again and again

        /*

        Syntax of 'for' loop

        for (initialization; condition; increment/decrement)
        {
        // your code
        }

         */

//        Q: Print numbers from 1 to 5

        /*
        for (int num = 1; num <= 5; num++)
        {
            System.out.println(num);
        }
        */

//        Q: Print numbers from 1 to n
        /*
        System.out.print("enter number upto print: ");
        int n = input.nextInt();

        for (int num = 0; num <= n; num++) {
            System.out.print(num + " ");
        }
        */

//        while loop
//        syntax of 'while' loop

//        while (condition)
//        {
//            //your code
//        }

//        int num = 1;
//        while (num <= 5)
//        {
//            System.out.print(num + " ");
//            num+=1;

            /*
            if the numbers of iterations are known, then use 'for' loop.
            if the numbers of iterations are not known, then use 'while' loop
             */

//        do while loop
//        the code inside do-while loop is executed at-least once
        int n = 1;
        do {
            System.out.println(n);
            n++;
        } while (n <= 5);

    }
}
