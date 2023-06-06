import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // int[] arr = new int[5];
        // // input using for loop.
        // // use loop when the task is repetitive.

        // System.out.println("Enter five numbers: ");
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = in.nextInt();
        // }

        // System.out.print("elements of the array are: ");

        // different ways to print:

        // for (int i = 0; i < arr.length; i++) {

        // System.out.print(arr[i] + ",");
        // }
        // System.out.print("]");

        // for (int num : arr) { // for every elements in array, print the element
        // System.out.print(num + " "); // here num represents element of the array.

        // }

        // System.out.println(Arrays.toString(arr)); // displays the elements in
        // brackets and commas.

        // array of objects

        String[] str = new String[3];

        System.out.println("Enter three strings: ");

        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));

        // modifying array elements

        str[1] = "change";

        System.out.println(Arrays.toString(str));
    }
}
