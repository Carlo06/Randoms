import java.util.Scanner;

public class multiply_divide {
   
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int product = multiply();
        System.out.println("The answer is " + product);


        int quotient = divide();

        System.out.println("The answer is " + quotient);

        scan.close();
        
    }

    static int multiply() {
        System.out.println("Please Enter Two Number to multiply ");
        System.out.print("Enter First Number: ");
        int x = scan.nextInt();

        System.out.print("Enter Your Second Number: ");
        int y = scan.nextInt();

        return x * y;
    }

    static int divide() {
        System.out.println("Please Enter Two Number to divide ");
        System.out.print("Enter First Number: ");
        int x = scan.nextInt();

        System.out.print("Enter Your Second Number: ");
        int y = scan.nextInt();

        return x / y;
    }


    

}
