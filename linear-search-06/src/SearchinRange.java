import java.util.Scanner;
import java.util.Arrays;

public class SearchinRange {

    static int[] arr;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // System.out.print("Enter size of 1-D array: ");
        // int size = in.nextInt();

        // int[] arr = new int[size];

        // System.out.print("Enter elements in array: ");
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = in.nextInt();
        // }

        // System.out.println("Elements in array: " + Arrays.toString(arr));

        while (true) {

            // inputArray(); // try creating the third option after learning more
            // concepts...

            System.out.print("Enter 1 to input new array\nEnter 2 to search in range\nEnter 0 to exit: ");

            int op = in.nextInt();

            if (op == 2) {
                System.out.println("Enter starting range:");
                int startNum = in.nextInt();
                System.out.println("Enter ending range:");
                int endNum = in.nextInt();
                System.out.println("Enter target element:");
                int targetElement = in.nextInt();

                int res = 0;

                res = searchInRange(arr, startNum, endNum, targetElement);

                if (res == -1) {
                    System.out.println("Element NOT FOUND!");
                    break;

                }

                else {
                    System.out.println("Element " + targetElement + " found at " + res + " position in the array");

                }

                // searchInRange(arr, startNum, endNum, targetElement);

            } else if (op == 1) {
                inputArray();
            } else if (op == 0) {
                break;
            }

        }
    }

    public static void inputArray() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of 1-D array: ");
        int size = in.nextInt();

        arr = new int[size];

        System.out.print("Enter elements in array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Elements in array: " + Arrays.toString(arr));
    }

    static int searchInRange(int[] arr, int start, int end, int target) {
        // enter cases for start=0 and end value greater than input array length.
        int i;

        // if (end > start) {
        // return -1;
        // }

        if (arr == null) {
            return -1;
        }

        for (i = start - 1; i <= end - 1 && i < arr.length; i++) {
            if (target == arr[i]) {
                // System.out.println("Element " + target + " found at " + (i + 1) + " position
                // in the array");
                return (i + 1);
            }
        }
        return -1;
    }

}
