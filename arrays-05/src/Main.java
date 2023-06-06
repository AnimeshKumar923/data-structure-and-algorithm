import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // syntax for array
        // datatype[] variable_name = new datatype[size];
        // example for roll number

        int[] roll = new int[20];

        int[] rollno;// declaration of array, rollno is getting defined in stack

        rollno = new int[20]; // initialization: actually here object is being created in the heap.
        System.out.println("1st element = " + rollno[1]);

        // declaring a string array
        String[] arr = new String[5];
        System.out.println("1st element = " + arr[0]);

        // every reference variable before assignment is having value of null type.
        // "null" is a special value which can be assigned to any reference type...
        // 'null' is the by default value of a reference variable.
        // primitives can't be assigned 'null'.
        // you can typecast null to any type as well but can't do it for primitives.
        // 'null' is a literal.

        // you can't do something like this:
        // null a = null; //it will throw an error

        // in Java, primitives are stored in stack memory.
        // all other objects, classes, etc. are stored are stored in the heap memory.
        // refer notes for diagrams and visualization.

    }
}
