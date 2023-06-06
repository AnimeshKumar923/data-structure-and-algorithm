import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];
        // input using for loop.
        // use loop when the task is repetitive.

        System.out.println("Enter five numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print("elements of the array are: ");

        // different ways to print:

        // for (int i = 0; i < arr.length; i++) {

        // System.out.print(arr[i] + ",");
        // }
        // System.out.print("]");

        for (int num : arr) {
            System.out.print(num + " ");

        }
    }
}
