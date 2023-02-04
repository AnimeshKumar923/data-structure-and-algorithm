import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {

        /*
        if (boolean expression T or F)
        {
        // body
        }
        else
        {
        // do this
        }
         */

        /*
        multiple if-else
        if (condition)
        {
        // your code
        }
        else if (condition)
        {
        // your code
        }
        else {
        // if none of the above conditions work, do this.
         */

        //example program

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        int salary = input.nextInt();

        if (salary>20000)
        {
            salary = salary + 5000;
        }

        else if(salary>10000)
        {
            salary = salary + 2000; // it can also be written as salary += 2000
        }

        else
        {
            salary += 1000;
        }

        System.out.print("Your new salary is: " + salary);
    }
}