import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // Q: Take input of 2 numbers and print the sum

        /*
         * 
         * syntax of method
         * 
         * access-modifier(static, here) return_type name(arguments){
         * //body
         * return statement; // statement-type and return_type has to be same
         * }
         * 
         */

        sum2();
        float a = sum1(); // teting things out...
        System.out.println("Sum = " + a);
    }

    static int sum1() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        return sum;
    }

    static void sum2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum = " + sum);
    }
}
