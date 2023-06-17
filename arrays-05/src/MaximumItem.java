import java.util.Arrays;
import java.util.Scanner;

public class MaximumItem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter size of 1-D array: ");
        int size = in.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter elements in array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Elements in array: " + Arrays.toString(arr));

        while (true) {

            // inputArray(); // try creating the third option after learning more
            // concepts...

            System.out.print(
                    "Enter 1 to find Maximum in whole array\nEnter 2 to find Maximum in a given Range\nEnter 3 to input a new array\nEnter 0 to exit program: ");

            int op = in.nextInt();

            if (op == 1) {
                System.out.println("Maximum element = " + max(arr));
            } else if (op == 2) {
                System.out.println("Enter starting range:");
                int startNum = in.nextInt();
                System.out.println("Enter ending range:");
                int endNum = in.nextInt();
                System.out.println("Maximum element in range = " + maxInRange(arr, startNum, endNum));
            } else if (op == 0) {
                break;
            }

        }

    }

    // public static void inputArray() {
    // Scanner in = new Scanner(System.in);

    // System.out.print("Enter size of 1-D array: ");
    // int size = in.nextInt();

    // int[] arr = new int[size];

    // System.out.print("Enter elements in array: ");
    // for (int i = 0; i < arr.length; i++) {
    // arr[i] = in.nextInt();
    // }

    // System.out.println("Elements in array: " + Arrays.toString(arr));
    // }

    static int max(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }

        int maxNum = arr[0]; // let maxNum be the 0th index element...

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
            }
        }
        return maxNum;
    }

    static int maxInRange(int[] arr, int start, int end) {
        int maxNum = arr[start]; // let maxNum be the 0th index element...

        // enter cases for start=0 and end value greater than input array length.

        if (end > start) {
            return -1;
        }

        if (arr == null) {
            return -1;
        }

        for (int i = start - 1; i <= end - 1; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
            }
        }
        return maxNum;
    }
}
