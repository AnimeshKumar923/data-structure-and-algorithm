import java.util.Scanner;

public class CharCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Q: Check whether the given input is uppercase or lowercase

        System.out.print("Enter something: ");
        // System.out.println("output is: " + input.nextLine().trim());

        // .trim() means remove the extra spaces that are at the start of the word

        // String word = input.nextLine(); // experimentation line

        char ch = input.next().trim().charAt(0);

        // System.out.println(ch);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("lowercase");
        } else {
            System.out.println("UPPERCASE");
        }
    }
}
