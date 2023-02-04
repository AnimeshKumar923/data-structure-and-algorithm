import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

// public --> it means that this file content is accessible to any other file. There are other states as well which are designed to provide security to the whole application if we're designing one

// static --> couldn't understand much. Will see more detail in OOP

// void --> function which will not return any value. Will see more in functions section

// main --> it is from where where the main execution of the code is started.

// (String[] args) --> it can simply be understood as a command line argument.

// public class Main --> here te "Main" should be replaced by the file name in which we are building it. Here the file name is 'Main' hence it is it's name.

        Scanner input = new Scanner(System.in);
//        System.out.println(input.nextInt()); //takes input from user as integer
        System.out.println(input.nextLine()); //takes input from user as string with spaces as well
    }

}