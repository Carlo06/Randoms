import java.util.Scanner;

public class scam{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        String name;
        System.out.println("What is your Name? ");
        name = scan.nextLine();

        System.out.println("My Name is "+ name);


        int age;
        System.out.println("How old are you? ");
        age = scan.nextInt();

        System.out.println("My age is " + age);

        
    }


} 
