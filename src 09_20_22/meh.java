import java.util.Scanner;

public class meh {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String message; 
        System.out.println("Enter your Message ");
        message = scan.nextLine();

        System.out.println("I Love " + message);


        int number;

        System.out.println("What is your favorite number? ");
        number = scan.nextInt();

        System.out.println("My favorite Number is " + number);
    
    }
}
