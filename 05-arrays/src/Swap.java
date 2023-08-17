import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter size of 1-D array: ");
        int size = in.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter elements in array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Elements before swap: " + Arrays.toString(arr));

        // System.out.println("Enter elements position to interchange: ");
        // int element1 = in.nextInt();
        // int element2 = in.nextInt();
        // swap(arr, element1 - 1, element2 - 1);

        // System.out.println(Arrays.toString(arr));

        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // REVERSING AN ARRAY

    static void reverseArray(int[] arr) { // understand the logic used here clearly...
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // swap
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
