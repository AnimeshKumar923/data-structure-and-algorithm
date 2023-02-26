import java.util.Scanner;

public class BlockScope {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = 10;
        int b = 40;
        String name = "A";

        {
            // int a=78; // already initialized outside the block in the same method, hence
            // you cannot initialized again

            a = 100; // reassign the origin reference variable to some other value.

            System.out.println(a);
            int c = 99;
            name = "Lovish";
            System.out.println(name);

            // values initialized in this block, will remain in block

            // anything initialized outside the block can be used inside the block
            // anything initialized inside the block cannot be used outside the block

            // anything initialized outside the block cannot be initialized inside the
            // block.

        }

        int c = 990; // anything initialized inside the block can be again initialized outside the
        // block

        System.out.println(a);

        System.out.println(name);
        // System.out.println(c); // cannot use outside the block

        // scoping in for loops
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int num = 90;
            a = 10000;
        }
    }
}
