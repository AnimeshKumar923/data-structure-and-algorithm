import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a fruit name: ");
        String fruit = input.next();

        // fruit.equals("mango"); // it will only check for value and not the
        // 'reference' of the value.
        // fruit.equals("mango") is similar to fruit == "mango"

        // switch (fruit) {
        // case "mango":
        // System.out.println("king of fruits");
        // break;
        // case "apple":
        // System.out.println("red fruit");
        // break;
        // case "orange":
        // System.out.println("round orange fruit");
        // break;
        // default:
        // System.out.println("enter mango, apple or orange");
        // break;
        // }

        // enhanced switch (more prettier)

        switch (fruit) {
            case "mango" -> System.out.println("king of fruits");
            case "apple" -> System.out.println("red fruit");
            case "orange" -> System.out.println("round orange fruit");
            default -> System.out.println("enter mango, apple or orange");
        }
    }
}
