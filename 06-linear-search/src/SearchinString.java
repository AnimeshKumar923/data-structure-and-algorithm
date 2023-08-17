import java.util.Scanner;

public class SearchinString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = in.nextLine();
        System.out.println("Enter character to search: ");
        char target = in.next().trim().charAt(0);

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                System.out.println("Character '" + target + "' found at " + (i + 1) + " position in the string");
            }
        }
    }
}
