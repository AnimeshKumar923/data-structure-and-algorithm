import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int size = in.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("\n\nSorted array:");

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find max item in the remaining array and swap with correct index

            int lastIndex = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, lastIndex);

            swap(arr, maxIndex, lastIndex);
        }
    }

    static int getMaxIndex(int[] arr, int startIndex, int lastIndex) {
        int maxIndex = startIndex;

        for (int i = startIndex; i <= lastIndex; i++) {
            if (arr[maxIndex] < arr[i]) {
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
