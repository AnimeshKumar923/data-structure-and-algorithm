import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = 0;
        int b = 1;
        System.out.print("Input postion upto which to print the series: ");
        int n = input.nextInt();
        int count = 2;

        System.out.print("the series is: ");

        while (count <= n) {
            int sum;
            sum = a + b;
            a = b;
            b = sum;
            count++;
            System.out.print(sum + " ");

        }
        System.out.println("the " + n + "th fibonacci number is: " + b);

    }
}
