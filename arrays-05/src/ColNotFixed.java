public class ColNotFixed {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 5 },
                { 4, 8 },
                { 5, 4, 8, 9, 6 }
        };

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        
        }
    }
}
