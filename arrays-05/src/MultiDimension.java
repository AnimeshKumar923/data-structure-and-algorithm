import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*
         * 
         * 1 2 3
         * 4 5 6
         * 7 8 9
         * 
         * 
         * 
         * int [][] arr = new int[3][];
         * 
         * OR
         * 
         * int[][] arr = {
         * {1,2,3}
         * {4,5,6}
         * {7,8,9}
         * };
         * 
         */

        // We can have variable columns stored in memory. Syntax:

        // int[][] arr = {
        // { 1, 2 },
        // { 4, 5, 6 },
        // { 7, 8, 9, 0 }
        // };
        // System.out.println(arr.length); // testing "arr.length" argument. It gives
        // the size of the array. 'OR' it gives the column size of the array.

        // System.out.println(arr[2].length); // the "arr[N].length"(N being a number)
        // argument gives the size of child
        // array which is present at Nth index inside a parent array.

        // INPUTTING IN ARRAY

        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][3];

        System.out.println("Enter array elements");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        // OUTPUT OF ARRAY

        // for (int row = 0; row < arr.length; row++) {
        // for (int col = 0; col < arr[row].length; col++) {
        // System.out.print(arr[row][col] + " ");
        // }
        // System.out.println();
        // }

        // alternate output

        // for (int row = 0; row < arr.length; row++) {
        // System.out.println(Arrays.toString(arr[row]));
        // }

        // Syntax for enhanced for loop:
        // for(dataType variable_name: arr){
        // System.out.println(variable_name);
        // }

        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}
