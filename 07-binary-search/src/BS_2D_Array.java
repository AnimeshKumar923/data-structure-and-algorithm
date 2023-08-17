import java.util.Arrays;

// sorted array in row-wise and column-wise manner
public class BS_2D_Array {
    public static void main(String[] args) {
        int[][] arr = {
                { 10, 20, 30 },
                { 15, 25, 35 },
                { 18, 29, 39 }
        };

        System.out.println(Arrays.toString(binarySearch(arr, 39)));
    }

    static int[] binarySearch(int[][] matrix, int target) {
        int r = 0;
        int c = matrix.length - 1;

        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[] { r, c };
            } else if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }

        return new int[] { -1, -1 };
    }
}
