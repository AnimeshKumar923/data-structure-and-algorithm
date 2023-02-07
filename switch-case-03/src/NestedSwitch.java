import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter employee ID: ");
        int empid = in.nextInt();

        System.out.print("Enter department: ");
        String department = in.next();

        // switch (empid) {
        // case 1:
        // System.out.println("employee 01");
        // break;
        // case 2:
        // System.out.println("employee 02");
        // break;
        // case 3:
        // System.out.println("employee 03");
        // switch (department) {
        // case "it":
        // System.out.println("IT Department");
        // break;
        // case "management":
        // System.out.println("Management Department");
        // break;
        // default:
        // System.out.println("enter it/management department!");
        // break;
        // }
        // break;
        // default:
        // System.out.println("Enter employee ID 1-3!");
        // break;
        // }

        // enahanced switch, cleaner code
        switch (empid) {
            case 1 -> System.out.println("emplyoee 01");
            case 2 -> System.out.println("emplyoee 02");
            case 3 -> {
                System.out.println("emplyoee 03");
                switch (department) {
                    case "it" -> System.out.println("IT Department");
                    case "management" -> System.out.println("Management Department");
                    default -> System.out.println("enter it/management department!");
                }

            }
            default -> System.out.println("Enter employee ID 1-3!");
        }
    }
}
